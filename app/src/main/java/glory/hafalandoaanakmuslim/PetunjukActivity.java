package glory.hafalandoaanakmuslim;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class PetunjukActivity extends AppCompatActivity {

    TextView txtPenjelasanDoa,txtPenjelasanConatct,txtPenjelasanAlarm,txtPenjelasanEvaluasi;
    String pdoa,pcontact,palarm,pevaluasi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_petunjuk);
        txtPenjelasanDoa = (TextView) findViewById(R.id.txtpenjelDoa);
        txtPenjelasanConatct = (TextView) findViewById(R.id.txtpenjelContact);
        txtPenjelasanAlarm = (TextView) findViewById(R.id.txtpenjelAlarm);
        txtPenjelasanEvaluasi = (TextView) findViewById(R.id.txtpenjelEvaluasi);

        pdoa = "Tombol ini berfungsi untuk memilih doa - doa. Setelah doa terpilih, maka anda hanya tinggal menekan" +
                "tombol Play, maka video animasi doa akan diputar";

        pcontact = "Tombol ini berfungsi untuk melihat contact dari Author Aplikasi ini";

        palarm = "Tombol ini berfungsi untuk mengatur waktu pengingat untuk Hafalan. Setelah anda menekan tombol ini, " +
                "Anda akan dibimbing untuk mengatur waktu pengingat dengan menekan tombol 'Set Alarm' " ;

        pevaluasi = "Tombol ini berguna untuk melatih sejauh kemampuan anda dalam Hafalan doa \n\n" +
                "- Setiap soal akan berisi 4 pilihan ganda yang dapat dipilih.\n\n - Terdapat soal yang mengandung suara potongan Doa " +
                "yang dapat di putar dan juga terdapat gambar dari potongan ayat Doa.\n\n - Setiap soal yang berhasil dijawab dengan benar" +
                " akan mendapatkan skor 10 point \n\n ";

        txtPenjelasanDoa.setText(pdoa);
        txtPenjelasanConatct.setText(pcontact);
        txtPenjelasanAlarm.setText(palarm);
        txtPenjelasanEvaluasi.setText(pevaluasi);

    }
}
