package hu.helixlab;

import java.io.FileWriter;
import java.util.ArrayList;

/**
 * Created by Hp_Workplace on 2017. 05. 21..
 */
public class SacramentoUtil {

    public void printCSVFromSacramentoList(ArrayList<Sacramento> arrayList, String path){

        try {
            FileWriter fw = new FileWriter(path);
            for (Sacramento item : arrayList
                 ) {
                fw.write(String.valueOf(item));
            }
            fw.close();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
