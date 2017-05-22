package hu.helixlab;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        ArrayList<Sacramento> sacramento = new ArrayList<>();
        SacramentoUtil sacramentoUtil = new SacramentoUtil();

        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Hp_Workplace\\IdeaProjects\\sacramento\\doksi\\SacramentocrimeJanuary2006.txt"))) {

            String line;
            String[] row = null;
            while ((line = br.readLine()) != null) {
                row = line.split(",");
                Sacramento tmp = new Sacramento();
                tmp.setDateTime(row[0]);
                tmp.setAddress(row[1]);
                tmp.setDistrict(row[2]);
                tmp.setBeat(row[3]);
                tmp.setGrid(Integer.parseInt(row[4]));
                tmp.setCrimedescr(row[5]);
                tmp.setNcic_code(Integer.parseInt(row[6]));
                tmp.setLatitude(Double.parseDouble(row[7]));
                tmp.setLongitude(Double.parseDouble(row[8]));

                sacramento.add(tmp);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        sacramentoUtil.printCSVFromSacramentoList(sacramento,"C:\\Users\\Hp_Workplace\\IdeaProjects\\homework10\\doksi\\Sacramento.csv" );
    }
}
