package hu.helixlab;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Hp_Workplace on 2017. 05. 21..
 */
public class SacramentoUtil {

    public void printCSVFromSacramentoList(ArrayList<Sacramento> arrayList, String path) {

        try {
            FileWriter fw = new FileWriter(path);
            for (Sacramento item : arrayList
                    ) {
                fw.write(String.valueOf(item));
            }
            fw.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void findBiggestGridByDistricts(ArrayList<Sacramento> arrayList) {

        HashMap<String, Sacramento> arrayListHashMap = new HashMap<>();

        for (Sacramento item : arrayList
                ) {
            if (arrayListHashMap.containsKey(item.getGrid()) == true) {
                if (arrayListHashMap.get(item.getDistrict()).getGrid() < item.getGrid()) {
                    arrayListHashMap.put(item.getDistrict(), item);
                }
            } else {
                arrayListHashMap.put(item.getDistrict(), item);
            }
        }
        for (Map.Entry item : arrayListHashMap.entrySet()
                ) {
            System.out.println(item.getValue());
        }
    }

    public void getStreets(ArrayList<Sacramento> arrayList) {

        for (Sacramento item : arrayList
                ) {
            if (item.getAddress().contains(" ST")) {
                System.out.println(item);
            }
        }
    }

    public int countCrimeType(ArrayList<Sacramento> arrayList) {

        int db = 0;

        for (Sacramento item : arrayList) {
            if (item.getCrimedescr().contains("VANDALISM")) {

                db++;
            }
        }

        return db;
    }
}
