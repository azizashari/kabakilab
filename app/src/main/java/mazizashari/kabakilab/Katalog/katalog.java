package mazizashari.kabakilab.Katalog;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;

import mazizashari.kabakilab.MainActivity;
import mazizashari.kabakilab.R;

public class katalog extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_katalog0);

        Button bPilih = (Button) findViewById(R.id.bPilih);

        bPilih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(katalog.this,katalog1.class);
                startActivity(intent);
                finish();
            }
        });
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
