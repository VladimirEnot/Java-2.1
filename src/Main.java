public class Main {
    public static void main(String[] args) {
        int startingBalance = 100 ; // Первоначальная сумма
        int refill = 1100 ; // Сумма пополнения
        int bonus = 1; // Бонусные рубли
        int totalBalance; // Итоговая сумма

        totalBalance = startingBalance + refill + bonus ;
        if (refill > 1000) {
            bonus = refill / 100;
        } else {
            bonus = 0;
            totalBalance = startingBalance + refill;
        }
        System.out.println("Итоговый бонус составил :" + bonus + "рублей");
        System.out.println("Итоговый счет составил :" + totalBalance + "рублей");
    }

}




