package com.alan.kutilssample.greendao;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.alan.kutilssample.bean.IsFirstEnterApp;
import com.alan.kutilssample.bean.User;

import com.alan.kutilssample.greendao.IsFirstEnterAppDao;
import com.alan.kutilssample.greendao.UserDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig isFirstEnterAppDaoConfig;
    private final DaoConfig userDaoConfig;

    private final IsFirstEnterAppDao isFirstEnterAppDao;
    private final UserDao userDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        isFirstEnterAppDaoConfig = daoConfigMap.get(IsFirstEnterAppDao.class).clone();
        isFirstEnterAppDaoConfig.initIdentityScope(type);

        userDaoConfig = daoConfigMap.get(UserDao.class).clone();
        userDaoConfig.initIdentityScope(type);

        isFirstEnterAppDao = new IsFirstEnterAppDao(isFirstEnterAppDaoConfig, this);
        userDao = new UserDao(userDaoConfig, this);

        registerDao(IsFirstEnterApp.class, isFirstEnterAppDao);
        registerDao(User.class, userDao);
    }
    
    public void clear() {
        isFirstEnterAppDaoConfig.clearIdentityScope();
        userDaoConfig.clearIdentityScope();
    }

    public IsFirstEnterAppDao getIsFirstEnterAppDao() {
        return isFirstEnterAppDao;
    }

    public UserDao getUserDao() {
        return userDao;
    }

}