package main;

import main.zahlenschloss.Zahlenschloss;

public class Start {

    public static void main(String[] args) {
        Zahlenschloss tester = new Zahlenschloss();
        tester.closing(2);
        System.out.println(tester.opening(9,8,7,6));

    }
}
