package ammyaman.roomsample;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.support.annotation.NonNull;

import java.util.List;

/**
 * Created by CH-E01449 on 06-12-2017.
 */

public class ContactViewModel extends AndroidViewModel {

    private ContactRepository mRepository;
    private LiveData<List<Contact>> mContacts;

    public ContactViewModel(@NonNull Application application) {
        super(application);
        mRepository = new ContactRepository(application);
        mContacts = mRepository.getAllContacts();
    }

    LiveData<List<Contact>> getAllContacts() {
        return mContacts;
    }

    void insert(Contact contact) {
        mRepository.insert(contact);
    }

}
