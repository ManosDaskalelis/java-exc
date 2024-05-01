package gr.aueb.cf.ch14.singleton;

public class SaintGeorgeKnight {
    private static SaintGeorgeKnight SINGLETON = null;

    private SaintGeorgeKnight(){

    }

    public static SaintGeorgeKnight getInstance() {
        if (SINGLETON == null) {
            SINGLETON = new SaintGeorgeKnight();
        }
        return SINGLETON;
    }
    public  void  embarkOnMission() {
        System.out.println("St. George embarks on his mission to slay the great wyrm");
    }
}
