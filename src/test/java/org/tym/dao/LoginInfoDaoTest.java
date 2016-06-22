package org.tym.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.tym.entity.LoginInfo;
import org.tym.util.DateUtil;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by tangtomorrow on 16/6/20.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class LoginInfoDaoTest {

    @Resource
    private LoginInfoDao loginInfoDao;

    @Test
    public void insertLoginInfo() throws Exception {
        LoginInfo loginInfo = new LoginInfo("xx", DateUtil.formatDate("Sun May 22 21:37:11 2016"), "222");
        int c = loginInfoDao.insertLoginInfo(loginInfo);
        System.out.println(c);
    }

    @Test
    public void queryByUserId() throws Exception {
        String userId = "ttt";
        List<LoginInfo> loginInfos = loginInfoDao.queryByUserId(userId);
        for (LoginInfo loginInfo : loginInfos) {
            System.out.println(loginInfo);
        }
    }

}