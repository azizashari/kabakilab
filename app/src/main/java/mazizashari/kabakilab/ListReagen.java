package mazizashari.kabakilab;

import android.content.Intent;
import android.database.Cursor;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Random;

import butterknife.BindView;
import butterknife.ButterKnife;
import mazizashari.kabakilab.Katalog.katalog68;
import mazizashari.kabakilab.data.DatabaseManager;
import mazizashari.kabakilab.data.InsectRecyclerAdapter;

public class ListReagen extends AppCompatActivity {

    @BindView(R.id.fab)
    FloatingActionButton fab;

    @BindView(R.id.listReagen)
    RecyclerView listReagen;

    private InsectRecyclerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_reagen);

        ButterKnife.bind(this);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ListReagen.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        });

        loadData();
    }

    private void loadData() {
        DatabaseManager db = DatabaseManager.getInstance(this);
        Cursor cursor = db.queryAllReagen();

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
