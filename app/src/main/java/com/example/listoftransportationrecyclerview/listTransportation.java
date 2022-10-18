package com.example.listoftransportationrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class listTransportation extends AppCompatActivity {
    RecyclerView rv_type;
    ArrayList<Transportation> types = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_transportation);

        addItem();

        typesTransportation type_trans = new typesTransportation(this, types);
        rv_type = findViewById(R.id.rw_trans);
        rv_type.setLayoutManager(new LinearLayoutManager(this));
        rv_type.setAdapter(type_trans);
    }

    private void addItem() {
        types.add(new Transportation("Transportasi Darat", "Transportasi darat adalah proses gerak" + " perpindahan dari satu tempat ke tempat lain" +
                " dengan sarana atau media darat, termasuk" + "didalamnya media sungai dan danau dengan" + " menggunakan angkutan darat atau berjalan kaki.\n" +
                "\nTransportasi darat merupakan semua bentuk transportasi atau kendaraan yang digunakan di jalan untuk mengangkut barang dan juga penumpang. " +
                "Jenis transportasi yang satu ini tergolong yang paling dominan dibandingkan dengan transportasi laut serta udara, khususnya di Indonesia.\n" +
                "\n" +
                "Jika menelusuri sejarah singkat tentang transportasi darat di Indonesia, kita akan menemukan bahwa transportasi kita banyak dipengaruhi oleh " +
                "Belanda ketika menjajah Indonesia. Dahulu, masyarakat Indonesia hanya mengandalkan kuda, pedati, gerobak, serta becak sebagai angkutan barang hingga pribadi.\n" +
                "\n" +
                "Perkembangan transportasi darat yang dapat kita rasakan hingga saat ini adalah adanya kereta api serta infrastruktur jalan yang ada di sepanjang " +
                "Pulau Jawa. Seiring berkembangnya zaman, semua moda transportasi jadul telah tergantikan dengan transportasi modern. Hal tersebut dipengaruhi oleh " +
                "perubahan zaman, kebijakan politik dan juga kemajuan teknologi.\n" +
                "\nSarana : \n" +
                "- Angkutan jalan\n" +
                "- Kereta api\n" +
                "- Lainnya, Angkutan darat selain mobil, bus, ataupun sepeda motor yang lazim digunakan oleh masyarakat, umumnya digunakan untuk skala kecil, rekreasi, ataupun sarana sarana di perkampungan baik di kota maupun di desa.\n" +
                "    - sepeda\n" +
                "    - bajaj\n" +
                "    - bemo\n" +
                "    - helicak\n" +
                "    - delman\n" +
                "    - sepeda motor listrik\n" +
                "    - trem\n" +
                "    - Gerobak Sapi atau Cikar atau pedati.\n" +
                "\nPrasarana : \n" +
                "- Jalan dan jembatan\n" +
                "- Rel\n" +
                "- Terminal\n" +
                "- Stasiun kereta api\n" +
                "- Halte\n" +
                "- ATCS", "Penjelasan lebih lanjut :\nhttps://www.youtube.com/watch?v=o-vpZi3qR9Y " +
                "\nhttps://dspace.uii.ac.id/bitstream/handle/123456789/817/05.2%20bab%202.pdf?sequence=5&isAllowed=y" +
                "\nhttps://www.gramedia.com/best-seller/macam-alat-transportasi/#:~:text=Transportasi%20darat%20merupakan%20semua%20bentuk,mengangkut%20barang%20dan%20juga%20penumpang."));
        types.add(new Transportation("Transportasi Udara", "Transportasi udara adalah proses gerak perpindahan orang atau barang dari satu tempat " +
                "ke tempat lain dengan menggunakan media udara.\n" +
                "\nJenis transportasi yang satu ini adalah alat transportasi yang beroperasi di udara. Sama halnya seperti transportasi darat dan laut, transportasi " +
                "udara juga memiliki berbagai fungsi, bergantung dengan jenis transportasi itu sendiri.\n" +
                "\nSarana : \n" +
                "- Pesawat\n" +
                "- Helikopter\n" +
                "\nPrasarana : \n" +
                "- Bandar udara\n" +
                "- Landasan pacu/lapangan", "Penjelasan lebih lanjut :\nhttps://www.youtube.com/watch?v=aDE8ITonyUw " +
                "\nhttps://dspace.uii.ac.id/bitstream/handle/123456789/817/05.2%20bab%202.pdf?sequence=5&isAllowed=y" +
                "\nhttps://www.gramedia.com/best-seller/macam-alat-transportasi/#:~:text=Transportasi%20darat%20merupakan%20semua%20bentuk,mengangkut%20barang%20dan%20juga%20penumpang."));
        types.add(new Transportation("Transportasi Laut", "Transportasi laut adalah proses gerak" + " perpindahan orang atau barang dari satu tempat " +
                "ke tempat lain melalui media laut\n" +
                "\nAlat transportasi laut merupakan segala jenis moda tranportasi yang beroprasi di lautan. Moda transportasi ini dibagi menjadi beberapa jenis, sesuai dengan " +
                "fungsinya masing-masing. Jika menilik transportasi laut di Indonesia, maka kamu akan menemukan beberapa jenis transportasi laut yang biasanya digunakan untuk " +
                "kepentingan umum. Namun, ada juga yang digunakan untuk kepentingan khusus saja.\n" +
                "\nSarana :\n" +
                "- Kapal\n" +
                "- Feri\n" +
                "- Sampan\n" +
                "\nPrasarana :\n" +
                "- Pelabuhan\n" +
                "- Galangan kapal\n" +
                "- Dermaga", "Penjelasan lebih lanjut :\nhttps://www.youtube.com/watch?v=UJS54dN3f9E " +
                "\nhttps://dspace.uii.ac.id/bitstream/handle/123456789/817/05.2%20bab%202.pdf?sequence=5&isAllowed=y" +
                "\nhttps://www.gramedia.com/best-seller/macam-alat-transportasi/#:~:text=Transportasi%20darat%20merupakan%20semua%20bentuk,mengangkut%20barang%20dan%20juga%20penumpang."));
    }
}