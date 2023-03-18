package service;

import model.User;
import repository.LoginRepository;

public class LoginService {

    public LoginService(){}

    LoginRepository loginRepository = new LoginRepository();

    public User login(String username, String password){
        return  loginRepository.login(username,password);
    }
}
