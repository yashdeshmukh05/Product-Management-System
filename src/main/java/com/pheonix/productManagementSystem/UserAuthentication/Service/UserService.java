package com.pheonix.productManagementSystem.UserAuthentication.Service;

import com.pheonix.productManagementSystem.Entity.User;
import com.pheonix.productManagementSystem.UserAuthentication.UserException;

public interface UserService {

    public User findUserById(Long userId) throws UserException;

    public User findUserProfileByJwt(String jwt) throws UserException;

}
