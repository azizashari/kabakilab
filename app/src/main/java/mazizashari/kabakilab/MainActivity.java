package mazizashari.kabakilab;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import mazizashari.kabakilab.Katalog.katalog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ImageView logoLogin = (ImageView) findViewById(R.id.logoLogin);

        //Glide.with(this).load(R.drawable.logomini).into(logoLogin);

        Button bMulai = (Button) findViewById(R.id.bMulai);

        bMulai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,katalog.class);
                startActivity(intent);
                finish();
            }
        });

        Button bPetunjuk = (Button) findViewById(R.id.bPetunjuk);

        bPetunjuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Petunjuk.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
