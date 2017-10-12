package com.devjurnal.resepmakanan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recycler;
    ArrayList<ResepModel> listResep;
    ResepAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO 1. koneksi dengan recycler pada XML
        recycler = (RecyclerView) findViewById(R.id.recyclerView);

        // TODO 2. Buat Model Class
        // TODO 3. BUat Array List
        listResep = new ArrayList<>();

        // TODO 4. Set data ke ResepModel
        ResepModel resep3 = new ResepModel();
        ResepModel resep4 = new ResepModel();
        ResepModel resep5 = new ResepModel();

        // TODO 5. Masukkan data ke List
            ResepModel resep1 = new ResepModel();
            resep1.setJudul("Ikan Gurame Bakar");
            resep1.setPoster("http://www.bango.co.id/gfx/recipes/6.jpg");
            resep1.setSummary("Lumuri ikan gurame dengan air jeruk nipis dan garam. Diamkan selama 15 menit. Masukkan asam jawa, aduk. Angkat. tambahkan Kecap Manis Bango, aduk hingga rata.");
            resep1.setDetail(
                    "Bahan-Bahan :" +
                    "\n2 ekor (@ 400 g) ikan gurame, bersihkan, kerat kedua sisinya"+
                    "\n2 sdt air jeruk nipis"+
                    "\n1 sdt garam"+
                    "\n1 sdm air asam jawa"+
                    "\n5 sdm Kecap Manis Bango\n"+
                    "\n3 sdm minyak, untuk menumis"+


                    "\n\nBumbu Halus :"+

                    "\n6 butir bawang merah"+
                    "\n3 siung bawang putih"+
                    "\n4 buah cabai merah keriting"+
                    "\n3 buah cabai merah "+
                    "\n2 buah cabai rawit merah"+
                    "\n2 cm jahe"+
                    "\n2 sdt ketumbar butiran"+
                    "\n1 sdt garam"+

                    "\n\nBahan Sambal Kecap :"+

                    "\n5 sdm Kecap Manis Bango"+
                    "\n1 buah tomat, buang bijinya, potong dadu"+
                    "\n5 buah cabai rawit merah, iris tipis"+
                            "\n5 buah cabai rawit hijau, iris tipis "+
                            "\n2 butir bawang merah, diiris"+
                            "\n½ sdt air jeruk nipis"+

                            "\n\nCara Memasak :" +

                    "\n1. Lumuri ikan gurame dengan air jeruk nipis dan garam. Diamkan selama 15 menit."+
                    "\n2. Panaskan minyak. Tumis bumbu halus sampai harum."+
                    "\n3. Masukkan asam jawa, aduk. Angkat. tambahkan Kecap Manis Bango, aduk hingga rata."+
                    "\n4. Oles ikan dengan bumbu."+
                            "\n5. Bakar ikan di atas bara api sambil dioles sisa bumbu hingga matang. Angkat."+
                            "\n6. Sajikan dengan disertai sambal kecap."
            );
            listResep.add(resep1);

            ResepModel resep2 = new ResepModel();
            resep2.setJudul("Pindang Iga Palembang");
            resep2.setPoster("http://www.bango.co.id/gfx/recipes/1465187305.jpg");
            resep2.setSummary("Pindang Iga Palembang merupakan iga yang yang dimasak dengan direbus dengan bumbu super pedas ");
            resep2.setDetail(
                    "Bahan Bahan :"+
                    "\n750 gram iga sapi,potong-potong"+
                    "\n2.000 ml air "+
                    "\n5 buah belimbing wuluh, masing-masing belah 2 memanjang"+
                           "\n2 buah tomat merah, potong-potong"+
                    "\n10 buah cabai rawit merah"+
                    "\n4 buah cabai merah besar, bakar, belah 2 memanjang"+
                    "\n2 lembar daun salam"+
                    "\n3 sendok makan KECAP MANIS BANGO"+
                    "\n4 sendok teh garam"+
                    "\n1/2 sendok makan gula pasir"+
                    "\n1/4 sendok teh merica bubuk"+
                    "\n1 buah jeruk nipis, ambil airnya"+
                    "\n\nBumbu Bakar:"+
                    "\n8 butir bawang merah"+
                    "\n4 siung bawang putih"+
                    "\n3 cm jahe"+
                    "\n6 cm kunyi"+



                    "\n\nCara Memasak :"+
                    "\n1. Haluskan bawang merah, bawang putih, jahe, dan kunyit."+
                    "\n2. Rebus iga dengan air hingga berkaldu. Ukur kaldunya hingga 1.750 ml"+
                    "\n3. Tambahkan bumbu halus, tomat, cabai rawit merah, cabai merah bakar, daun salam, KECAP MANUS BANGO, garam, gula pasir, dan merica. Rebus sampai meresap. Tambahkan belimbing wuluh. Aduk rata."+
                    "\n4. Menjelang diangkat, tambahkan air jeruk nipis. Aduk rata."
            );
            listResep.add(resep2);

            resep3.setJudul("Pepes Pindang Tahu Kemangi");
            resep3.setPoster("http://www.bango.co.id/gfx/recipes/1358302652.jpg");
            resep3.setSummary("Ikan pindang yang dibungkus adonan tahu dan pindang dengan daun pisang dengan diberi daun salam di dalamnya.");
            resep3.setDetail(
                    "Bahan Bahan :"+
                           "\n- 2 ekor ikan pindang berukuran sedang disuwir2 dagingnya"+
                            "\n- 3 tahu putih (bukan tahu china atau tofu)"+
                            "\n- belimbing wuluh secukupnya (dipotong kecil2)"+
                            "\n- 1 buah telor"+
                            "\n- daun kemangi"+
                            "\n- daun salam"+
                            "\n- daun pisang"+
                    "\n\nBumbu yang dihaluskan: "+
                            "\n- 4 buah kemiri"+
                            "\n- 10 cabe rawit merah"+
                            "\n- 5 buah bawang merah"+
                            "\n- 4 buah bawang putih"+
                            "\n- garam secukupnya"+
                            "\n- gula pasir secukupnya"+

                    "\n\nCara Memasak :"+
                    "\n1. ikan pindang dicuci bersih lalu ambil dagingnya saja (pastikan bersih dari duri ya)"+
                    "\n2. tahu dihancurkan lalu campurkan dengan bumbu yang dihaluskan, potongan belimbing wuluh, ikan pindang, kemangi dan telor"+
                    "\n3. siapkan daun pisang. bersihkan dulu daun pisang dengan lap kering"+
                    "\n4. bungkus adonan tahu dan pindang dengan daun pisang dengan diberi daun salam di dalamnya."+
                            "\n5. kukus selama +/- 30 menit"
            );

            listResep.add(resep3);
            resep4.setJudul("Lumpia Udang Sayur");
            resep4.setPoster("http://www.bango.co.id/gfx/recipes/1359478666.jpg");
            resep4.setSummary("Lumpia goreng mempunyai isian toge, wortel, udang dan ayam");
            resep4.setDetail(
                    "Bahan :"+
                            "\nSediakan 8 lembar kulit lumpia"+
                    "\n\nBahan Isian: "+
        "\n1 sdm minyak goreng"+
        "\n2 buah bawang merh, haluskan"+
        "\n1 siung bawang putih, haluskan"+
        "\n50 gr daging ayam, potong dadu 1/2 cm"+
        "\n100 gr udang kupas, cincang kasar"+
        "\n50 gr wortel, serut hingga sepanjang batang korek api"+
        "\n25 gr toge, siangi"+
        "\n1 sdm air"+
        "\n1 sdm daun bawang iris halus"+
        "\n1/2 sdt garam"+
        "\n1/4 sdt merica bubuk"+
        "\n1/2 sdm kecap manis Bango"+
        "\n1 sdt gula palem"+
        "\n1 sdm minyak wijen"+

                    "\n\nCara Memasak:"+
                    "\n1. Panaskan wajan. Masukkan sekaligus minyak goreng, bawang merah dan bawang putih. Tumis hingga harum."+
                    "\n2. Tambahkan daging ayam dan udang. Masak hingga daging ayam dan udang berubah warna sambil di aduk."+
                    "\n3. Masukkan wortel, toge dan air. Masak hingga wortel matang tetapi tetap renyah."+
                    "\n4. Masukkan daun bawang, garam, merica, kecap Bango dan gula. Aduk sampai rata."+
                    "\n5. Percikkan minyak wijen. Aduk satu kali, lalu angkat dari api."+
                    "\n6. Siapkan kulit lumpia. Beri isian, gulung dan goreng sampai menguning."+
                    "\n7. Lumpia udang sayur siap disajikan (untuk 8 porsi)"

                    );

        listResep.add(resep4);
        resep5.setJudul("Cumi Tumis Pedas");
        resep5.setPoster("http://www.bango.co.id/gfx/recipes/1363184649.jpg");
        resep5.setSummary("Cumi yang ditumis dengan rasa pedas manis dan gurih");
        resep5.setDetail(
                    "Bahan Bahan :"+
                    "\n1/2 kg cumi"+
                    "\npotong melingkar 3 siung bawang putih"+
                    "\ncincang halus 1 bh tomat"+
                    "\niris kasar 1 bh bawang bombay"+
                    "\nbagi 8 2 cm jahe"+
                    "\ncincang 1/2 sdt merica bubuk"+
                    "\n1/2 sdt garam"+
                            "\n4 sdm Kecap manis pedas Bango"+


                    "\n\nCara Memasak :"+
                    "\n1. Panaskan minyak goreng, tumis bawang putih sampai harum. "+
                    "\n2. Tambahkan irisan bawang bombay dan jahe, Aduk rata."+
                    "\n3. Masukkan cumi, lalu tomat."+
                    "\n4. Tambahkan garam, merica bubuk, dan kecap Bango manis pedas."+
                    "\n5. Aduk sebentar, jangan terlalu lama karena cumi bisa mengeras."+
                    "\n6. Sajikan dengan nasi hangat."
                    );
        listResep.add(resep5);

        // TODO 6. Buat Adapter
        // TODO 7. Set Adapter
        adapter = new ResepAdapter(MainActivity.this, listResep);
        recycler.setAdapter(adapter);

        // TODO 8. Buat LayoutManager
        recycler.setLayoutManager(new LinearLayoutManager(MainActivity.this));
    }
}
