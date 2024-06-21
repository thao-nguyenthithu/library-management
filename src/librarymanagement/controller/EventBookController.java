
package librarymanagement.controller;

import java.sql.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import librarymanagement.model.Book;
import librarymanagement.model.EventMuonTra;
import librarymanagement.model.DocGia;


public class EventBookController {
    Connection connection = null; 

    public EventBookController() {
    }

    public ArrayList<EventMuonTra> getEventMuonList(){
        ArrayList<EventMuonTra> eventList = new ArrayList<EventMuonTra>();
        connection = ConnectDataBase.getConnection(); 
        String sql = "SELECT idDocGia, idBook, ngayMuon, ngayHenTra, statusEvent FROM eventmuontra";
        Statement stm = null; 
        try {
            stm = connection.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while(rs.next()){
                EventMuonTra evt = new EventMuonTra(
                rs.getString("idDocGia"), 
                rs.getString("idBook"), 
                rs.getString("ngayMuon"),
                rs.getString("ngayHenTra"),
                null,
                rs.getString("statusEvent"));
                eventList.add(evt);
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
        return eventList;
    }
    
    
    public void addEventMuonSach(EventMuonTra evt) {
        connection = ConnectDataBase.getConnection(); 
        String sql = "INSERT INTO eventmuontra (idDocGia, idBook, ngayMuon, ngayHenTra, statusEvent) VALUES (?, ?, ?, ?, ?)"; 
        PreparedStatement stm = null; 
        try{
            stm = connection.prepareStatement(sql); 
            stm.setString(1, evt.getIdDocGia());
            stm.setString(2, evt.getIdSach());
            stm.setString(3, evt.getNgayMuon());
            stm.setString(4, evt.getNgayHenTra());;
            stm.setString(5, evt.getStatus());;           
            stm.executeUpdate();
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

    public ArrayList<EventMuonTra> getEventTraList() {
        ArrayList<EventMuonTra> eventList = new ArrayList<EventMuonTra>();
        connection = ConnectDataBase.getConnection(); 
        String sql = "SELECT idDocGia, idBook, ngayMuon, ngayHenTra, ngayTra, statusEvent FROM eventmuontra";
        Statement stm = null; 
        try {
            stm = connection.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while(rs.next()){
                EventMuonTra evt = new EventMuonTra(
                rs.getString("idDocGia"), 
                rs.getString("idBook"), 
                rs.getString("ngayMuon"), 
                rs.getString("ngayHenTra"),
                rs.getString("ngayTra"),
                rs.getString("statusEvent"));
                eventList.add(evt);
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
        return eventList;
    }
    
    public void updateEventMuonTra(EventMuonTra evt) {
        Connection connection = null;
        PreparedStatement pstmt = null;
        String sql = "UPDATE eventmuontra SET ngayTra = ?, statusEvent = ? WHERE idDocGia = ? AND idBook = ? AND ngayMuon = ?";
        try {
            connection = ConnectDataBase.getConnection();
            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, evt.getNgayTra());
            pstmt.setString(2, evt.getStatus());
            pstmt.setString(3, evt.getIdDocGia());
            pstmt.setString(4, evt.getIdSach());
            pstmt.setString(5, evt.getNgayMuon());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstmt != null) pstmt.close();
                if (connection != null) connection.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    
    
}
