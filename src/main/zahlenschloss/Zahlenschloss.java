package main.zahlenschloss;

public class Zahlenschloss {

    private int amountOfNumbers;
    private int combination;
    private boolean closed;

    //erstellen eines Zahlenschlosses ohne Angaben erhält per Default 4 Drehscheiben
    public Zahlenschloss(){
        amountOfNumbers = 4;
    }
    public Zahlenschloss(int amountOfNumbers){
        if(amountOfNumbers > 0) {
            this.amountOfNumbers = amountOfNumbers;
        } else { this.amountOfNumbers = 4;
            System.out.println("LOG/Warning, amountOfNumbers auf default/4 gesetzt");}
    }
    //closing ohne Angaben erhält eine Zufallskombination beim Schließen
    public void closing(){
        if (!closed) {
            combination = (int) (Math.random() * 10);
            closed = true;
        } else {
            System.out.println("LOG:already closed");
        }
    }
    public void closing(int number){
        if (!closed & (number >= 0 & number <= 9)) {
            combination = number ;
            closed = true;
        } else {
            System.out.println("LOG:already closed or number out of scope");
        }
    }

    //beim Öffnen wird ein int Array mitgegeben, auf length überprüft ob es mit dem Schloss zusammenpasst. Bei Fehlern wird -1 retourniert, das SChloss bleibt zu
    public int opening(int ... numbers){
        if(numberChecker(numbers)){
        int amount = 0;

        for(int i : numbers){
            amount += minimumNumberGetter(i);
        }
        closed = false;
        return amount;
        }else{
            System.out.println("ERROR LOG: numbers are not between 0 - 9 or too few/many numbers are used");
            return -1;}
    }

    //private Methode zum checken ob die Nummern zwischen 0 - 9 liegen + ob die Anzahl der Nummern zusammenpasst
    private boolean numberChecker(int[] numbers){
        boolean numberCheck = true;
        for(int i : numbers){
            if (!(i >= 0 & i <= 9)) {
                numberCheck = false;
                break;
            }
        }
        if(!(numbers.length == amountOfNumbers)){ numberCheck = false;}
        return numberCheck;
    }

    //eruiert die minimale Drehzahl pro Drehscheibe
    private int minimumNumberGetter(int number){
        if(number == combination) return 0;
        else{
            int a = Math.abs(number - combination);
            int b = Math.abs(number - (combination+10));
            int c = Math.abs(number - (combination-10));
            return Math.min(a,Math.min(b,c));
        }
    }

    //getter
    public int getAmountOfNumbers() {
        return amountOfNumbers;
    }
    public boolean isClosed() {
        return closed;
    }
}
