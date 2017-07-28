package glory.hafalandoaanakmuslim;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ContactActivity extends AppCompatActivity {

    TextView txtpenjelContact;
    String text1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        txtpenjelContact = (TextView) findViewById(R.id.txtpenjelContact);

        text1 = " Nama : MiYung \n\n" +
                "Email : miyung@gmail.com \n\n" +
                "Handphone : 08961234567";

        txtpenjelContact.setText(text1);
    }
}
