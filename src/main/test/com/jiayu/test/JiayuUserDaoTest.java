package com.jiayu.test;

import com.jiayu.dao.JiayuUserDao;
import com.jiayu.model.JiayuUser;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

public class JiayuUserDaoTest extends BaseJunit4Test {

    @Resource
    private JiayuUserDao jiayuUserDao;

    @Test
    public void testFindAll() {
        List<JiayuUser> userList = jiayuUserDao.findAll();
        System.out.println(userList.size());
    }

}
