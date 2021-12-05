package simple.example.hewanpedia;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import simple.example.hewanpedia.model.Katak;
import simple.example.hewanpedia.model.Hewan;
import simple.example.hewanpedia.model.Kupu;
import simple.example.hewanpedia.model.Semut;

public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Katak> initDataKatak(Context ctx) {
        List<Katak> kataks = new ArrayList<>();
        kataks.add(new Katak("kodok batu", "jawa",
                "Merupakan jenis katak sungai yang umum ditemukan di sungai-sungai di Jawa. Katak ini juga dapat ditemukan di Sumatera Selatan dan Lampung. Hingga hari ini status katak ini adalah rawan (Vulnerable).", R.drawable.kodok1));
        kataks.add(new Katak("katak bertanduk", "Unknow",
                "Merupakan jenis katak yang hidup di lantai hutan yang banyak terdapat serasah.. Saat katak bertanduk berkamuflase, maka sangat sulit bagi kita untuk menemukannya.", R.drawable.kodok2));
        kataks.add(new Katak("mulut sempit", "indonesia",
                "Beberapa jenis dari famili ini memiliki ukuran hanya beberapa milimeter saja. DiIndonesia sendiri dapat ditemukan sedikitnya 30-an jenis katak bermulut sempit yang tersebar diseluruh penjuru negeri.", R.drawable.kodok3));
        kataks.add(new Katak("katak pohon", "unknow",
                "Adalah jenis-jenis katak yang hidup di pohon. Jenis katak ini biasa ditemukan menempel pada daun, batang, atau ranting pohon", R.drawable.kodok4));

        return kataks;
    }


    private static List<Kupu> initDataKupu(Context ctx) {
        List<Kupu> kupus = new ArrayList<>();
        kupus.add(new Kupu("Milbert tortoiseshell butterfly", "amerika utara",
                "Milbert tortoiseshell butterfly memiliki lebar sayap 4,2 – 6,3 cm, dan berasal dari Amerika Utara dari Alaska selatan hingga ke Meksiko.",R.drawable.kupu1));
        kupus.add(new Kupu("Zebra Swallowtail", "unknow",
                "adalah kupu-kupu yang sayapnya berwarna hitam dan putih yang khas dan memiliki sayap panjang kebelakang layaknya ekor.",R.drawable.kupu2));
        kupus.add(new Kupu("Red Admiral ","rawa",
                "adalah kupu-kupu yang memiliki kemampuan terbang cepat dan jenis ini adalah kupu kupu migrasi yang umum ditemukan di daerah beriklim utara berawa-rawa di Asia, Eropa dan Amerika Utara.", R.drawable.kupu3));
        kupus.add(new Kupu("Monarch", "---",
                "Monarch adalah kupu-kupu beracun yang memiliki lebar sayap 8,6 – 12,4 cm dan umum ditemukan di seluruh dunia.", R.drawable.kupu4));
        return kupus;
    }
    private static List<Semut> initDataSemut(Context ctx) {
        List<Semut> semuts = new ArrayList<>();
        semuts.add(new Semut("tukang kayu", "unknow",
                "Banyak orang yang juga mengenali jenis semut yang satu ini yaitu berwarna hitam dan juga ada yang bercampur merah semu hitam", R.drawable.semut1));
        semuts.add(new Semut("semut gila", "unknow",
                "Sesuai dengan namanya yaitu semut gila, jenis semut yang satu ini susah dikendalikan jika habitatnya merasa terganggu dan pada saat mencari makanan", R.drawable.semut2));
        semuts.add(new Semut("semut hantu", "Italia",
                "Semut jenis ini pastinya sudah banyak diketahui oleh orang, bahkan dapat dibilang semua orang pasti tahu dan mengenalnya dengan sebutan semut gula", R.drawable.semut3));
        semuts.add(new Semut("fir'aun", "mesir",
                "semut ini juga memiliki koloni yang cukup banyak hingga 300.000 jumlahnya.. Sesuai dengan namanya juga semut ini memiliki keistimewaan dapat bertahan hidup di daerah yang memiliki tingkat kelembaban dan juga hawa hangat yang berimbang", R.drawable.semut4));

        return semuts;
    }


    private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataKatak(ctx));
        hewans.addAll(initDataSemut(ctx));
        hewans.addAll(initDataKupu(ctx));
    }
    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}