package uz.colibri.os_project;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.security.DenyAll;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserModel {
    private String userName,password;

    public boolean validate(){
        return (userName.equals("admin") && password.equals("admin"));
    }
}
