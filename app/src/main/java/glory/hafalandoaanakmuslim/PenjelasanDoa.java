package glory.hafalandoaanakmuslim;

import android.content.Intent;
import android.content.res.Configuration;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.RelativeLayout;
import android.widget.VideoView;
import com.github.rtoshiro.view.video.FullscreenVideoLayout;

import java.io.IOException;

public class PenjelasanDoa extends AppCompatActivity {

    VideoView video;
    private android.widget.MediaController mediaController;
    int position = 0;
    ImageView imgPlay,imgArti;
    int videoTerima,gambarTerima;
    String tagKirim;
    Intent i;
    FullscreenVideoLayout videoLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_penjelasan_doa);
        imgArti = (ImageView) findViewById(R.id.gambarArti);
        videoLayout = (FullscreenVideoLayout) findViewById(R.id.videoview);
        videoLayout.setActivity(this);

        i = getIntent();
        videoTerima = i.getIntExtra("videoKirim_Bismilah", videoTerima);
       gambarTerima = i.getIntExtra("gambarKirim_bismilah1", gambarTerima);
        imgArti.setImageResource(gambarTerima);
        //
       videoTerima = i.getIntExtra("videoKirim1", videoTerima);
        gambarTerima = i.getIntExtra("gambarKirim_Masukwc",gambarTerima);
        imgArti.setImageResource(gambarTerima);
       //
       videoTerima = i.getIntExtra("videoKirim_doaMauTidur",videoTerima);
        gambarTerima = i.getIntExtra("gambarKirim_Mautidur",gambarTerima);
        imgArti.setImageResource(gambarTerima);
        //
        videoTerima = i.getIntExtra("videoKirim_doaHendakBerpakaian",videoTerima);
        gambarTerima = i.getIntExtra("gambarKirim_HendakBerpakaian",gambarTerima);
        imgArti.setImageResource(gambarTerima);
        //
        videoTerima = i.getIntExtra("videoKirim_doaKeluarRumah",videoTerima);
        gambarTerima = i.getIntExtra("gambarKirim_KeluarRumah",gambarTerima);
        imgArti.setImageResource(gambarTerima);
        //
        videoTerima = i.getIntExtra("videoKirim_doaSebelumMakan",videoTerima);
        gambarTerima = i.getIntExtra("gambarKirim_SebelumMakan",gambarTerima);
        imgArti.setImageResource(gambarTerima);
       //
        videoTerima = i.getIntExtra("videoKirim_doaSesudahMakan",videoTerima);
        gambarTerima = i.getIntExtra("gambarKirim_SesudahMakan",gambarTerima);
        imgArti.setImageResource(gambarTerima);
        //
        videoTerima = i.getIntExtra("videoKirim_doaBangunTidur",videoTerima);
        gambarTerima = i.getIntExtra("gambarKirim_BangunTidur",gambarTerima);
        imgArti.setImageResource(gambarTerima);
        //
        videoTerima = i.getIntExtra("videoKirim_doaMasukRumah",videoTerima);
        gambarTerima = i.getIntExtra("gambarKirim_MasukRumah",gambarTerima);
        imgArti.setImageResource(gambarTerima);
        //
        videoTerima = i.getIntExtra("videoKirim_doaKeluarRumah",videoTerima);
        gambarTerima = i.getIntExtra("gambarKirim_KeluarRumah",gambarTerima);
        imgArti.setImageResource(gambarTerima);
        //
        videoTerima = i.getIntExtra("videoKirim_KeluarWC",videoTerima);
        gambarTerima = i.getIntExtra("gambarKirim_KeluarWC",gambarTerima);
        imgArti.setImageResource(gambarTerima);
        //
        videoTerima = i.getIntExtra("videoKirim_Bercermin",videoTerima);
        gambarTerima = i.getIntExtra("gambarKirim_KeluarWC",gambarTerima);
        imgArti.setImageResource(gambarTerima);
        //
        videoTerima = i.getIntExtra("videoKirim_Selamat",videoTerima);
        gambarTerima = i.getIntExtra("gambarKirim_Selamat",gambarTerima);
        imgArti.setImageResource(gambarTerima);
        //
        videoTerima = i.getIntExtra("videoKirim_MasukMasjid",videoTerima);
        gambarTerima = i.getIntExtra("gambarKirim_MasukMasjid",gambarTerima);
        imgArti.setImageResource(gambarTerima);
        //
        videoTerima = i.getIntExtra("videoKirim_KeluarMasjid",videoTerima);
        gambarTerima = i.getIntExtra("gambarKirim_KeluarMasjid",gambarTerima);
        imgArti.setImageResource(gambarTerima);
        //
        videoTerima = i.getIntExtra("videoKirim_NiatWudhu",videoTerima);
        gambarTerima = i.getIntExtra("gambarKirim_NiatWudhu",gambarTerima);
        imgArti.setImageResource(gambarTerima);
        //
        videoTerima = i.getIntExtra("videoKirim_SesudahWudhu",videoTerima);
        gambarTerima = i.getIntExtra("gambarKirim_SesudahWudhu",gambarTerima);
        imgArti.setImageResource(gambarTerima);
        //
        videoTerima = i.getIntExtra("videoKirim_doaHendakBerpakaian",videoTerima);
        gambarTerima = i.getIntExtra("gambarKirim_HendakBerpakaian",gambarTerima);
        imgArti.setImageResource(gambarTerima);
        //
        videoTerima = i.getIntExtra("videoKirim_MelepasPakaian",videoTerima);
        gambarTerima = i.getIntExtra("gambarKirim_MelepasPakaian",gambarTerima);
        imgArti.setImageResource(gambarTerima);
        //
        videoTerima = i.getIntExtra("videoKirim_TurunHujan",videoTerima);
        gambarTerima = i.getIntExtra("gambarKirim_TurunHujan",gambarTerima);
        imgArti.setImageResource(gambarTerima);
        //
        videoTerima = i.getIntExtra("videoKirim_MendengarPetir",videoTerima);
        gambarTerima = i.getIntExtra("gambarKirim_MendengarPetir",gambarTerima);
        imgArti.setImageResource(gambarTerima);
        //
        videoTerima = i.getIntExtra("videoKirim_MimpiBaik",videoTerima);
        gambarTerima = i.getIntExtra("gambarKirim_MimpiBaik",gambarTerima);
        imgArti.setImageResource(gambarTerima);
        //
        videoTerima = i.getIntExtra("videoKirim_MimpiBuruk",videoTerima);
        gambarTerima = i.getIntExtra("gambarKirim_MimpiBuruk",gambarTerima);
        imgArti.setImageResource(gambarTerima);
        //
        videoTerima = i.getIntExtra("videoKirim_IlmuBermanfaat",videoTerima);
        gambarTerima = i.getIntExtra("gambarKirim_IlmuBermanfaat",gambarTerima);
        imgArti.setImageResource(gambarTerima);
        //
        videoTerima = i.getIntExtra("videoKirim_MauBelajar",videoTerima);
        gambarTerima = i.getIntExtra("gambarKirim_MauBelajar",gambarTerima);
        imgArti.setImageResource(gambarTerima);
        //
        videoTerima = i.getIntExtra("videoKirim_SesudahBelajar",videoTerima);
        gambarTerima = i.getIntExtra("gambarKirim_SesudahBelajar",gambarTerima);
        imgArti.setImageResource(gambarTerima);
        //
        videoTerima = i.getIntExtra("videoKirim_KeduaOrangtua",videoTerima);
        gambarTerima = i.getIntExtra("gambarKirim_KeduaOrangtua",gambarTerima);
        imgArti.setImageResource(gambarTerima);
        //

        Uri lokasivideo = Uri.parse("android.resource://"+getPackageName()+"/"+videoTerima);
        try{

            videoLayout.setVideoURI(lokasivideo);

        }catch (IOException e){
                e.printStackTrace();
        }





//        video = (VideoView) findViewById(R.id.videoV);
        imgPlay = (ImageView) findViewById(R.id.gmbrPlay);
        //mediaController = new MediaController(this);

        //set button untuk mediacontroler
        /*if (mediaController==null){

            mediaController = new MediaController(PenjelasanDoa.this);
            mediaController.setAnchorView(video);
            video.setMediaController(mediaController);
        }

        Uri lokasivideo = Uri.parse("android.resource://"+getPackageName()+"/"+videoTerima);
        video.setVideoURI(lokasivideo);
        mediaController.setAnchorView(video);
        video.requestFocus();*/






    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }

    public void gmbrPlayKlik(View view) {

       // mediaController.setAnchorView(video);
        //video.start();
        imgPlay.setVisibility(view.GONE);

        videoLayout.start();


    }


}
