package com.felix.dao;


import com.felix.model.UserDomain;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface UserDao {


    int insert(UserDomain record);

    List<UserDomain> selectUsers();
}