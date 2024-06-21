
package librarymanagement.model;

import java.util.ArrayList;
import librarymanagement.controller.LoginController;
import librarymanagement.view.LoginForm;
import librarymanagement.view.*;


public class Main {
    private ArrayList<Book> bookList; 

    public Main() {
        this.bookList = new ArrayList<Book>();
    }

    public Main(ArrayList<Book> bookList) {
        this.bookList = bookList;
    }

    public ArrayList<Book> getBookList() {
        return bookList;
    }

    public void setBookList(ArrayList<Book> bookList) {
        this.bookList = bookList;
    }

    @Override
    public String toString() {
        return "Main{" + "bookList=" + bookList + '}';
    }
    
    public void addBook(Book book){
        this.bookList.add(book);
    }
    
    public void deleteBook(Book book){
        this.bookList.remove(book);
    }
    
    public void updateBook(Book book){
        this.deleteBook(book);
        this.addBook(book);
    }
    
    public static void main(String[] args) {
        LoginForm loginView = new LoginForm();
        LoginController loginController = new LoginController(loginView);
        loginController.showLoginView();  // Hiển thị cửa sổ đăng nhập
    }   
}
