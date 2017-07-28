package Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import glory.hafalandoaanakmuslim.PenjelasanDoa;
import glory.hafalandoaanakmuslim.R;

/**
 * Created by Glory on 03/10/2016.
 */
public class RecycleAdapter extends RecyclerView.Adapter<RecycleViewHolder> {

    private final Context context;
    LayoutInflater inflater;
    Intent i;
    int videoKirim,gambarKirim;

    //dekalrasi buat List nya
    String[] nama={"Bismilah","Doa Sebelum Makan","Doa Sesudah Makan","Doa Sebelum Tidur","Doa Sesudah Tidur","Doa Masuk Rumah",
                    "Doa Keluar Rumah","Doa Masuk WC","Doa Keluar WC","Doa Bercermin","Doa Selamat","Doa Masuk Masjid",
                    "Doa Keluar Masjid","Doa Niat Wudhu","Doa sesudah Wudhu","Doa Hendak Berpakaian","Doa Melepas Pakaian",
                    "Doa Ketika Hujan","Doa mendengar Petir","Doa Ketika Mimpi Baik","Doa Ketika Mimpi Buruk","Doa Kedua Orang Tua",
                    "Doa Memohon Ilmu Bermanfaat","Doa Sebelum Belajar","Doa Sesudah Belajar"};
    int[]icon = {R.drawable.bismillah,R.drawable.doasebelummakan,R.drawable.doasesudahmakan,R.drawable.doasebelumtidur,
            R.drawable.doasesudahtidur,R.drawable.doamasukrumah,R.drawable.doakeluarrumah,R.drawable.doamasukwc,R.drawable.doakeluarwc
            ,R.drawable.doabercermin,R.drawable.doaselamat,R.drawable.doamasukmasjid,R.drawable.doakeluarmasjid,
            R.drawable.doaniatwudhu,R.drawable.doasesudahwudhu,R.drawable.doahendakberpakaian,R.drawable.doamelepaspakaian
            ,R.drawable.doaketikahujan,R.drawable.doaketikamendengarpetir,R.drawable.doaketikamimpibaik,R.drawable.doaketikamimpiburuk,
            R.drawable.doaketikasusahtidur,R.drawable.doamohonilmubermanfaat,R.drawable.doasebelumbelajar,R.drawable.doasesudahbelajar
            };

    public RecycleAdapter(Context context) {
        this.context = context;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public RecycleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.item_list,parent,false);
        RecycleViewHolder viewHolder = new RecycleViewHolder(v);

