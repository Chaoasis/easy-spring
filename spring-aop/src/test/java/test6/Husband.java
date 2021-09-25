package test6;

import java.time.LocalDate;

public class Husband {

    private String wifeName;

    private LocalDate marriageDate;

    public String getWifiName() {
        return wifeName;
    }

    public void setWifiName(String wifiName) {
        this.wifeName = wifiName;
    }

    public LocalDate getMarriageDate() {
        return marriageDate;
    }

    public void setMarriageDate(LocalDate marriageDate) {
        this.marriageDate = marriageDate;
    }

    @Override
    public String toString() {
        return "Husband{" +
                "wifeName='" + wifeName + '\'' +
                ", marriageDate=" + marriageDate +
                '}';
    }

}