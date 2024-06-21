package librarymanagement.database;

import java.sql.*;
import java.sql.Connection;
import librarymanagement.controller.ConnectDataBase;
import java.sql.ResultSet;

public class ThongKeDao {
    Connection connection = null; 
    
    public ThongKeDao() {
    }
    
    public int getSoLuongSach() {
        int soLuong = 0;
        Connection connection = ConnectDataBase.getConnection();
        String sql = "SELECT SUM(soluongBook) FROM book";
        try (Statement stmt = connection.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            if (rs.next()) {
                soLuong = rs.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return soLuong;
    }

    public int getSoLuongDocGia() {
        int soLuong = 0;
        Connection connection = ConnectDataBase.getConnection();
        String sql = "SELECT COUNT(*) FROM docgia";
        try (Statement stmt = connection.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            if (rs.next()) {
                soLuong = rs.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return soLuong;
    }

    public int getSoLuongSachDangMuon() {
        int soLuong = 0;
        Connection connection = ConnectDataBase.getConnection();
        String sql = "SELECT COUNT(*) FROM eventmuontra WHERE statusEvent IN ('đang mượn', 'quá hạn')";
        try (Statement stmt = connection.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            if (rs.next()) {
                soLuong = rs.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return soLuong;
    }

    public int getSoLuongSachQuaHan() {
        int soLuong = 0;
        Connection connection = ConnectDataBase.getConnection();
        String sql = "SELECT COUNT(*) FROM eventmuontra WHERE statusEvent = 'quá hạn'";
        try (Statement stmt = connection.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            if (rs.next()) {
                soLuong = rs.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return soLuong;
    }

}
