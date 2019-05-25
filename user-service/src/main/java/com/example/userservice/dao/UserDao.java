package com.example.userservice.dao;

import com.example.userservice.model.User;
import java.util.List;

public interface UserDao {
    int deleteByPrimaryKey(String user_id);

    int insert(User record);

    User selectByPrimaryKey(String user_id);

    List<User> selectAll();

    int updateByPrimaryKey(User record);
}