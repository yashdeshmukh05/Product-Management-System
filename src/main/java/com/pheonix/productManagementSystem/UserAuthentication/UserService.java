package com.pheonix.productManagementSystem.UserAuthentication;

import com.pheonix.productManagementSystem.Entity.User;

public interface UserService {

    public User findUserById(Long userId) throws UserException;

    public User findUserProfileByJwt(String jwt) throws UserException;

}
