package mazizashari.kabakilab.Katalog;

import android.content.Intent;
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

import mazizashari.kabakilab.R;
import mazizashari.kabakilab.ListReagen;

public class katalog1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_katalog1);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),ListReagen.class));
                finish();
            }
        });

        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.toolbar_layout);
        collapsingToolbarLayout.setTitle("Boric Acid");

        collapsingToolbarLayout.setCollapsedTitleTextColor(
                ContextCompat.getColor(this, R.color.white));
        collapsingToolbarLayout.setExpandedTitleColor(
                ContextCompat.getColor(this, android.R.color.transparent));

        /*Floating image*/
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

       /*--------------------------------------------------------------------------------------------------------------------*/

        TextView textView1 = (TextView) findViewById(R.id.textView1);
        textView1.setText(Html.fromHtml("<b><font color=#008000>Lokasi</font><br/></b>Lemari A1"));

        TextView textView2 = (TextView) findViewById(R.id.textView2);
        textView2.setText(Html.fromHtml("<b><font color=#008000>Spesifikasi</font><br/></b> <i>Pro Analysis</i>"));

        TextView textView3 = (TextView) findViewById(R.id.textView3);
        textView3.setText(Html.fromHtml("<b><font color=#008000>Merek</font><br/></b>Merck"));

        String boldText4 = "Identifikasi bahaya\n";
        String normalText4 = "* Efek terhadap kesehatan";
        SpannableString str4 = new SpannableString(boldText4 + normalText4);
        str4.setSpan(new StyleSpan(Typeface.BOLD), 0, boldText4.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        TextView textView4 = (TextView) findViewById(R.id.textView4);
        textView4.setText(Html.fromHtml("<b><font color=#008000>Identifikasi bahaya</font><br/></b>* Efek terhadap kesehatan"));

        TextView textView5 = (TextView) findViewById(R.id.textView5);
        textView5.setText("- Berbahaya jika terjadi kontak dengan kulit, mata, saluran pencernaan dan saluran pernapasan.");

        TextView textView6 = (TextView) findViewById(R.id.textView6);
        textView6.setText("* Skala bahaya");

        TextView textView7 = (TextView) findViewById(R.id.textView7);
        textView7.setText("- Bahaya kesehatan : 1\n" +
                "- Bahaya kemudahan terbakar : 0\n"+
                "- Bahaya reaktivitas : 0\n" +
                "- Bahaya khusus lainnya : -");

        String boldText8 = "Pertolongan pertama pada kecelakaan\n";
        String normalText8 = "* Jika terkena mata ";
        SpannableString str8 = new SpannableString(boldText8 + normalText8);
        str8.setSpan(new StyleSpan(Typeface.BOLD), 0, boldText8.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        TextView textView8 = (TextView) findViewById(R.id.textView8);
        textView8.setText(Html.fromHtml("<b><font color=#008000>Pertolongan pertama pada kecelakaan</font><br/></b>* Jika terkena mata"));

        TextView textView9 = (TextView) findViewById(R.id.textView9);
        textView9.setText("- Periksa mata dan lepaskan lensa kontak. Segera basuh mata dengan banyak air sedikitnya 15 menit. Segera hubungi medis.");

        TextView textView10 = (TextView) findViewById(R.id.textView10);
        textView10.setText("* Jika terkena kulit");

        TextView textView11 = (TextView) findViewById(R.id.textView11);
        textView11.setText("- Segera basuh dengan banyak air. Lepas pakaian dan sepatu yang terkena bahan kimia. Bersihkan pakaian dan sepatu apabila akan digunakan kembali. Segera hubungi medis.");

        TextView textView12 = (TextView) findViewById(R.id.textView12);
        textView12.setText("* Jika terhirup");

        TextView textView13 = (TextView) findViewById(R.id.textView13);
        textView13.setText("- Pindahkan korban ke udara segar. Jika sulit bernapas, berikan oksigen. Jika tidak bernapas, berikan pernapasan buatan. Segera hubungi medis.");

        TextView textView14 = (TextView) findViewById(R.id.textView14);
        textView14.setText("* Jika tertelan");

        TextView textView15 = (TextView) findViewById(R.id.textView15);
        textView15.setText("- Jangan memaksakan untuk muntah kecuali jika diarahkan oleh petugas medis. Jangan memberikan apa pun melalui mulut jika korban dalam keadaan tidak sadarkan diri. Longgarkan pakaian korban seperti kerah, dasi dan ikat pinggang.\n" +
                "- Jika tertelan dalam jumlah yang banyak, segera hubungi medis.");

        String boldText16 = "Penanganan dan penyimpanan bahan";
        String normalText16 = "";
        SpannableString str16 = new SpannableString(boldText16 + normalText16);
        str16.setSpan(new StyleSpan(Typeface.BOLD), 0, boldText16.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        TextView textView16 = (TextView) findViewById(R.id.textView16);
        textView16.setText(Html.fromHtml("<b><font color=#008000>Penanganan dan penyimpanan bahan</b>"));

        TextView textView17 = (TextView) findViewById(R.id.textView17);
        textView17.setText("- Pakailah pakaian pelindung yang sesuai (jas lab, masker dan sarung tangan.\n" +
                "- Hindari kontak dengan kulit dan mata. Cuci tangan setelah bekerja dengan bahan tersebut.\n" +
                "- Simpan di tempat yang tertutup dan kering.\n" +
                "- Jauhkan dari zat alkali.");
    }

    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            Intent i = new Intent(this, ListReagen.class);
            startActivity(i);
            finish();
        }
        return false;
    }
}