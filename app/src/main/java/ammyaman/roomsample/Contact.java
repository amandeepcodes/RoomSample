package ammyaman.roomsample;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

/**
 * Created by CH-E01449 on 06-12-2017.
 */


@Entity(tableName = "contacts")
public class Contact {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    private int mId;

    @ColumnInfo(name = "name")
    private String mName;
    @ColumnInfo(name = "number")
    private String mNumber;

    public Contact(@NonNull String name, @NonNull String number) {
        mName = name;
        mNumber = number;
    }

    public String getName() {
        return mName;
    }

    public int getId() {
        return mId;
    }

    public void setId(int mId) {
        this.mId = mId;
    }

    public String getNumber() {
        return mNumber;
    }
}
