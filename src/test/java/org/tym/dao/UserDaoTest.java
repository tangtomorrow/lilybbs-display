package org.tym.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.tym.entity.User;
import org.tym.util.DateUtil;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by tangtomorrow on 16/6/19.
 * 配置spring和junit整合,junit启动时加载springIOC容器
 * spring-test,junit
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class UserDaoTest {

    @Resource
    private UserDao userDao;

    @Test
    public void insertUser() throws Exception {
        User user = new User();
        user.setUserId("mmmm");
        user.setUserName("xxx");
        user.setLoginTimes(1);
        user.setPostArticles(1);
        user.setTitle(null);
        user.setConstellation("狮子座");
        user.setLastLoginTime(DateUtil.formatDate("Sun May 22 21:37:11 2016"));
        user.setLastLoginIp("Pic.nju.edu.cn");
        user.setExperience(6501);
        user.setPerformance(8);
        user.setLife(1);
        user.setModerators(null);

        userDao.insertUser(user);
    }

    @Test
    public void queryById() throws Exception {
        int id = 2;
        User user = userDao.queryById(id);
        System.out.println(user);
    }

    @Test
    public void queryByUserId() throws Exception {
        String userId = "mmmm";
        User user = userDao.queryByUserId(userId);
        System.out.println(user);
    }

    @Test
    public void queryAll() throws Exception {
        List<User> users = userDao.queryAll(0, 3);
        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void getUserCount() throws Exception {
        int count = userDao.getUserCount();
        System.out.println(count);
    }

    @Test
    public void updateByUserId() throws Exception {
        User user = new User();
        user.setUserId("ttttttt");
        user.setUserName("~~~");
        user.setLoginTimes(345);
        user.setPostArticles(64);
        user.setTitle(null);
        user.setConstellation("狮子座");
        user.setLastLoginTime(DateUtil.formatDate("Sun May 22 21:37:11 2016"));
        user.setLastLoginIp("hello.nju.edu.cn");
        user.setExperience(87);
        user.setPerformance(3);
        user.setLife(1);
        user.setModerators(null);

        userDao.updateByUserId(user);
    }

    @Test
    public void deleteById() throws Exception {
        int id = 2;
        userDao.deleteById(id);
    }

    @Test
    public void deleteByUserId() throws Exception {
        String userId = "mmmm";
        userDao.deleteByUserId(userId);
    }

    @Test
    public void qureyModeratorsByBoard() throws Exception {
        String boardName = "YangZhou";
        List<User> users = userDao.qureyModeratorsByBoard(boardName);
        for (User user : users) {
            System.out.println(user);
        }
    }

}