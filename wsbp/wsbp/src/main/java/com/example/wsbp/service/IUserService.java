package com.example.wsbp.service;

import com.example.wsbp.data.AuthUser;
import com.example.wsbp.data.Chat;

import java.util.List;

public interface IUserService {

    public int registerUser(String userName, String userPass);

    public void removeUser(String userName);

    public boolean existsUser(String userName, String userPass);

    public List<AuthUser> findAuthUsers();

    public void changeUser(String changeName, String userName);

}
