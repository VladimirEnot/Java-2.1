public class Main {
    public static void main(String[] args) {
        int x = 100 ; // Первоначальная сумма
        int y = 1100 ; // Сумма пополнения
        int bonus = 1; // Бонусные рубли
        int q; // Итоговая сумма

        q = x + y + bonus ;
        if (y > 1000) {
            bonus = y / 100;
        } else {
            bonus = 0;
            q = x + y;
        }
        System.out.println("Итоговый бонус составил :" + bonus + "рублей");
        System.out.println("Итоговый счет составил :" + q + "рублей");
    }

}




