package mazizashari.kabakilab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView header = (ImageView) findViewById(R.id.header);

        Glide.with(this).load(R.drawable.kabakilab).into(header);

        ImageView logoupi = (ImageView) findViewById(R.id.upilogo);

        Glide.with(this).load(R.drawable.upilogo).into(logoupi);

        ImageView upi = (ImageView) findViewById(R.id.upi);

        Glide.with(this).load(R.drawable.upi).into(upi);

        Button bMulai = (Button) findViewById(R.id.bMulai);

        bMulai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ListReagen.class);
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
