package ammyaman.roomsample;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
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



    @Ignore
    @ColumnInfo(name = "altr_number")
    private String mAltrNumber;

    public Contact(@NonNull String name, @NonNull String number) {
        mName = name;
        mNumber = number;
        mAltrNumber="";
    }
    public Contact(@NonNull String name, @NonNull String number, @NonNull String alterNumber) {
        mName = name;
        mNumber = number;
        mAltrNumber=alterNumber;
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

    public String getAltrNumber() {
        return mAltrNumber;
    }

    public void setAltrNumber(String altrNumber) {
        this.mAltrNumber = altrNumber;
    }
}
