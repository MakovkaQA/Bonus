public class Main {
    public static void main(String[] args) {
        double balance = 100.78;
        double refill = 2580.40;

        int bonus;

        if (refill > 1000) {
            bonus = (int) (refill / 100);
        } else {
            bonus = 0;
        }
        ;

        double result = balance + refill + bonus;

        System.out.println("Начислено бонусов: " + bonus);
        System.out.println("Итого на счету: " + (String.format("%(.2f", result)));
    }
}