public class Main {
    public static void main(String[] args) {
        int accout = 100;
        int refill = 2000;
        if (refill > 1000) {
            accout += refill / 100 + refill;
        } else {
            accout += refill;
        }
        System.out.println("У вас на счету " + accout + " рублей");
    }
}