package comparator;


import java.util.Comparator;

// клас, який реалізує інтерфейс Comparator для порівняння цукерок за енергетичною цінністю
class EnergyComparator implements Comparator<Candy> {
    // метод, який повертає результат порівняння двох об'єктів цукерок
    public int compare(Candy c1, Candy c2) {
        // використовуємо арифметичну операцію для порівняння енергетичних цінностей
        return c1.getEnergy() - c2.getEnergy();
    }
}
