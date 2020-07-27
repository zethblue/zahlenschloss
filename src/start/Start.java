package start;

import start.zahlenschloss.Zahlenschloss;

public class Start {

    public static void main(String[] args) {

        Zahlenschloss z1 = new Zahlenschloss(4);
        z1.closing();
        z1.DEVstatus();
        System.out.println(z1.opening(1,1,1,1));

    }
}
