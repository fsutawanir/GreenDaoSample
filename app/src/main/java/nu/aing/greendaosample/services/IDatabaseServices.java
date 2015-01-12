package nu.aing.greendaosample.services;

import android.content.Context;

import java.util.List;

import nu.aing.greendaosample.dao.UserDetails;
import nu.aing.greendaosample.dao.Users;

/**
 * @author Fanny Irawan Sutawanir (fannyirawans@gmail.com)
 */
public interface IDatabaseServices {
    List<Users> findAll(Context context);

    Users findById(Context context, long id);

    UserDetails findByUserDetailsId(Context context, long id);

    void insertOrUpdate(Context context, Users users, UserDetails userDetails);

    void deleteAll(Context context);

    void deleteById(Context context, long id, long detailid);
}