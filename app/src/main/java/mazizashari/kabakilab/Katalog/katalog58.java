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

public class katalog58 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_katalog58);
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
        collapsingToolbarLayout.setTitle("Metha Phosphoric Acid");

        collapsingToolbarLayout.setCollapsedTitleTextColor(
                ContextCompat.getColor(this, R.color.white));
        collapsingToolbarLayout.setExpandedTitleColor(
                ContextCompat.getColor(this, android.R.color.transparent));


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        /*  String boldText = " \n";
        String normalText = " ";
        SpannableString str = new SpannableString(boldText + normalText);
        str.setSpan(new StyleSpan(Typeface.BOLD), 0, boldText.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        TextView textView1 = (TextView) findViewById(R.id.textView1);
        textView1.setText(str);
        */
        /* TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText("58	Metha Phosphoric Acid/HPO3);*/

        String boldText = "Lokasi\n";
        String normalText = "Lemari A3";
        SpannableString str = new SpannableString(boldText + normalText);
        str.setSpan(new StyleSpan(Typeface.BOLD), 0, boldText.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        TextView textView1 = (TextView) findViewById(R.id.textView1);
        textView1.setText(str);

        String boldText2 = "Spesifikasi\n";
        String normalText2 = "Pro Analysis";
        SpannableString str2 = new SpannableString(boldText2 + normalText2);
        str2.setSpan(new StyleSpan(Typeface.BOLD), 0, boldText2.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        textView2.setText(Html.fromHtml("<b>Spesifikasi</b> <br/> <i>Pro Analysis</i>"));

        String boldText3 = "Merek\n";
        String normalText3 = "Merck";
        SpannableString str3 = new SpannableString(boldText3 + normalText3);
        str3.setSpan(new StyleSpan(Typeface.BOLD), 0, boldText3.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        TextView textView3 = (TextView) findViewById(R.id.textView3);
        textView3.setText(str3);

        String boldText4 = "Identifikasi bahaya\n";
        String normalText4 = "* Efek terhadap kesehatan";
        SpannableString str4 = new SpannableString(boldText4 + normalText4);
        str4.setSpan(new StyleSpan(Typeface.BOLD), 0, boldText4.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        TextView textView4 = (TextView) findViewById(R.id.textView4);
        textView4.setText(str4);

        TextView textView5 = (TextView) findViewById(R.id.textView5);
        textView5.setText("- Sangat berbahaya sekali jika terjadi kontak dengan mata. Jika terkena mata, dapat menyebabkan kerusakan kornea dan kebutaan.\n" +
                "- Sangat berbahaya jika terjadi kontak dengan saluran pencernaan dan pernapasan. \n" +
                "- Jika terhirup, akan menyebabkan iritasi pada saluran pencernaan dan saluran pernapasan seperti bersin, batuk dan terasa seperti terbakar.\n" +
                "- Paparan yang berlebihan dapat menyebabkan gangguan pernapasan dan kerusakan paru-paru.\n" +
                "- Sedikit berbahaya jika terjadi kontak dengan kulit. Jika terkena kulit, dapat menyebabkan peradangan.");

        TextView textView6 = (TextView) findViewById(R.id.textView6);
        textView6.setText("* Skala bahaya");

        TextView textView7 = (TextView) findViewById(R.id.textView7);
        textView7.setText("- Bahaya kesehatan : 3\n" +
                "- Bahaya kemudahan terbakar : 0\n"+
                "- Bahaya reaktivitas : 0\n" +
                "- Bahaya khusus lainnya : -");

        String boldText8 = "Pertolongan pertama pada kecelakaan\n";
        String normalText8 = "* Jika terkena mata ";
        SpannableString str8 = new SpannableString(boldText8 + normalText8);
        str8.setSpan(new StyleSpan(Typeface.BOLD), 0, boldText8.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        TextView textView8 = (TextView) findViewById(R.id.textView8);
        textView8.setText(str8);

        TextView textView9 = (TextView) findViewById(R.id.textView9);
        textView9.setText("- Periksa mata dan lepaskan lensa kontak. Segera basuh mata dengan banyak air sedikitnya 15 menit. Dapat menggunakan air dingin. Segera hubungi medis.");

        TextView textView10 = (TextView) findViewById(R.id.textView10);
        textView10.setText("* Jika terkena kulit");

        TextView textView11 = (TextView) findViewById(R.id.textView11);
        textView11.setText("- Segera basuh dengan banyak air. Lepas pakaian dan sepatu yang terkena bahan kimia. Bersihkan kulit yang terkena bahan kimia dengan sabun dan air. Bersihkan pakaian dan sepatu apabila akan digunakan kembali. Segera hubungi medis.");

        TextView textView12 = (TextView) findViewById(R.id.textView12);
        textView12.setText("* Jika terhirup");

        TextView textView13 = (TextView) findViewById(R.id.textView13);
        textView13.setText("- Pindahkan korban ke udara segar. Jika sulit bernapas, berikan oksigen. Jika tidak bernapas, berikan pernapasan buatan. Segera hubungi medis.\n" +
                "- Perhatian : dapat menjadi bahaya bagi orang yang akan memberikan pertolongan pernapasan dari mulut ke mulut apabila bahan yang terhirup bersifat beracun, menyebabkan infeksi dan korosif.");

        TextView textView14 = (TextView) findViewById(R.id.textView14);
        textView14.setText("* Jika tertelan");

        TextView textView15 = (TextView) findViewById(R.id.textView15);
        textView15.setText("- Beri air minum kepada korban. Jangan memaksakan untuk muntah kecuali jika diarahkan oleh petugas medis. \n" +
                "- Jika tertelan dalam jumlah yang banyak, segera hubungi medis.");

        String boldText16 = "Penanganan dan penyimpanan bahan";
        String normalText16 = "";
        SpannableString str16 = new SpannableString(boldText16 + normalText16);
        str16.setSpan(new StyleSpan(Typeface.BOLD), 0, boldText16.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        TextView textView16 = (TextView) findViewById(R.id.textView16);
        textView16.setText(str16);

        TextView textView17 = (TextView) findViewById(R.id.textView17);
        textView17.setText("- Pakailah pakaian pelindung yang sesuai (jas lab, masker dan sarung tangan).\n" +
                "- Jaga wadah bahan kimia agar tetap kering. \n" +
                "- Hindari kontak dengan kulit dan mata. Cuci tangan setelah bekerja dengan bahan tersebut.\n" +
                "- Simpan di tempat yang tertutup, kering dan berventilasi cukup. \n" +
                "- Jauhkan dari zat logam, alkali dan uap air.");
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
