package hu.helixlab;

/**
 * Created by Hp_Workplace on 2017. 05. 10..
 */
public class Sacramento {

    private String dateTime;
    private String address;
    private String district;
    private  String beat;
    private int grid;
    private String crimedescr;
    private int ncic_code;
    private double latitude;
    private double longitude;

    @Override
    public String toString() {
        return "Sacramento{" +
                "dateTime='" + dateTime + '\'' +
                ", address='" + address + '\'' +
                ", district='" + district + '\'' +
                ", beat=" + beat +
                ", grid=" + grid +
                ", crimedescr='" + crimedescr + '\'' +
                ", ncic_code=" + ncic_code +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String discrict) {
        this.district = discrict;
    }

    public String getBeat() {
        return beat;
    }

    public void setBeat(String beat) {
        this.beat = beat;
    }

    public int getGrid() {
        return grid;
    }

    public void setGrid(int grid) {
        this.grid = grid;
    }

    public String getCrimedescr() {
        return crimedescr;
    }

    public void setCrimedescr(String crimedescr) {
        this.crimedescr = crimedescr;
    }

    public int getNcic_code() {
        return ncic_code;
    }

    public void setNcic_code(int ncic_code) {
        this.ncic_code = ncic_code;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
