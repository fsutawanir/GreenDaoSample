package nu.aing.greendaosample.dao;

import nu.aing.greendaosample.dao.DaoSession;
import de.greenrobot.dao.DaoException;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table USER_DETAILS.
 */
public class UserDetails {

    private Long id;
    private String firstname;
    private String lastname;
    /** Not-null value. */
    private String role;
    /** Not-null value. */
    private String gender;
    private long usersid;

    /** Used to resolve relations */
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    private transient UserDetailsDao myDao;

    private Users fkusers;
    private Long fkusers__resolvedKey;


    public UserDetails() {
    }

    public UserDetails(Long id) {
        this.id = id;
    }

    public UserDetails(Long id, String firstname, String lastname, String role, String gender, long usersid) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.role = role;
        this.gender = gender;
        this.usersid = usersid;
    }

    /** called by internal mechanisms, do not call yourself. */
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getUserDetailsDao() : null;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /** Not-null value. */
    public String getRole() {
        return role;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setRole(String role) {
        this.role = role;
    }

    /** Not-null value. */
    public String getGender() {
        return gender;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setGender(String gender) {
        this.gender = gender;
    }

    public long getUsersid() {
        return usersid;
    }

    public void setUsersid(long usersid) {
        this.usersid = usersid;
    }

    /** To-one relationship, resolved on first access. */
    public Users getFkusers() {
        long __key = this.usersid;
        if (fkusers__resolvedKey == null || !fkusers__resolvedKey.equals(__key)) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            UsersDao targetDao = daoSession.getUsersDao();
            Users fkusersNew = targetDao.load(__key);
            synchronized (this) {
                fkusers = fkusersNew;
            	fkusers__resolvedKey = __key;
            }
        }
        return fkusers;
    }

    public void setFkusers(Users fkusers) {
        if (fkusers == null) {
            throw new DaoException("To-one property 'usersid' has not-null constraint; cannot set to-one to null");
        }
        synchronized (this) {
            this.fkusers = fkusers;
            usersid = fkusers.getId();
            fkusers__resolvedKey = usersid;
        }
    }

    /** Convenient call for {@link AbstractDao#delete(Object)}. Entity must attached to an entity context. */
    public void delete() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.delete(this);
    }

    /** Convenient call for {@link AbstractDao#update(Object)}. Entity must attached to an entity context. */
    public void update() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.update(this);
    }

    /** Convenient call for {@link AbstractDao#refresh(Object)}. Entity must attached to an entity context. */
    public void refresh() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.refresh(this);
    }

}
