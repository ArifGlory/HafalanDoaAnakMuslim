package glory.hafalandoaanakmuslim;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;

import android.support.v7.widget.Toolbar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private DrawerLayout drawerLayout;
    private Toolbar toolbar;
    private NavigationView navigationView;
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.layout_toolbar);
        setSupportActionBar(toolbar);

        navigationView = (NavigationView) findViewById(R.id.navigation_view);

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {

                //Memeriksa apakah item tersebut dalam keadaan dicek  atau tidak,
                if(item.isChecked()) item.setChecked(false);
                else item.setChecked(true);

                drawerLayout.closeDrawers();


                switch (item.getItemId()){
                    // pilihan menu item navigasi akan menampilkan pesan toast klik kalian bisa menggantinya
                    //dengan intent activity
                    case R.id.navigation1:
                        Toast.makeText(getApplicationContext(),"Alarm di klik",Toast.LENGTH_SHORT).show();
                        i = new Intent(MainActivity.this,AlarmActivity.class);
                        startActivity(i);
                        return true;


                    case R.id.navigation2:
                        Toast.makeText(getApplicationContext(),"Evaluasi di klik",Toast.LENGTH_SHORT).show();
                        i = new Intent(MainActivity.this,EvaluasiActivity.class);
                        startActivity(i);
                        return true;


                    case R.id.navigation3:
                        Toast.makeText(getApplicationContext(),"Petunjuk di klik",Toast.LENGTH_SHORT).show();
                        i = new Intent(MainActivity.this,PetunjukActivity.class);
                        startActivity(i);
                        return true;

                    case R.id.navigation4:
                        Toast.makeText(getApplicationContext(),"About di klik",Toast.LENGTH_SHORT).show();
                        i = new Intent(MainActivity.this,AboutActivity.class);
                        startActivity(i);
                        return true;


                    default:
                        Toast.makeText(getApplicationContext(),"Terjadi kesalahan",Toast.LENGTH_SHORT).show();
                        return true;

                }


            }
        });



        //inisialiasi drawer
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer);
        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,
                                                    R.string.openDrawer,R.string.closeDrawer)

        {
            @Override
            public void onDrawerClosed(View drawerView){
                super.onDrawerClosed(drawerView);
            }

            @Override
            public void onDrawerOpened(View drawerView){

                super.onDrawerOpened(drawerView);
            }

        };

        drawerLayout.setDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

    }


    public void btnkklikDoa(View view) {

        Intent i = new Intent(this,DoaActivity.class);
        startActivity(i);
    }

    public void btnklikContact(View view) {

        Intent i = new Intent(this,ContactActivity.class);
        startActivity(i);
    }



    public void gmbrDaftarKlik(View view) {
        drawerLayout.openDrawer(Gravity.LEFT);
        //drawerLayout.openDrawer(GravityCompat.START);

    }
}
