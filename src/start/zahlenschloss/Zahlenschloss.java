package start.zahlenschloss;

public class Zahlenschloss {

    private int amountOfNumbers;
    private int combination;
    private boolean closed;

    public Zahlenschloss(){
        amountOfNumbers = 4;
    }
    public Zahlenschloss(int amountOfNumbers){
        this.amountOfNumbers = amountOfNumbers;
    }
    public void closing(){
        if (!closed) {
            combination = (int) (Math.random() * 10);
            closed = true;
        } else {
            System.out.println("LOG:already closed");
        }
    }
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
    private boolean numberChecker(int[] numbers){
        boolean numberCheck = true;
        for(int i : numbers){
            if(!(i >= 0 & i <= 9)){numberCheck = false;}
        }
        if(!(numbers.length == amountOfNumbers)){ numberCheck = false;}
        return numberCheck;
    }
    private int minimumNumberGetter(int number){
        if(number == combination) return 0;
        else{
            int a = Math.abs(number - combination);
            int b = Math.abs(number - combination+10);
            return Math.min(a, b);
        }
    }
    public void DEVstatus(){
        System.out.println(amountOfNumbers + " = amountOfNumbers");
        System.out.println(combination + " = combination");
        System.out.println(closed + " = is closed");



    }
}
