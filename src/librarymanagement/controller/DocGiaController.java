package librarymanagement.controller;

import java.sql.*;
import java.util.ArrayList;
import librarymanagement.controller.ConnectDataBase;
import librarymanagement.model.DocGia;


public class DocGiaController {
    Connection connection = null; 

    public DocGiaController() {
    }
    
    public ArrayList<DocGia> getDocGia(){
        ArrayList<DocGia> docGiaList = new ArrayList<DocGia>();
        connection = ConnectDataBase.getConnection(); 
        String sql = "SELECT * FROM docgia";
        Statement stm = null; 
        try {
            stm = connection.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while(rs.next()){
                DocGia dg = new DocGia(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
                docGiaList.add(dg);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                stm.close();
                connection.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return docGiaList;
    }
    
    public void addDocGia(DocGia b){
        connection = ConnectDataBase.getConnection(); 
        String sql = "INSERT INTO docgia VALUES (?,?,?,?)"; 
        PreparedStatement stm = null; 
        try{
            stm = connection.prepareStatement(sql); 
            stm.setString(1, b.getIdDocGia());
            stm.setString(2, b.getTenDocGia());
            stm.setString(3, b.getSoDienthoai());
            stm.setString(4, b.getGioiTinh());;
            stm.execute();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try {
                stm.close();
                connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }    
    }
    
    public void deleteDocGia(String idDocGia){
        connection = ConnectDataBase.getConnection(); 
        String sql = "DELETE FROM docgia WHERE idDocGia = ?"; 
        PreparedStatement stm = null; 
        try {
            stm = connection.prepareStatement(sql);
            stm.setString(1, idDocGia);
            stm.execute();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                stm.close();
                connection.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
     
    public DocGia getDocGiaById(String idDocGia) {
        Connection connection = ConnectDataBase.getConnection();
        String sql = "SELECT * FROM docgia WHERE idDocGia = ?";
        PreparedStatement stm = null;
        DocGia docGia = null;

        try {
            stm = connection.prepareStatement(sql);
            stm.setString(1, idDocGia);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                docGia = new DocGia(rs.getString("idDocGia"), rs.getString("nameDocGia"), rs.getString("phone"), rs.getString("gender"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (stm != null) stm.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return docGia;
    }
}
