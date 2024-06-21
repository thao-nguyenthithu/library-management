
package librarymanagement.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import librarymanagement.database.LoginDao;
import librarymanagement.model.LoginUser;
import librarymanagement.view.AdminForm;
import librarymanagement.view.LoginForm;

public class LoginController {
    private LoginDao loginDao;
    private LoginForm loginView;
    
    public LoginController(LoginForm view) {
        this.loginView = view;
        this.loginDao = new LoginDao();
        view.addLoginListener(new LoginListener());
    }
    
    public void showLoginView() {
        loginView.setVisible(true);
        loginView.pack();                      
        loginView.setLocationRelativeTo(null); 
    }
    
    class LoginListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.out.println("Button clicked!");
            LoginUser user = loginView.getUser();
            if (loginDao.checkLogin(user)) {
                // nếu đăng nhập thành công, mở màn hình quản lý 
                AdminForm admin = new AdminForm();
                admin.setVisible(true);
                admin.setLocationRelativeTo(null);
                loginView.dispose();
            } else {
                loginView.showMessage("Thông tin đăng nhập không đúng!");
            }
        }
    }
}
