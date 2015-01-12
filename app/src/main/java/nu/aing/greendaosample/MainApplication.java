package nu.aing.greendaosample;

import android.app.Application;
import android.database.sqlite.SQLiteDatabase;

import nu.aing.greendaosample.dao.DaoMaster;
import nu.aing.greendaosample.dao.DaoSession;

/**
 * @author Fanny Irawan Sutawanir (fannyirawans@gmail.com)
 */
public class MainApplication extends Application {
    public DaoSession mDaoSession;

    @Override
    public void onCreate() {
        super.onCreate();
        setupDatabase();
    }

    private void setupDatabase() {
        DaoMaster.DevOpenHelper devOpenHelper = new DaoMaster.DevOpenHelper(this, "greendao-sample", null);
        SQLiteDatabase sqLiteDatabase = devOpenHelper.getWritableDatabase();
        DaoMaster daoMaster = new DaoMaster(sqLiteDatabase);
        mDaoSession = daoMaster.newSession();
    }

    public DaoSession getDaoSession() {
        return mDaoSession;
    }
}