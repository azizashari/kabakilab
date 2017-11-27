package mazizashari.kabakilab;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Typeface;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

import butterknife.BindView;
import butterknife.ButterKnife;
import mazizashari.kabakilab.Katalog.katalog68;
import mazizashari.kabakilab.data.BugsDbHelper;
import mazizashari.kabakilab.data.DatabaseManager;
import mazizashari.kabakilab.data.InsectRecyclerAdapter;

public class ListReagen extends AppCompatActivity {

    //@BindView(R.id.fab)
   // FloatingActionButton fab;

    @BindView(R.id.listReagen)
    RecyclerView listReagen;

    @BindView(R.id.searchReagen)
    EditText search;

    @BindView(R.id.ka)
    TextView ka;

    @BindView(R.id.baki)
    TextView baki;

    private InsectRecyclerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_reagen);

        ButterKnife.bind(this);

        /*fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ListReagen.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        });*/
        //Typeface custom_font = Typeface.createFromAsset(getAssets(),  "fonts/HATTEN.TTF");

        //ka.setTypeface(custom_font);
        //baki.setTypeface(custom_font);

        loadData("");

        search.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                //listReagen.removeAllViews();
                //clear();
                loadData(search.getText().toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        //listReagen.setLayoutManager(new LinearLayoutManager(this));
        //listReagen.setAdapter(adapter);
    }

    private void loadData(String search) {
        DatabaseManager db = DatabaseManager.getInstance(this);
        Cursor cursor = db.queryAllReagen(search);

        adapter = new InsectRecyclerAdapter(cursor);
        listReagen.setLayoutManager(new LinearLayoutManager(this));
        listReagen.setAdapter(adapter);
    }

    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
            finish();
        }
        return false;
    }
}
