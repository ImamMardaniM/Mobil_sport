package com.example.mobilsport;

import java.util.ArrayList;

public class Isi_Mobil {
    public static String[][] data = new String[][]{
            {"Maybach Exelero", "Saat ini Maybach Exelero merupakan mobil termewah di dunia dengan harga yang mencapai 8 juta dollar Amerika. -", "https://urusandunia.com/wp-content/uploads/2017/06/mobil-mewah-Maybach-Exelero.jpg"},
            {"Lamborghini Veneno", "Mobil mewah berikutnya diduduki oleh Lamborghini Veneno yang mempunyai desain sporty dengan body yang aerodinamis berbahan carbon fiber.", "https://urusandunia.com/wp-content/uploads/2017/06/foto-mobil-mewah-lamborghini-veneno.jpg"},
            {"Lykan Hypersport", "Lykan Hypersport kerap dicari oleh para pecinta otomotif. Pasalnya mobil ini hanya diproduksi secara terbatas yang dibandrol dengan harga 3.4 Juta Dollar. ", "https://urusandunia.com/wp-content/uploads/2017/06/gambar-mobil-mewah-lykan-hypersport.jpg"},
            {"Ferrari F60 Amerika", "Mobil mewah Ferrari F60 sudah dilengkapi dengan tenaga mid front mounted V12 yang menghasilkan tenaga mencapai 740 . Karena spesifikasi mesin tersebut Ferrari dapat mencapai kecepatan hingga 320 km/jam.", "https://urusandunia.com/wp-content/uploads/2017/06/mobil-termewah-di-dunia-ferrari-f60-america.jpg"},
            {"Bugatti Veyron", "Bugatti Veyron Super Sports merupakan mobil mewah sekaligus mobil tercepat untuk saat ini. Mesin yang terdapat pada mobil ini sangatlah canggih, pasalnya tenaga yang dihasilkan mencapai 1.200 dengan torsi maksimal 1.500 nm.", "https://urusandunia.com/wp-content/uploads/2017/06/mobil-sport-Bugatti-Veyron-Super-Sports.jpg"},
            {"Lamborghini Reventon", "Lamborghini Reventon telah dilengkapi dengan mesin V12 yang dapat menghasilkan tenaga maksimal hingga 650 serta mampu berpindah dari 0-100 km/jam hanya dalam waktu 3.4 detik.", "https://urusandunia.com/wp-content/uploads/2017/06/harga-mobil-sport-Lamborghini-Reventon-1024x547.jpg"},
            {"Aston Martin One-77", "Aston Martin One 77 telah dilengkapi dengan mesin V12 berkapasitas 7.3 liter yang dapat menghasilkan tenaga hingga 750 dk serta torsi maksimal mencapai 722 nm.", "https://urusandunia.com/wp-content/uploads/2017/06/mobil-sport-termahal-Aston-Martin-One-77.jpg"},
            {"Ferrari LaFerrari", "Ferrari mampu mencapai 0-100 km/jam hanya dalam waktu 3 detik dengan kecepatan 350 km/jam. Ferrari LaFerrari dibanderol dengan harga 1.7 juta Dollar.", "https://urusandunia.com/wp-content/uploads/2017/06/mobil-sport-indonesia-Ferrari-LaFerrari.jpg"},
            {"Koenigsegg Agera R", "Koenigsegg Agera R dapat menempuh jarak dari 0-100 km/jam hanya membutuhkan waktu 2.8 detik. Koenigsegg Agera R dibandrol dengan harga 1.6 juta dollar.", "https://urusandunia.com/wp-content/uploads/2017/06/mobil-sport-mewah-Koenigsegg-Agera-R.jpg"},
            {"McLaren P1", "Adanya sistem hibrida pada MCLaren P1 sehingga mampu menghasilkan tenaga 177 hp dengan torsi 131 Nm. Oleh karena itu tidak heran jika mobil McLaren P1 dibanderol dengan harga 1.5 juta dollar.", "https://urusandunia.com/wp-content/uploads/2017/06/mobil-termahal-di-dunia-McLaren-P1.jpg"},
    };

    public static ArrayList<Mobil_Data> getListData() {
        ArrayList<Mobil_Data> list = new ArrayList<>();
        for (String[] mData : data){
            Mobil_Data data_mobil = new Mobil_Data();
            data_mobil.setNama(mData[0]);
            data_mobil.setDesc(mData[1]);
            data_mobil.setFoto(mData[2]);
            list.add(data_mobil);
        }
        return list;
    }
}
