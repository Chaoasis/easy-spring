package test5;

import lombok.Data;

@Data
public class Husband {

    private Wife wife;

    public String queryWife(){
        return "Husband.wife";
    }

}