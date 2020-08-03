package main;

import main.zahlenschloss.Zahlenschloss;

public class Start {

    public static void main(String[] args) {
        Zahlenschloss tester = new Zahlenschloss();
        tester.closing();
        System.out.println(tester.opening(7,3,8,0));

    }
}
