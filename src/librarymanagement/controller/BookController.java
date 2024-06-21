
package librarymanagement.controller;

import java.sql.*; 
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import librarymanagement.model.Book;

public class BookController {
    Connection connection = null; 

    public BookController() {
    }
    
    public ArrayList<Book> getBookList(){
        ArrayList<Book> bookList = new ArrayList<Book>();
        connection = ConnectDataBase.getConnection();
        String sql = "SELECT * FROM book";
        Statement stm = null; 
        try {
            stm = connection.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while(rs.next()){
                Book b = new Book(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));
                bookList.add(b);
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
        return bookList;
    }


public ArrayList<Book> showBookSearch(String searchKey) {
    ArrayList<Book> bookList = new ArrayList<>();
    String sql = "SELECT * FROM book WHERE titleBook LIKE ?";
    
    try (Connection connection = ConnectDataBase.getConnection();
         PreparedStatement stm = connection.prepareStatement(sql)) {
        
        // Thiết lập tham số cho PreparedStatement
        stm.setString(1, "%" + searchKey + "%");
        
        // Thực thi truy vấn
        try (ResultSet rs = stm.executeQuery()) {
            while (rs.next()) {
                // Tạo đối tượng Book từ dữ liệu của mỗi hàng kết quả
                Book b = new Book(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));
                bookList.add(b);
            }
        }
        
    } catch (SQLException e) {
        e.printStackTrace();
    }
    
    return bookList;
}


    public void addBoook(Book b){
        connection = ConnectDataBase.getConnection(); 
        String sql = "INSERT INTO book VALUES (?,?,?,?,?,?)"; 
        PreparedStatement stm = null; 
        try{
            stm = connection.prepareStatement(sql); 
            stm.setString(1, b.getIdBook());
            stm.setString(2, b.getTitleBook());
            stm.setString(3, b.getAuthor());
            stm.setString(4, b.getPublisher());
            stm.setString(5, b.getYearPublicationBook());
            stm.setString(6, b.getSoLuongBook());
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
    
    public void deleteBook(String idBook){
        connection = ConnectDataBase.getConnection(); 
        String sql = "DELETE FROM book WHERE idBook = ?"; 
        PreparedStatement stm = null; 
        try {
            stm = connection.prepareStatement(sql);
            stm.setString(1, idBook);
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
    
    
//    public ArrayList<Book> showBookSearch(String searchKey){
//        ArrayList<Book> bookList = new ArrayList<Book>();
//        connection = ConnectDataBase.getConnection();
//        String sql ="call sql_searchBook(?)";
//        PreparedStatement stm = null; 
//        ResultSet rs = null; 
//        try {
//            stm = connection.prepareStatement(sql);
//            stm.setString(1,"%" + searchKey + "%");
//            stm.execute();
//            rs = stm.executeQuery();
//            while(rs.next()){
//                Book books = new Book(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));
//                bookList.add(books);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                stm.close();
//                connection.close();
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//        
//        return bookList;
//        
//    }
    
    
}
