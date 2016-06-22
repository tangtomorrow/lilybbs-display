package org.tym.dao;

import org.tym.entity.LoginInfo;

import java.util.List;

/**
 * Created by tangtomorrow on 16/6/19.
 */
public interface LoginInfoDao {

    /**
     * 插入登录信息
     * @param loginInfo
     * @return
     */
    public int insertLoginInfo(LoginInfo loginInfo);

    /**
     * 根据userId查询该用户所有上站信息
     * @param userId
     * @return
     */
    public List<LoginInfo> queryByUserId(String userId);

}
