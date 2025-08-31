package com.BillingSoftware.BillingSoftware.service;

import com.BillingSoftware.BillingSoftware.io.UserRequest;
import com.BillingSoftware.BillingSoftware.io.UserResponse;

import java.util.List;

public interface UserService {

    UserResponse createUser (UserRequest request);
    String getUserRole(String email);
    List<UserResponse> readUsers();
    void deleteUser(String id);
}
