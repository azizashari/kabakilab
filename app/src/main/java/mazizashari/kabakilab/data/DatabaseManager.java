package mazizashari.kabakilab.data;

import android.content.Context;
import android.database.Cursor;

/**
 * Singleton that controls access to the SQLiteDatabase instance
 * for this application.
 */
public class DatabaseManager {

    //public static final String SORT_BY_NAME = BugsDbHelper.COLUMN_FRIENDLY_NAME + " ASC";
    //public static final String SORT_BY_DANGER = BugsDbHelper.COLUMN_DANGER_LEVEL + " DESC";

    private static DatabaseManager sInstance;

    public static synchronized DatabaseManager getInstance(Context context) {
        if (sInstance == null) {
            sInstance = new DatabaseManager(context.getApplicationContext());
        }

        return sInstance;
    }

    private BugsDbHelper mBugsDbHelper;

    private DatabaseManager(Context context) {
        mBugsDbHelper = new BugsDbHelper(context);
    }

    /**
     * Return a {@link Cursor} that contains every insect in the database.
     *
     * @return {@link Cursor} containing all insect results.
     */
    public Cursor queryAllReagen(String search) {
        //COMPLETED: Implement the query
        return mBugsDbHelper.getReadableDatabase().rawQuery("SELECT * FROM "+ BugsDbHelper.TABLE_NAME +
                " WHERE " + BugsDbHelper.COLUMN_NAMA_REAGEN + " LIKE  '%"+search+"%'", null
        );
    }

    /**
     * Return a {@link Cursor} that contains a single insect for the given unique id.
     *
     * @param id Unique identifier for the insect record.
     * @return {@link Cursor} containing the insect result.
     */
    public Cursor queryReagenById(int id) {
        //COMPLETED: Implement the query
        return mBugsDbHelper.getReadableDatabase().rawQuery("SELECT * FROM " + BugsDbHelper.TABLE_NAME +
                " WHERE " + BugsDbHelper.COLUMN_ID + " = " + id, null
        );
    }
}
