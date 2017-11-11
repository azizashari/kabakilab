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
import android.widget.TextView;

import mazizashari.kabakilab.Katalog.katalog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*String boldText = "Lokasi\n";
        String normalText = "Lemari A1";
        SpannableString str = new SpannableString(boldText + normalText);
        str.setSpan(new StyleSpan(Typeface.BOLD), 0, boldText.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        TextView textView1 = (TextView) findViewById(R.id.textView1);
        textView1.setText(str);

        String boldText2 = "Spesifikasi\n";
        String normalText2 = "Pro Analysis";
        SpannableString str2 = new SpannableString(boldText2 + normalText2);
        str.setSpan(new StyleSpan(Typeface.BOLD), 0, boldText2.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        textView2.setText(str2);

        String boldText3 = "Merek\n";
        String normalText3 = "Merck";
        SpannableString str3 = new SpannableString(boldText3 + normalText3);
        str.setSpan(new StyleSpan(Typeface.BOLD), 0, boldText3.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        TextView textView3 = (TextView) findViewById(R.id.textView3);
        textView3.setText(str3);*/

        Button bMulai = (Button) findViewById(R.id.bMulai);

        bMulai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,katalog.class);
                startActivity(intent);
                finish();
            }
        });

    }


}
