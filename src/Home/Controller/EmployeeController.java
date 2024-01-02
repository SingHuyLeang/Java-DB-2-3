package Home.Controller;

import Components.AlertMessager;
import Database.DBConnector;
import Home.Model.EmployeeModel;
import java.sql.*;
import java.util.*;

public class EmployeeController extends DBConnector {

    PreparedStatement ps;
    ResultSet rs;

    public Collection<EmployeeModel> getData() {
        List<EmployeeModel> list = new ArrayList<>();
        try {
            String sql = "SELECT * FROM `tbl_employee`";
            ps = connector("db_employee").prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                EmployeeModel emp = new EmployeeModel(
                        rs.getInt("id"),
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

    public void addEmpToDB(EmployeeModel employee) {
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
            if (i > 0) {
                System.out.println("Add employee to db successfuly");
            } else {
                AlertMessager.error("Employee can't be add");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateEmpDB(EmployeeModel employee) {
        try {
            String sql = "UPDATE `tbl_employee` SET `name`=?,`gender`=?,`age`=?,`position`=?,`salary`=?,`contact`=?,`image`=?,`date`=? WHERE id = ?";
            ps = connector("db_employee").prepareStatement(sql);
            ps.setString(1, employee.getName());
            ps.setString(2, employee.getGender());
            ps.setInt(3, employee.getAge());
            ps.setString(4, employee.getPosition());
            ps.setDouble(5, employee.getSalary());
            ps.setString(6, employee.getContact());
            ps.setString(7, employee.getImage());
            ps.setString(8, employee.getDate());
            
            ps.setInt(9, employee.getId());
            
            int i = ps.executeUpdate();
            if (i>0) {
                AlertMessager.success("Update Success");
            }else{
                AlertMessager.error("Update not Success");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void deleteEmp(int id){
        try {
            String sql = "DELETE FROM `tbl_employee` WHERE `id`=?";
            ps = connector("db_employee").prepareStatement(sql);
            ps.setInt(1, id);
            int i = ps.executeUpdate();
            if (i>0) {
                AlertMessager.success("Delete Success");
            }else{
                AlertMessager.error("Delete not Success");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
    }
    
    public int getTotalEmp(){
        int count = 0;
        try {
            String sql = "SELECT `id` FROM `tbl_employee`";
            ps = connector("db_employee").prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()){
                count++;
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return count;
    }
    public int getTotalMale(){
        int count = 0;
        try {
            String sql = "SELECT `id` FROM `tbl_employee` WHERE `gender`=\"Male\"";
            ps = connector("db_employee").prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()){
                count++;
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return count;
    }
    public int getTotalFemale(){
        int count = 0;
        try {
            String sql = "SELECT `id` FROM `tbl_employee` WHERE `gender`=\"Female\"";
            ps = connector("db_employee").prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()){
                count++;
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return count;
    }
    
    public double getTotalSalary(){
        double count = 0;
        try {
            String sql = "SELECT `salary` FROM `tbl_employee`";
            ps = connector("db_employee").prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()){
                count+=rs.getDouble(1);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return count;
    }
    
}
