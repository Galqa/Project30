package comparator;


import java.util.Comparator;

class NameComparator implements Comparator<Candy> {

    // метод, який повертає результат порівняння двох об'єктів цукерок
    public int compare(Candy c1, Candy c2) {
        // використовуємо метод compareTo класу String для порівняння назв
        return c1.getName().compareTo(c2.getName());
    }
}