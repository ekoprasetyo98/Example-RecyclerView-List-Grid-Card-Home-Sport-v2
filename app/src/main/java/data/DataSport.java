package data;

import com.example.homesportv2.R;
import com.example.homesportv2.sport;

import java.util.ArrayList;

public class DataSport {
    private static String[] act = {
        "Pemanasan",
        "Skiping",
        "Push Up",
        "Sit Up",
        "Pull Up",
        "Istirahat Pernafasan"
    };

    private static String[] actDetail = {
            "Lakukan pemanasan dari kepala sampai kaki selama 10-menit. Usahakan Semua badan bergerak. Bisa dimulai dari kepala, bahu, tangan, perut, pinggul dan kaki.",
            "Lakukan Skiping selama 10 menit sampai 15 menit. Atur nafas dan gerakan lompat. Mata tetap fokus menghadap ke depan.",
            "Lakukan Push Up sebanyak 20 sampai 30 kali. Lakukan secara perlahan dan stabil.",
            "Lakukan Sit Up sebanyak 15 sampai 20 kali. Lakukan secara perlahan dan stabil.",
            "Lakukan Pull Up semaksimal mungkin. Fokuskan tenaga pada perut dan jari anda. Usahakan kaki lurus dan tidak bergerak terlalu banyak.",
            "Lakukan istirahat selama 5-7 menit dengan mengatur pernafasan secara perlahan"



    };

    private static int[] pict = {
            R.drawable.bc,
            R.drawable.skiping,
            R.drawable.push,
            R.drawable.situp,
            R.drawable.pull,
            R.drawable.breath

    };

    public static ArrayList<sport> getListData() {
        ArrayList<sport> list = new ArrayList<>();
        for (int position = 0; position < act.length; position++){
            sport olahraga = new sport();
            olahraga.setName(act[position]);
            olahraga.setDetail(actDetail[position]);
            olahraga.setPict(pict[position]);
            list.add(olahraga);
        }
        return list;
    }
}
