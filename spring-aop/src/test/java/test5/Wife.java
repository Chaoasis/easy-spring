package test5;

import lombok.Data;

@Data
public class Wife {

    //private Husband husband;
    private IMother mother;

    public String queryHusband() {
        return "Wife.husband、Mother.callMother：" + mother.callMother();
    }

}