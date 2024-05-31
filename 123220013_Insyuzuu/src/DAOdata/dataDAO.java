/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOdata;
import java.sql.*;
import java.util.*;
import koneksi.connector;
import model.*;
import DAOImplement.dataimplement;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author PC PRAKTIKUM
 */
public class dataDAO implements dataimplement{
    Connection connection;
    
    final String select = "SELECT * FROM datahp";
    final String insert = "INSERT INTO datahp (merk, brand, chip) VALUES (?, ?,?);";
    final String update = "UPDATE datahp SET name=?, path=?, writing=?, coding=?, interview=?, score=? WHERE name=?";
    final String delete = "delete from data where name=?";
    
    public dataDAO(){
        connection = connector.connection();
    }
    @Override
    public void insert(data p) {
        PreparedStatement statement = null;
        try{
            statement = connection.prepareStatement(insert, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, p.getName());
            statement.setString(2, p.getPath());
            statement.setInt(3, (int) p.getWriting());
            statement.setInt(4, (int) p.getCoding());
            statement.setInt(5, (int) p.getInterview());
            statement.executeUpdate();
            ResultSet rs = statement.getGeneratedKeys();
            while(rs.next()){
               
            }
        }catch(SQLException ex){
            ex.printStackTrace();
            
        }finally{
            try{
                statement.close();
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }
    @Override
    public void update(data p) {
        PreparedStatement statement = null;
         try{
            statement = connection.prepareStatement(update);
            statement.setString(1, p.getName());
            statement.setString(2, p.getPath());
            statement.setInt(3, (int) p.getWriting());
            statement.setInt(4, (int) p.getCoding());
            statement.setInt(5, (int) p.getInterview());
            statement.executeUpdate();
            while(rs.next()){
               
            }
        }catch(SQLException ex){
            ex.printStackTrace();
            
        }finally{
            try{
                statement.close();
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }
    }
    
     @Override
        public List<data> getAll() {
        List<data> dp = null;
        try{
            dp = new ArrayList<data>();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(select);
            while(rs.next()){
                data a = new data();
                a.setName(rs.getString("name"));
                a.setPath(rs.getString("path"));
                a.setWriting(rs.getInt("writing"));
                a.setCoding(rs.getInt("coding"));
                a.setInterview(rs.getInt("interview"));
                dp.add(a);
            }
            
        }catch(SQLException ex){
            Logger.getLogger(dataDAO.class.getName()).log(Level.SEVERE, null,ex);
        }
        return dp;
    }
    
    
    
}