        return viewHolder;

    }

    @Override
    public void onBindViewHolder(RecycleViewHolder holder, int position) {

        holder.txtListJudul.setText(nama[position]);
        holder.gmbrList.setImageResource(icon[position]);

        holder.gmbrList.setOnClickListener(clicklistener);
        holder.txtListJudul.setOnClickListener(clicklistener);

        holder.txtListJudul.setTag(holder);
        holder.gmbrList.setTag(holder);

    }

    View.OnClickListener clicklistener = new View.OnClickListener() {


        @Override
        public void onClick(View v) {

            RecycleViewHolder vHolder = (RecycleViewHolder) v.getTag();
            int position = vHolder.getPosition();


            switch (position)
            {

                case 0:
                    videoKirim = R.raw.doa_bismillah;
                    gambarKirim = R.drawable.arti_bismilah;
                    i = new Intent(context, PenjelasanDoa.class);
                    i.putExtra("videoKirim_Bismilah",videoKirim);
                    i.putExtra("gambarKirim_bismilah1",gambarKirim);
                    context.startActivity(i);

                    break;

                case 1:
                    videoKirim = R.raw.doa_sebelummakan;
                    gambarKirim = R.drawable.arti_doamautidur;
                    i = new Intent(context, PenjelasanDoa.class);
                    i.putExtra("videoKirim_doaSebelumMakan",videoKirim);
                    i.putExtra("gambarKirim_SebelumMakan",gambarKirim);

                    context.startActivity(i);

                    break;

                case 2:
                    videoKirim = R.raw.doa_sesudahmakan;
                    gambarKirim = R.drawable.arti_sesudahmakan;
                    i = new Intent(context, PenjelasanDoa.class);
                    i.putExtra("videoKirim_doaSesudahMakan",videoKirim);
                    i.putExtra("gambarKirim_SesudahMakan",gambarKirim);

                    context.startActivity(i);
                    break;

                case 3:
                    videoKirim = R.raw.doa_sebelumtidur;
                    gambarKirim = R.drawable.arti_doamautidur;
                    i = new Intent(context, PenjelasanDoa.class);
                    i.putExtra("videoKirim_doaMauTidur",videoKirim);
                    i.putExtra("gambarKirim_Mautidur",gambarKirim);

                    context.startActivity(i);
                    break;

                case 4:
                    videoKirim = R.raw.doa_banguntidur;
                    gambarKirim = R.drawable.arti_banguntidur;
                    i = new Intent(context, PenjelasanDoa.class);
                    i.putExtra("videoKirim_doaBangunTidur",videoKirim);
                    i.putExtra("gambarKirim_BangunTidur",gambarKirim);

                    context.startActivity(i);
                    break;
                case 5:
                    videoKirim = R.raw.doa_masukrumah;
                    gambarKirim = R.drawable.arti_masukrumah;
                    i = new Intent(context, PenjelasanDoa.class);
                    i.putExtra("videoKirim_doaMasukRumah",videoKirim);
                    i.putExtra("gambarKirim_MasukRumah",gambarKirim);
                    context.startActivity(i);
                    break;
                case 6:
                    videoKirim = R.raw.doa_keluarrumah;
                    gambarKirim = R.drawable.arti_keluar_rumah;
                    i = new Intent(context, PenjelasanDoa.class);
                    i.putExtra("videoKirim_doaKeluarRumah",videoKirim);
                    i.putExtra("gambarKirim_KeluarRumah",gambarKirim);
                    context.startActivity(i);
                    break;
                case 7:
                    videoKirim = R.raw.doa_memasukiwc;
                    gambarKirim = R.drawable.arti_doamasukwc;
                    i = new Intent(context, PenjelasanDoa.class);
                    i.putExtra("videoKirim1",videoKirim);
                    i.putExtra("gambarKirim_Masukwc",gambarKirim);

                    context.startActivity(i);
                    break;
                case 8:
                    videoKirim = R.raw.doa_keluarwc;
                    gambarKirim = R.drawable.arti_keluarwc;
                    i = new Intent(context, PenjelasanDoa.class);
                    i.putExtra("videoKirim_KeluarWC",videoKirim);
                    i.putExtra("gambarKirim_KeluarWC",gambarKirim);

                    context.startActivity(i);
                    break;
                case 9:
                    videoKirim = R.raw.doa_bercermin;
                    gambarKirim = R.drawable.arti_bercermin;
                    i = new Intent(context, PenjelasanDoa.class);
                    i.putExtra("videoKirim_Bercermin",videoKirim);
                    i.putExtra("gambarKirim_Bercermin",gambarKirim);

                    context.startActivity(i);
                    break;
                case 10:
                    videoKirim = R.raw.doa_selamat;
                    gambarKirim = R.drawable.arti_doaselamat;
                    i = new Intent(context, PenjelasanDoa.class);
                    i.putExtra("videoKirim_Selamat",videoKirim);
                    i.putExtra("gambarKirim_Selamat",gambarKirim);

                    context.startActivity(i);

                    break;
                case 11:
                    videoKirim = R.raw.doa_masukmasjid;
                    gambarKirim = R.drawable.arti_masukmasjid;
                    i = new Intent(context, PenjelasanDoa.class);
                    i.putExtra("videoKirim_MasukMasjid",videoKirim);
                    i.putExtra("gambarKirim_MasukMasjid",gambarKirim);

                    context.startActivity(i);
                    break;
                case 12:
                    videoKirim = R.raw.doa_keluarmasjid;
                    gambarKirim = R.drawable.arti_keluarmasjid;
                    i = new Intent(context, PenjelasanDoa.class);
                    i.putExtra("videoKirim_KeluarMasjid",videoKirim);
                    i.putExtra("gambarKirim_KeluarMasjid",gambarKirim);

                    context.startActivity(i);
                    break;
                case 13:
                    videoKirim = R.raw.doa_niatwudhu;
                    gambarKirim = R.drawable.arti_niatwudhu;
                    i = new Intent(context, PenjelasanDoa.class);
                    i.putExtra("videoKirim_NiatWudhu",videoKirim);
                    i.putExtra("gambarKirim_NiatWudhu",gambarKirim);

                    context.startActivity(i);
                    break;
                case 14:
                    videoKirim = R.raw.doa_sesudahwudhu;
                    gambarKirim = R.drawable.arti_sesudahwudhu;
                    i = new Intent(context, PenjelasanDoa.class);
                    i.putExtra("videoKirim_SesudahWudhu",videoKirim);
                    i.putExtra("gambarKirim_SesudahWudhu",gambarKirim);

                    context.startActivity(i);
                    break;
                case 15:
                    videoKirim = R.raw.doa_hendakberpakaian;
                    gambarKirim = R.drawable.arti_hendak_berpakaian;
                    i = new Intent(context, PenjelasanDoa.class);
                    i.putExtra("videoKirim_doaHendakBerpakaian",videoKirim);
                    i.putExtra("gambarKirim_HendakBerpakaian",gambarKirim);

                    context.startActivity(i);
                    break;
                case 16:
                    videoKirim = R.raw.doa_melepaspakaian;
                    gambarKirim = R.drawable.arti_melepaspakaian;
                    i = new Intent(context, PenjelasanDoa.class);
                    i.putExtra("videoKirim_MelepasPakaian",videoKirim);
                    i.putExtra("gambarKirim_MelepasPakaian",gambarKirim);

                    context.startActivity(i);

                    break;
                case 17:
                    videoKirim = R.raw.doa_hujanturun;
                    gambarKirim = R.drawable.arti_turunhujan;
                    i = new Intent(context, PenjelasanDoa.class);
                    i.putExtra("videoKirim_TurunHujan",videoKirim);
                    i.putExtra("gambarKirim_TurunHujan",gambarKirim);

                    context.startActivity(i);
                    break;
                case 18:
                    videoKirim = R.raw.doa_mendengarpetir;
                    gambarKirim = R.drawable.arti_mendengarpetirr;
                    i = new Intent(context, PenjelasanDoa.class);
                    i.putExtra("videoKirim_MendengarPetir",videoKirim);
                    i.putExtra("gambarKirim_MendengarPetir",gambarKirim);

                    context.startActivity(i);
                    break;
                case 19:
                    videoKirim = R.raw.doa_mimpibaik;
                    gambarKirim = R.drawable.arti_mimpibaik;
                    i = new Intent(context, PenjelasanDoa.class);
                    i.putExtra("videoKirim_MimpiBaik",videoKirim);
                    i.putExtra("gambarKirim_MimpiBaik",gambarKirim);

                    context.startActivity(i);

                    break;
                case 20:
                    videoKirim = R.raw.doa_mimpiburuk;
                    gambarKirim = R.drawable.arti_mimpiburuk;
                    i = new Intent(context, PenjelasanDoa.class);
                    i.putExtra("videoKirim_MimpiBuruk",videoKirim);
                    i.putExtra("gambarKirim_MimpiBuruk",gambarKirim);

                    context.startActivity(i);
                    break;
                case 21:
                    videoKirim = R.raw.doa_keduaorangtua;
                    gambarKirim = R.drawable.arti_keduaorangtua;
                    i = new Intent(context, PenjelasanDoa.class);
                    i.putExtra("videoKirim_KeduaOrangtua",videoKirim);
                    i.putExtra("gambarKirim_KeduaOrangtua",gambarKirim);

                    context.startActivity(i);

                    break;
                case 22:
                    videoKirim = R.raw.doa_ilmubermanfaat;
                    gambarKirim = R.drawable.arti_ilmubermanfaat;
                    i = new Intent(context, PenjelasanDoa.class);
                    i.putExtra("videoKirim_IlmuBermanfaat",videoKirim);
                    i.putExtra("gambarKirim_IlmuBermanfaat",gambarKirim);

                    context.startActivity(i);
                    break;
                case 23:
                    videoKirim = R.raw.doa_maubelajar;
                    gambarKirim = R.drawable.arti_maubelajar;
                    i = new Intent(context, PenjelasanDoa.class);
                    i.putExtra("videoKirim_MauBelajar",videoKirim);
                    i.putExtra("gambarKirim_MauBelajar",gambarKirim);

                    context.startActivity(i);

                    break;
                case 24:
                    videoKirim = R.raw.doa_sesudahbelajar;
                    gambarKirim = R.drawable.arti_sesudahbelajar;
                    i = new Intent(context, PenjelasanDoa.class);
                    i.putExtra("videoKirim_SesudahBelajar",videoKirim);
                    i.putExtra("gambarKirim_SesudahBelajar",gambarKirim);

                    context.startActivity(i);

                    break;


            }

        }
    };


    public int getItemCount() {
        return nama.length;
    }
}
