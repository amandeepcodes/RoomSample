package ammyaman.roomsample;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

/**
 * Created by CH-E01449 on 06-12-2017.
 */

@Dao
public interface ContactDao {

    @Insert
    void insert(Contact contact);

//    @Delete
//    void delete(int id);

//    @Update
//    boolean updateContact(Contact contact);

    @Query("DELETE FROM contacts")
    void deleteAll();

    @Query("SELECT * from contacts")
    LiveData<List<Contact>> getAllContacts();
}
