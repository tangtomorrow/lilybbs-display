package org.tym.dao;

import org.apache.ibatis.annotations.Param;
import org.tym.entity.User;

import java.util.List;

/**
 * Created by tangtomorrow on 16/6/19.
 */
public interface UserDao {

    /**
     * 插入用户
     * @param user
     * @return
     */
    public int insertUser(User user);

    /**
     * 根据id查找User
     * @param id
     * @return
     */
    public User queryById(int id);

    /**
     * 根据userId查找User
     * @param userId
     * @return
     */
    public User queryByUserId(String userId);

    /**
     * 根据偏移量查询列表
     * @param offset
     * @param limit
     * @return
     */
    public List<User> queryAll(@Param("offset") int offset, @Param("limit") int limit);

    /**
     * 查询User总数
     * @return
     */
    public int getUserCount();

    /**
     * 根据userId更新其他字段
     * @param user
     * @return
     */
    public int updateByUserId(User user);

    /**
     * 根据id删除
     * @param id
     * @return
     */
    public int deleteById(int id);

    /**
     * 根据userId删除
     * @param userId
     * @return
     */
    public int deleteByUserId(String userId);

    /**
     * 根据版面名查询版主
     * @param board
     * @return
     */
    public List<User> qureyModeratorsByBoard(String board);

}
