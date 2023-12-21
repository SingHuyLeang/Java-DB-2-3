package Home.Controller;

import Components.AlertMessager;
import Database.DBConnector;
import Home.Model.EmployeeModel;
import java.sql.*;
import java.util.*;

public class EmployeeController extends DBConnector{
    PreparedStatement ps;
    ResultSet rs;
    
    public Collection<EmployeeModel> getData(){
        List<EmployeeModel> list = new ArrayList<>();
        try {
            String sql = "SELECT * FROM `tbl_employee`";
            ps = connector("db_employee").prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                EmployeeModel emp = new EmployeeModel(
                        rs.getString("name"),
                        rs.getString("gender"),
                        rs.getInt("age"),
                        rs.getString("position"),
                        rs.getDouble("salary"),
                        rs.getString("contact"),
                        rs.getString("image"),
                        rs.getString("date")
                );
                list.add(emp);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public void addEmpToDB(EmployeeModel employee){
        try {
            String sql = "INSERT INTO `tbl_employee`(`name`, `gender`, `age`, `position`, `salary`, `contact`, `image`, `date`) VALUES (?,?,?,?,?,?,?,?)";
            ps = connector("db_employee").prepareStatement(sql);
            ps.setString(1, employee.getName());
            ps.setString(2, employee.getGender());
            ps.setInt(3, employee.getAge());
            ps.setString(4, employee.getPosition());
            ps.setDouble(5, employee.getSalary());
            ps.setString(6, employee.getContact());
            ps.setString(7, employee.getImage());
            ps.setString(8, employee.getDate());
            
            int i = ps.executeUpdate();
            if (i>0) {
                System.out.println("Add employee to db successfuly");
            } else {
                AlertMessager.error("Employee can't be add");
            }
        } catch (SQLException e) {
                e.printStackTrace();
        }
    }
}
