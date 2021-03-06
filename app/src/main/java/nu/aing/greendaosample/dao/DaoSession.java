package nu.aing.greendaosample.dao;

import android.database.sqlite.SQLiteDatabase;

import java.util.Map;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import de.greenrobot.dao.internal.DaoConfig;

import nu.aing.greendaosample.dao.Users;
import nu.aing.greendaosample.dao.UserDetails;

import nu.aing.greendaosample.dao.UsersDao;
import nu.aing.greendaosample.dao.UserDetailsDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see de.greenrobot.dao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig usersDaoConfig;
    private final DaoConfig userDetailsDaoConfig;

    private final UsersDao usersDao;
    private final UserDetailsDao userDetailsDao;

    public DaoSession(SQLiteDatabase db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        usersDaoConfig = daoConfigMap.get(UsersDao.class).clone();
        usersDaoConfig.initIdentityScope(type);

        userDetailsDaoConfig = daoConfigMap.get(UserDetailsDao.class).clone();
        userDetailsDaoConfig.initIdentityScope(type);

        usersDao = new UsersDao(usersDaoConfig, this);
        userDetailsDao = new UserDetailsDao(userDetailsDaoConfig, this);

        registerDao(Users.class, usersDao);
        registerDao(UserDetails.class, userDetailsDao);
    }
    
    public void clear() {
        usersDaoConfig.getIdentityScope().clear();
        userDetailsDaoConfig.getIdentityScope().clear();
    }

    public UsersDao getUsersDao() {
        return usersDao;
    }

    public UserDetailsDao getUserDetailsDao() {
        return userDetailsDao;
    }

}
