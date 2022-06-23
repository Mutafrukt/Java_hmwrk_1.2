public class Main {
    public static void main(String[] args) {

        int amount = 100;
        int replenishmentAmount = 2000;
        int bonus;
        if (replenishmentAmount > 1000) {
            bonus = replenishmentAmount / 100;
            System.out.println("Начислено бонусных рублей: " + bonus + " р");
        } else {
            bonus = 0;
            System.out.println("Сумма пополнения недостаточна для начисления бонусов(");
        }
        System.out.println("Счёт до пополнения: " + amount + " р");
        System.out.println("Пополнено на: " + replenishmentAmount + " р");
        int result = amount + replenishmentAmount + bonus;
        System.out.println("Итоговый счёт: " + result + " р");

    }
}


// Объявляете переменные для входных данных и
// параметров программы: начального счёта,
// суммы пополнения и тп

// Условным оператором проверяете превысила ли
// сумма пополнения порог и для этих двух разных
// сценариев рассчитываете сумму бонуса и выводите
// на экран.