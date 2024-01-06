package comparator;




class Candy {
    private String name; // назва цукерки
    private int energy; // енергетична цінність
    private String type; // тип цукерки

    // конструктор класу
    public Candy(String name, int energy, String type) {
        this.name = name;
        this.energy = energy;
        this.type = type;
    }

    // геттери і сеттери для полів класу
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    // метод, який повертає рядкове представлення об'єкта
    public String toString() {
        return "Назва: " + name + ", Енергія: " + energy + ", Тип: " + type;
    }
}