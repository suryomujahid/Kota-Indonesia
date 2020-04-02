package com.example.kotaindonesia;

import java.util.ArrayList;

public class CityData {
    private static String[] cityNames = {
            "Surabaya",
            "Jakarta",
            "Medan",
            "Balikpapan",
            "Malang",
            "Denpasar",
            "Yogyakarta",
            "Palembang",
            "Makassar",
            "Bandung"
    };

    private static String[] cityDesc = {
            "Surabaya merupakan kawasan yang paling pesat dalam pembangunan perekonomiannya dan salah satu kota termaju di Indonesia. Industri-industri yang berkembang di Surabaya antara lain galangan kapal, alat berat, pengolahan makanan, elektronik, kerjainan tangan, serta perabotan rumah tangga.",
            "Jakarta merupakan kota metropolitan terbesar di Indonesia sekaligus menjadi ibukota Republik Indonesia. Kota ini satu-satunya kota di Indonesia yang mempunyai status setingkat provinsi.",
            "Kota Medan merupakan ibukota provinsi Sumatera Utara dan salah satu kota terbesar di luar pulau Jawa. Kota Medan termasuk kota metropolitan ketiga di Indonesia. Kota ini adalah pintu gerbang perdagangan di wilayah Indonesia Barat.",
            "Balikpapan merupakan kota paling maju di Kalimantan. Kota ini di nobatkan sebagai kota paling dicintai sedunia, dari 47 kota di Dunia lainnya seperti Seoul, Paris, dan Vancouver versi WWF lewat program We Love Cities di tahun 2015.",
            "Perekonomian di kota ini ditunjang oleh berbagai sektor seperti industri, perdagangan, jasa, dan pariwisata. Di bidang pariwisata, suhu kota Malang yang sangat dingin membuat wisatawan baik domestik maupun mancanegara tertarik untuk mengunjungi kota ini.",
            "Kota Denpasar merupakan ibukota dari provinsi Bali yang menjadi destinasi pariwisata populer di Indonesia. Pariwisata di Bali mendorong kota ini menjadi pusat kegiatan bisnis dan memiliki pendapatan per kapita tertinggi di Provinsi Bali.",
            "Daerah Istimewa Yogyakarta merupakan kota yang setara dengan tingkat provinsi ke 2 setelah Jakarta. Kota ini juga memiliki keunggulan khususnya dalam hal pariwisata dan pendidikan. Yogyakarta juga menjadi kota favorite bagi pelajar untuk menuntut ilmu. ",
            "Palembang merupakan ibukota provinsi Sumatera Selatan. Palembang adalah kota terbesar kedua setelah Medan di Pulau Sumatera. Kota Palembang juga dianggap sebagai salah satu pusat dari Kerajaan Sriwijaya.",
            "Kota Makassar merupakan ibukota dari provinsi Sulawesi Selatan dan memiliki julukan kota “Ujung Pandang”. Kota ini juga merupakan kota Internasional terbesar di kawasan Indonesia Timur.",
            "Bandung merupakan salah satu kota metropolitan terbesar di Jawa Barat dan menjadi ibukota provinsi tersebut. Sebutan lain untuk Kota Bandung adalah kota kembang, bahkan Bandung disebut sebagai “Paris of Java”"
    };
    private static String[] cityPop = {
            "2.917.688",
            "10.187.595",
            "2.499.838",
            "557.579",
            "847.391",
            "930.600",
            "427.498",
            "1.581.651",
            "1.671.001",
            "2.440.717"
    };
    private static String[] cityProvince = {
            "Jawa Timur",
            "DKI Jakarta",
            "Sumatra Utara",
            "Kalimantan Timur",
            "Jawa Timur",
            "Nusa Tenggara",
            "DI Yogyakarta",
            "Sumatra Selatan",
            "Sulawesi Selatan",
            "Jawa Barat"
    };
    private static int[] cityImages = {
            R.drawable.f_surabaya,
            R.drawable.f_jakarta,
            R.drawable.f_medan,
            R.drawable.f_balikpapan,
            R.drawable.f_malang,
            R.drawable.f_denpasar,
            R.drawable.f_yogyakarta,
            R.drawable.f_palembang,
            R.drawable.f_makassar,
            R.drawable.f_bandung
    };
    private static String[] cityLocation = {
            "https://www.google.com/maps/place/Surabaya,+Kota+SBY,+Jawa+Timur/@-7.2756141,112.6426425,12z/data=!4m5!3m4!1s0x2dd7fbf8381ac47f:0x3027a76e352be40!8m2!3d-7.2574719!4d112.7520883",
            "https://www.google.com/maps/place/Jakarta,+Daerah+Khusus+Ibukota+Jakarta/@-6.2297465,106.829518,11z/data=!3m1!4b1!4m5!3m4!1s0x2e69f3e945e34b9d:0x5371bf0fdad786a2!8m2!3d-6.2087634!4d106.845599",
            "https://www.google.com/maps/place/Medan,+Kota+Medan,+Sumatera+Utara/@3.6422865,98.6694935,11z/data=!3m1!4b1!4m5!3m4!1s0x303131cc1c3eb2fd:0x23d431c8a6908262!8m2!3d3.5951956!4d98.6722227",
            "https://www.google.com/maps/place/Balikpapan,+Kota+Balikpapan,+Kalimantan+Timur/@-1.174603,116.841748,11z/data=!3m1!4b1!4m5!3m4!1s0x2df14710964d9c91:0xcaa6ec96c2aea6d2!8m2!3d-1.2379274!4d116.8528526",
            "https://www.google.com/maps/place/Malang,+Kota+Malang,+Jawa+Timur/@-7.9786453,112.631783,12z/data=!3m1!4b1!4m5!3m4!1s0x2dd62822063dc2fb:0x78879446481a4da2!8m2!3d-7.9666204!4d112.6326321",
            "https://www.google.com/maps/place/Kota+Denpasar,+Bali/@-8.6726833,115.2242733,12z/data=!3m1!4b1!4m5!3m4!1s0x2dd2409b0e5e80db:0xe27334e8ccb9374a!8m2!3d-8.6704582!4d115.2126293",
            "https://www.google.com/maps/place/Yogyakarta,+Kota+Yogyakarta,+Daerah+Istimewa+Yogyakarta/@-7.8032504,110.3748449,13z/data=!3m1!4b1!4m5!3m4!1s0x2e7a5787bd5b6bc5:0x21723fd4d3684f71!8m2!3d-7.7955798!4d110.3694896",
            "https://www.google.com/maps/place/Palembang,+Kota+Palembang,+Sumatera+Selatan/@-2.9549685,104.7629646,11z/data=!3m1!4b1!4m5!3m4!1s0x2e3b75e8fc27a3e3:0x3039d80b220d0c0!8m2!3d-2.9760735!4d104.7754307",
            "https://www.google.com/maps/place/Makassar,+Kota+Makassar,+Sulawesi+Selatan/@-5.1114895,119.4026275,11z/data=!3m1!4b1!4m5!3m4!1s0x2dbee329d96c4671:0x3030bfbcaf770b0!8m2!3d-5.1476651!4d119.4327314",
            "https://www.google.com/maps/place/Bandung,+Kota+Bandung,+Jawa+Barat/@-6.9034495,107.6431575,11z/data=!3m1!4b1!4m5!3m4!1s0x2e68e6398252477f:0x146a1f93d3e815b2!8m2!3d-6.9174639!4d107.6191228"
    };


    static ArrayList<City> getListData() {
        ArrayList<City> list = new ArrayList<>();
        for (int position = 0; position < cityNames.length; position++) {
            City city = new City();
            city.setName(cityNames[position]);
            city.setDetail(cityDesc[position]);
            city.setPopulation(cityPop[position]);
            city.setPhoto(cityImages[position]);
            city.setProvince(cityProvince[position]);
            city.setLocation(cityLocation[position]);
            list.add(city);
        }
        return list;
    }
}
