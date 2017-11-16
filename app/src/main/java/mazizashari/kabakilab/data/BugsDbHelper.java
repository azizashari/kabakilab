package mazizashari.kabakilab.data;

import android.content.ContentValues;
import android.content.Context;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import mazizashari.kabakilab.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Database helper class to facilitate creating and updating
 * the database from the chosen schema.
 */
public class BugsDbHelper extends SQLiteOpenHelper {
    private static final String TAG = BugsDbHelper.class.getSimpleName();

    public static final String DATABASE_NAME = "reagen.db";
    private static final int DATABASE_VERSION = 1;

    //Used to read data from res/ and assets/
    private Resources mResources;

    public static final String TABLE_NAME = "reagen";

    public static final String COLUMN_ID = "id";
    public static final String COLUMN_NAMA_REAGEN = "namaReagen";
    public static final String COLUMN_RUMUS_KIMIA = "rumusKimia";

    private static final String CREATE_DATABASE = "CREATE TABLE IF NOT EXISTS " + TABLE_NAME + " ("
            + COLUMN_ID + " INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, "
            + COLUMN_NAMA_REAGEN + " VARCHAR NOT NULL, "
            + COLUMN_RUMUS_KIMIA + " VARCHAR NOT NULL);";

    public BugsDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);

        mResources = context.getResources();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //COMPLETED: Create and fill the database
        db.execSQL(CREATE_DATABASE);

        try {
            readInsectsFromResources(db);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //COMPLETED: Handle database version upgrades
        db.execSQL("DROP TABLE IF EXIST " + TABLE_NAME);
        onCreate(db);
    }

    /**
     * Streams the JSON data from insect.json, parses it, and inserts it into the
     * provided {@link SQLiteDatabase}.
     *
     * @param db Database where objects should be inserted.
     * @throws IOException
     * @throws JSONException
     */
    private void readInsectsFromResources(SQLiteDatabase db) throws IOException, JSONException {
        StringBuilder builder = new StringBuilder();
        InputStream in = mResources.openRawResource(R.raw.reagen);
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        String line;
        while ((line = reader.readLine()) != null) {
            builder.append(line);
        }

        //Parse resource into key/values
        final String rawJson = builder.toString();
        //COMPLETED: Parse JSON data and insert into the provided database instance
        JSONArray data = new JSONObject(rawJson).getJSONArray(TABLE_NAME);
        for (int i = 0; i < data.length(); i++) {
            JSONObject item = data.getJSONObject(i);

            Log.d(TAG, "readReagenFromResources: " + item.get(COLUMN_NAMA_REAGEN));

            ContentValues values = new ContentValues();
            values.put(COLUMN_NAMA_REAGEN, item.getString(COLUMN_NAMA_REAGEN));
            values.put(COLUMN_RUMUS_KIMIA, item.getString(COLUMN_RUMUS_KIMIA));

            db.replace(TABLE_NAME, null, values);
        }
    }
}
