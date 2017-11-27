package mazizashari.kabakilab;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;

public class PetunjukPemakaian extends AppCompatActivity {

    TextView ek1b1,ek2b1,ek3b1,ek1b2,ek2b2,ek3b2,ek1b3,ek2b3,ek3b3,ek1b4,ek2b4,ek3b4,ek1b5,ek2b5,ek3b5;
    TextView textView1, textView2, textView3, textView4, textView5, textView6, textView7, textView8;
    public static final String MyPREFERENCES = "MyPrefs" ;
    public static final String k1b1 = "k1b1";
    public static final String k2b1 = "k2b1";
    public static final String k3b1 = "k3b1";

    public static final String k1b2 = "k1b2";
    public static final String k2b2 = "k2b2";
    public static final String k3b2 = "k3b2";

    public static final String k1b3 = "k1b3";
    public static final String k2b3 = "k2b3";
    public static final String k3b3 = "k3b3";

    public static final String k1b4 = "k1b4";
    public static final String k2b4 = "k2b4";
    public static final String k3b4 = "k3b4";

    public static final String k1b5 = "k1b5";
    public static final String k2b5 = "k2b5";
    public static final String k3b5 = "k2b5";

    SharedPreferences sharedpreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_petunjuk_pemakaian);

        Typeface custom_font = Typeface.createFromAsset(getAssets(),  "fonts/HATTENT.TTF");

        textView1.setTypeface(custom_font);
        textView2.setTypeface(custom_font);
        textView3.setTypeface(custom_font);
        textView4.setTypeface(custom_font);
        textView5.setTypeface(custom_font);
        textView6.setTypeface(custom_font);
        textView7.setTypeface(custom_font);
        textView8.setTypeface(custom_font);

        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.toolbar_layout);
        collapsingToolbarLayout.setTitle("Petunjuk Pemakaian");

        collapsingToolbarLayout.setCollapsedTitleTextColor(
                ContextCompat.getColor(this, R.color.white));
        collapsingToolbarLayout.setExpandedTitleColor(
                ContextCompat.getColor(this, android.R.color.transparent));

        ek1b1 = (TextView) findViewById(R.id.etkol1bar1);
        ek2b1 = (TextView) findViewById(R.id.etkol2bar1);
        ek3b1 = (TextView) findViewById(R.id.etkol3bar1);

        ek1b2 = (TextView) findViewById(R.id.etkol1bar2);
        ek2b2 = (TextView) findViewById(R.id.etkol2bar2);
        ek3b2 = (TextView) findViewById(R.id.etkol3bar2);

        ek1b3 = (TextView) findViewById(R.id.etkol1bar3);
        ek2b3 = (TextView) findViewById(R.id.etkol2bar3);
        ek3b3 = (TextView) findViewById(R.id.etkol3bar3);

        ek1b4 = (TextView) findViewById(R.id.etkol1bar4);
        ek2b4 = (TextView) findViewById(R.id.etkol2bar4);
        ek3b4 = (TextView) findViewById(R.id.etkol3bar4);

        ek1b5 = (TextView) findViewById(R.id.etkol1bar5);
        ek2b5 = (TextView) findViewById(R.id.etkol2bar5);
        ek3b5 = (TextView) findViewById(R.id.etkol3bar5);

        sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);

        String gek1b1 = sharedpreferences.getString("k1b1", "Bahan kimia yang dengan sangat sedikit paparan (exposure) dapat menyebabkan kematian atau sakit parah.");
        String gek2b1 = sharedpreferences.getString("k2b1", "Bahan kimia yang akan teruapkan dengan cepat atau sempurna pada tekanan atmosfer dan temperatur kamar atau bahan kimia yang segera terdispersi di udara dan bahan kimia tersebut akan terbakar dengan cepat.");
        String gek3b1 = sharedpreferences.getString("k3b1", "Bahan kimia yang secara sendirian memiliki kemungkinan meledak atau terdekomposisi dan menimbulkan ledakan atau bereaksi pada tekanan dan temperatur normal.");

        String gek1b2 = sharedpreferences.getString("k1b2", "Bahan kimia yang dengan sedikit paparan dapat menyebabkan sakit serius atau sakit parah.");
        String gek2b2 = sharedpreferences.getString("k2b2", "Bahan kimia berupa cairan atau padatan yang dapat menyala pada semua temperatur kamar.");
        String gek3b2 = sharedpreferences.getString("k3b2", "Bahan kimia yang secara sendirian memiliki kemungkinan meledak atau terdekomposisi dan menimbulkan ledakan atau bereaksi tetapi membutuhkan bahan inisiator atau harus dipanaskan pada kondisi tertentu sebelum inisiasi atau bahan yang bereaksi dengan air dan menimbulkan ledakan.");

        String gek1b3 = sharedpreferences.getString("k1b3", "Bahan kimia yang dengan paparan cukup intens atau berkelanjutan dapat menyebabkan kemungkinan sakit parah atau penyakit menahun.");
        String gek2b3 = sharedpreferences.getString("k2b3", "Bahan kimia yang harus dipanaskan atau dikondisikan pada temperatur tinggi tertentu sehingga dapat menyala.");
        String gek3b3 = sharedpreferences.getString("k3b3", "Bahan kimia yang segera menunjukkan perubahan kimia drastis akibat kenaikan temperatur atau tekanan atau reaksi secara cepat dengan air dan mungkin membentuk campuran bahan peledak dengan air.");

        String gek1b4 = sharedpreferences.getString("k1b4", "Bahan kimia yang dengan terjadinya paparan dapat menyebabkan iritasi atau sakit.");
        String gek2b4 = sharedpreferences.getString("k2b4", "Bahan kimia yang harus dipanaskan terlebih dahulu sebelum nyala dapat terjadi.");
        String gek3b4 = sharedpreferences.getString("k3b4", "Bahan kimia yang secara sendirian stabil tetapi dapat menjadi tidak stabil akibat kenaikan temperatur atau tekanan.");

        String gek1b5 = sharedpreferences.getString("k1b5", "Bahan kimia yang akibat paparan termasuk dalam kondisi terbakar tidak mengakibatkan sakit atau bahaya kesehatan.");
        String gek2b5 = sharedpreferences.getString("k2b5", "Bahan kimia yang tidak dapat terbakar.");
        String gek3b5 = sharedpreferences.getString("k3b5", "Bahan kimia yang secara sendirian stabil kecuali pada kondisi nyala api dan bahan tidak reaktif dengan air.");

        ek1b1.setText(gek1b1);
        ek2b1.setText(gek2b1);
        ek3b1.setText(gek3b1);

        ek1b2.setText(gek1b2);
        ek2b2.setText(gek2b2);
        ek3b2.setText(gek3b2);

        ek1b3.setText(gek1b3);
        ek2b3.setText(gek2b3);
        ek3b3.setText(gek3b3);

        ek1b4.setText(gek1b4);
        ek2b4.setText(gek2b4);
        ek3b4.setText(gek3b4);

        ek1b5.setText(gek1b5);
        ek2b5.setText(gek2b5);
        ek3b5.setText(gek3b5);

        TextView textView1 = (TextView) findViewById(R.id.textView1);
        textView1.setText("KABAKI LAB merupakan katalog bahan kimia berbasis android yang disusun untuk mempermudah pencarian bahan kimia yang tersedia di seluruh Laboratorium Pendidikan Teknologi Agroindustri. Adanya KABAKI LAB dapat membantu seluruh civitas akademik program studi untuk mencari dan mengetahui identitas bahan kimia yang tersedia di laboratorium melalui telepon genggam/gawai android yang dimiliki. \n\n" +
                "Adapun petunjuk pemakaian KABAKI LAB adalah sebagai berikut.");

        /*TextView textView2 = (TextView) findViewById(R.id.textView2);
        textView2.setText("1. Pilih menu Petunjuk Pemakaian untuk mengetahui cara pemakaian KABAKI LAB.\n\n" +
                "2. Pilihlah menu Mulai untuk memulai pencarian nama bahan kimia.\n\n" +
                "3. Tuliskan nama bahan kimia pada kolom Pencarian\n\n" +
                "4. Apabila sudah ditemukan daftar bahan kimia, kemudian pilih nama bahan kimia yang dicari.\n\n" +
                "5. Identitas dan keterangan tentang bahan kimia yang dicari dapat dilihat setelah memilih nama bahan kimia tersebut.\n\n" +
                "6. Apabila ingin kembali melakukan pencarian, tekan tombol Kembali pada telepon genggam/gawai android.\n\n" +
                "7. Untuk mempermudah pembacaan skala bahaya bahan kimia, berikut pengertian dari skala bahaya bahan kimia:\n\n");
*/
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        textView2.setText(Html.fromHtml("1. Pilih menu <b>Petunjuk Pemakaian</b> untuk mengetahui cara pemakaian KABAKI LAB."));

        TextView textView3 = (TextView) findViewById(R.id.textView3);
        textView3.setText(Html.fromHtml("2. Pilihlah menu <b>Mulai</b> untuk memulai pencarian nama bahan kimia."));

        TextView textView4 = (TextView) findViewById(R.id.textView4);
        textView4.setText(Html.fromHtml("3. Tuliskan nama bahan kimia pada kolom <b>Pencarian</b>"));

        TextView textView5 = (TextView) findViewById(R.id.textView5);
        textView5.setText("4. Apabila sudah ditemukan daftar bahan kimia, kemudian pilih nama bahan kimia yang dicari.\n\n" +
                            "5. Identitas dan keterangan tentang bahan kimia yang dicari dapat dilihat setelah memilih nama bahan kimia tersebut.");

        TextView textView6 = (TextView) findViewById(R.id.textView6);
        textView6.setText(Html.fromHtml("6. Apabila ingin kembali melakukan pencarian, tekan tombol <b>Kembali ( < ) </b> pada telepon genggam/gawai android."));

        TextView textView7 = (TextView) findViewById(R.id.textView7);
        textView7.setText("7. Untuk mempermudah pembacaan skala bahaya bahan kimia, berikut pengertian dari skala bahaya bahan kimia:\n");


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
