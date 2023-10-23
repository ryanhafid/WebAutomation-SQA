package repository;
import org.openqa.selenium.By;

public class pageLogin {
    By field_username = By.name("user-name");
    By field_password = By.id("password");
    By btn_login = By.xpath("//input[@type='submit'][@data-test='login-button']");

//    By sidebarMenuButton = By.id("react-burger-menu-btn");
//    By link_logout = By.id("logout_sidebar_link");

    public By getField_username() {
        return field_username;
    }

    public By getField_password() {
        return field_password;
    }

    public By getBtn_login() {
        return btn_login;
    }

//    public By getSidebarMenuButton() {
//        return sidebarMenuButton;
//    }
//    public By getLink_logout() { return link_logout;    }
}
