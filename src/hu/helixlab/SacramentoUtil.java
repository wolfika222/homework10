package hu.helixlab;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;


/**
 * Created by Hp_Workplace on 2017. 05. 21..
 */
public class SacramentoUtil {

    public void printCSVFromSacramentoList(ArrayList<Sacramento> arrayList, String path) {

        final String COMMA_DELIMITER = ",";
        final String NEW_LINE_SEPARATOR = "\n";
        final String FILE_HEADER = "dateTime,address,district,beat,grid,crimedscr,ncic_code,latitude,longitude";


        try {
            FileWriter fw = new FileWriter(path);

            fw.append(FILE_HEADER.toString());
            fw.append(NEW_LINE_SEPARATOR);
            for (Sacramento item : arrayList
                    ) {
                fw.append(item.getDateTime());
                fw.append(COMMA_DELIMITER);
                fw.append(item.getAddress());
                fw.append(COMMA_DELIMITER);
                fw.append(item.getDistrict());
                fw.append(COMMA_DELIMITER);
                fw.append(item.getBeat());
                fw.append(COMMA_DELIMITER);
                fw.append(String.valueOf(item.getGrid()));
                fw.append(COMMA_DELIMITER);
                fw.append(item.getCrimedescr());
                fw.append(COMMA_DELIMITER);
                fw.append(String.valueOf(item.getNcic_code()));
                fw.append(COMMA_DELIMITER);
                fw.append(String.valueOf(item.getLatitude()));
                fw.append(COMMA_DELIMITER);
                fw.append(String.valueOf(item.getLongitude()));
                fw.append(NEW_LINE_SEPARATOR);
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
