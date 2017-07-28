package glory.hafalandoaanakmuslim;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import Adapter.RecycleAdapter;

public class DoaActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doa);

        recyclerView = (RecyclerView) findViewById(R.id.recycleView1);


        RecycleAdapter adapter = new RecycleAdapter(this);
        //membuat adapter baru untuk recycle viewnya
        recyclerView.setAdapter(adapter);
        ////menset nilaia dapter
        //recyclerView.setHasFixedSize(true);

        //menset ukuran
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
