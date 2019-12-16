package com.jiayu.service.impl;

import com.jiayu.dao.JiayuUserDao;
import com.jiayu.model.JiayuUser;
import com.jiayu.service.JiayuUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class JiayuUserServiceImpl implements JiayuUserService {

    @Resource
    private JiayuUserDao jiayuUserDao;
    
    public List<JiayuUser> findAll() {
        return jiayuUserDao.findAll();
    }
}
