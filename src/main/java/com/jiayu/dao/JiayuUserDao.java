package com.jiayu.dao;

import com.jiayu.model.JiayuUser;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JiayuUserDao {
    List<JiayuUser> findAll();
}
