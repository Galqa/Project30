package task5_4;

public class Main {
    public static void main(String[] args) {

        // Створюємо три об'єкти класу Candy з різними параметрами
        Candy candy1 = new Candy("Чупа-чупс", 50, "Карамель", 100, 200, 50, 1, 0, 0, 75, "Сяйво");
        Candy candy2 = new Candy("Чайка", 500, "Шоколадна", 10, 150, 0, 12, 10, 25, 10, "Арія");
        Candy candy3 = new Candy("Желейна", 100, "Фруктова", 50, 100, 50, 1, 5, 0, 65, "Срібло");

        System.out.println(candy1);
        System.out.println(candy2);
        System.out.println(candy3);
    }
}
