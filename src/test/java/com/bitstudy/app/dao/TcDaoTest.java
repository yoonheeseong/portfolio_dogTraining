package com.bitstudy.app.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class TcDaoTest {
    @Autowired
    TcDao tcDao;

    @Test
    public void selectTc() {
        tcDao.selectTc(1);
    }

    @Test
    public void dropTc(){
        tcDao.dropTc(1);
    }
}