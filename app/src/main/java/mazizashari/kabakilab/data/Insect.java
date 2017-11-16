package mazizashari.kabakilab.data;

import android.database.Cursor;
import android.os.Parcel;
import android.os.Parcelable;

public final class Insect implements Parcelable {
    private static final String TAG = Insect.class.getSimpleName();

    public final int idReagen;
    //Common name
    public final String namaReagen;
    //Latin scientific name
    public final String rumusKimia;

    /**
     * Create a new Insect from discrete values
     */
    public Insect(int idReagen, String namaReagen, String rumusKimia) {
        this.idReagen = idReagen;
        this.namaReagen = namaReagen;
        this.rumusKimia = rumusKimia;
    }

    /**
     * Create a new Insect from a database Cursor
     */
    public Insect(Cursor cursor) {
        //COMPLETED: Create a new insect from cursor
        this.idReagen = cursor.getInt(cursor.getColumnIndex(BugsDbHelper.COLUMN_ID));
        this.namaReagen = cursor.getString(cursor.getColumnIndex(BugsDbHelper.COLUMN_NAMA_REAGEN));
        this.rumusKimia = cursor.getString(cursor.getColumnIndex(BugsDbHelper.COLUMN_RUMUS_KIMIA));
    }

    /**
     * Create a new Insect from a data Parcel
     */
    protected Insect(Parcel in) {
        this.idReagen = in.readInt();
        this.namaReagen = in.readString();
        this.rumusKimia = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(idReagen);
        dest.writeString(namaReagen);
        dest.writeString(rumusKimia);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Insect> CREATOR = new Creator<Insect>() {
        @Override
        public Insect createFromParcel(Parcel in) {
            return new Insect(in);
        }

        @Override
        public Insect[] newArray(int size) {
            return new Insect[size];
        }
    };
}
