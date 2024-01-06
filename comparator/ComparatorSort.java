package comparator;


import java.util.ArrayList;
import java.util.Collections;


public class ComparatorSort {
    public static void main(String[] args) {
        // створюємо список об'єктів типу Candy
        ArrayList<Candy> candies = new ArrayList<Candy>();
        candies.add(new Candy("Чупа-чупс", 50, "Карамель"));
        candies.add(new Candy("Чайка", 500, "Шоколадна"));
        candies.add(new Candy("Желейна", 100, "Фруктова"));

        // виводимо список цукерок до сортування
        System.out.println("Список цукерок до сортування:");
        for (Candy candy : candies) {
            System.out.println(candy);
        }

        // сортуємо список цукерок за назвою, використовуючи NameComparator
        Collections.sort(candies, new NameComparator());

        // виводимо список цукерок після сортування за назвою
        System.out.println("\nСписок цукерок після сортування за назвою:");
        for (Candy candy : candies) {
            System.out.println(candy);
        }

        // сортуємо список цукерок за енергетичною цінністю, використовуючи EnergyComparator
        Collections.sort(candies, new EnergyComparator());

        // виводимо список цукерок після сортування за енергетичною цінністю
        System.out.println("\nСписок цукерок після сортування за енергетичною цінністю:");
        for (Candy candy : candies) {
            System.out.println(candy);
        }
    }
}