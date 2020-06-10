public class Main {
    public static void main(String[] args) {
        int accout = 300;
        int refill = 200;
        int bonus = 0;
        if (refill > 1000) {
            bonus = refill / 100 ;
            accout += bonus + refill;
        } else {
            accout += refill;
        }
        System.out.println("Ваш бонус " + bonus + " рублей");
        System.out.println("У вас на счету " + accout + " рублей");
    }
}
