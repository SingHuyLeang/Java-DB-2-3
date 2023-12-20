package Home.Controller;

import Components.AlertMessager;
import Database.DBConnector;
import Home.Model.EmployeeModel;
import java.sql.*;

public class EmployeeController extends DBConnector{
    PreparedStatement ps;
    ResultSet rs;
    
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
