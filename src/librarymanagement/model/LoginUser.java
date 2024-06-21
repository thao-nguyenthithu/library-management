/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymanagement.model;

/**
 *
 * @author thaon
 */
public class LoginUser {
    private String nameLogin; 
    private String passLogin; 

    public LoginUser() {
    }

    public LoginUser(String nameLogin, String passLogin) {
        this.nameLogin = nameLogin;
        this.passLogin = passLogin;
    }

    public String getNameLogin() {
        return nameLogin;
    }

    public void setNameLogin(String nameLogin) {
        this.nameLogin = nameLogin;
    }

    public String getPassLogin() {
        return passLogin;
    }

    public void setPassLogin(String passLogin) {
        this.passLogin = passLogin;
    }
}
