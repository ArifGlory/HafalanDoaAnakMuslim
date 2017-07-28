package glory.hafalandoaanakmuslim;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AboutActivity extends AppCompatActivity {

    TextView txtPenjelasanAbout;
    String text1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        txtPenjelasanAbout = (TextView) findViewById(R.id.txtpenjelAbout);
        text1 = "Aplikasi ini dibuat untuk membantu dalam proses  pembelajaran Doa dalam kehidupan sehari-hari. " +
                "\n\n Dibantu dengan data teks , gambar, dan video diharapkan dapat meningkatkan minat belajar anak anak " +
                "dalam pengucapan " +
                "dan menghafal doa sehari-hari";

        txtPenjelasanAbout.setText(text1);
    }
}
