package mazizashari.kabakilab.Katalog;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import mazizashari.kabakilab.ListReagen;
import mazizashari.kabakilab.R;

public class keterangan extends AppCompatActivity {

    TextView ek1b1,ek2b1,ek1b2,ek2b2,ek1b3,ek2b3,ek1b4,ek2b4,ek1b5,ek2b5;
    public static final String MyPREFERENCES = "MyPrefs" ;
    public static final String k1b1 = "k1b1";
    public static final String k2b1 = "k2b1";
    public static final String k1b2 = "k1b2";
    public static final String k2b2 = "k2b2";
    public static final String k1b3 = "k1b3";
    public static final String k2b3 = "k2b3";
    public static final String k1b4 = "k1b4";
    public static final String k2b4 = "k2b4";
    public static final String k1b5 = "k1b5";
    public static final String k2b5 = "k2b5";

    SharedPreferences sharedpreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keterangan);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

                ek1b1 = (TextView) findViewById(R.id.etkol1bar1);
                ek2b1 = (TextView) findViewById(R.id.etkol2bar1);
                ek1b2 = (TextView) findViewById(R.id.etkol1bar2);
                ek2b2 = (TextView) findViewById(R.id.etkol2bar2);
                ek1b3 = (TextView) findViewById(R.id.etkol1bar3);
                ek2b3 = (TextView) findViewById(R.id.etkol2bar3);
                ek1b4 = (TextView) findViewById(R.id.etkol1bar4);
                ek2b4 = (TextView) findViewById(R.id.etkol2bar4);
                ek1b5 = (TextView) findViewById(R.id.etkol1bar5);
                ek2b5 = (TextView) findViewById(R.id.etkol2bar5);

                sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);

                String gek1b1 = sharedpreferences.getString("k1b1", "");
                String gek2b1 = sharedpreferences.getString("k2b1", "");
                String gek1b2 = sharedpreferences.getString("k1b2", "");
                String gek2b2 = sharedpreferences.getString("k2b2", "");
                String gek1b3 = sharedpreferences.getString("k1b3", "");
                String gek2b3 = sharedpreferences.getString("k2b3", "");
                String gek1b4 = sharedpreferences.getString("k1b4", "");
                String gek2b4 = sharedpreferences.getString("k2b4", "");
                String gek1b5 = sharedpreferences.getString("k1b5", "");
                String gek2b5 = sharedpreferences.getString("k2b5", "");
                ek1b1.setText(gek1b1);
                ek2b1.setText(gek2b1);
                ek1b2.setText(gek1b2);
                ek2b2.setText(gek2b2);
                ek1b3.setText(gek1b3);
                ek2b3.setText(gek2b3);
                ek1b4.setText(gek1b4);
                ek2b4.setText(gek2b4);
                ek1b5.setText(gek1b5);
                ek2b5.setText(gek2b5);

                String tek1b1 = ek1b1.getText().toString();
                String tek2b1 = ek2b1.getText().toString();
                String tek1b2 = ek1b2.getText().toString();
                String tek2b2 = ek2b2.getText().toString();
                String tek1b3 = ek1b3.getText().toString();
                String tek2b3 = ek2b3.getText().toString();
                String tek1b4 = ek1b4.getText().toString();
                String tek2b4 = ek2b4.getText().toString();
                String tek1b5 = ek1b5.getText().toString();
                String tek2b5 = ek2b5.getText().toString();

                SharedPreferences.Editor editor = sharedpreferences.edit();

                editor.putString(k1b1, tek1b1);
                editor.putString(k2b1, tek2b1);
                editor.putString(k1b2, tek1b2);
                editor.putString(k2b2, tek2b2);
                editor.putString(k1b3, tek1b3);
                editor.putString(k2b3, tek2b3);
                editor.putString(k1b4, tek1b4);
                editor.putString(k2b4, tek2b4);
                editor.putString(k1b5, tek1b5);
                editor.putString(k2b5, tek2b5);
                editor.commit();
            }
        });
    }
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == android.view.KeyEvent.KEYCODE_BACK) {
            Intent i = new Intent(this, ListReagen.class);
            startActivity(i);
            finish();
        }
        return false;
    }
}
