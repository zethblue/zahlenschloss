package main.zahlenschloss;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ZahlenschlossTest {


    @Test
    void testClosingDefault() {
        Zahlenschloss tester = new Zahlenschloss();
        tester.closing();
        assertTrue(tester.isClosed());
    }

    @Test
    void testClosingCustomZahlenschloss() {
        Zahlenschloss tester = new Zahlenschloss(3);
        tester.closing();
        assertTrue(tester.isClosed());
        assertEquals(3, tester.getAmountOfNumbers());

    }

    @Test
    void testClosingCustomClosing() {
        Zahlenschloss tester = new Zahlenschloss();
        tester.closing(9);
        assertTrue(tester.isClosed());

    }

    @Test
    void testClosingCustomZahlenschlossCustomClosing() {
        Zahlenschloss tester = new Zahlenschloss(3);
        tester.closing(9);
        assertTrue(tester.isClosed());
        assertEquals(3, tester.getAmountOfNumbers());

    }

    @Test
    void testOpeningDefault1() {
        Zahlenschloss tester = new Zahlenschloss();
        tester.closing(5);
        assertEquals(4+3+2+1,tester.opening(1,2,3,4));
        assertEquals(4+3+2+1,tester.opening(9,8,7,6));
        }

    @Test
    void testOpeningDefault2() {
        Zahlenschloss tester = new Zahlenschloss();
        tester.closing(2);
        assertEquals(1+0+1+2,tester.opening(1,2,3,4));
        assertEquals(3+4+5+4,tester.opening(9,8,7,6));
    }

    @Test
    void testOpeningCustom1() {
        Zahlenschloss tester = new Zahlenschloss(3);
        tester.closing(5);
        assertEquals(4+3+2,tester.opening(1,2,3));
        assertEquals(4+3+2,tester.opening(9,8,7));
    }

    @Test
    void testOpeningCustom2() {
        Zahlenschloss tester = new Zahlenschloss(3);
        tester.closing(2);
        assertEquals(1+0+1,tester.opening(1,2,3));
        assertEquals(3+4+5,tester.opening(9,8,7));
    }

    @Test
    void testWrongInputs1() {
        Zahlenschloss tester = new Zahlenschloss();
        tester.closing(11);
        assertFalse(tester.isClosed());

    }

    @Test
    void testWrongInputs2() {
        Zahlenschloss tester = new Zahlenschloss(-3);
        tester.closing();
        assertEquals(4,tester.getAmountOfNumbers());

    }


}