package task5_4;

/* Згенерувати клас, що відповідає даному опису.
 candy.xml(C:\Users\My comp\IdeaProjects\Lesson48\src\main\java\task2\candy.xml)
 */
public class Candy {
    // Поля класу
    private String name;
    private int energy;
    private String candyType;
    private int water;
    private int sugar;
    private int fructose;
    private int vanillin;
    private int protein;
    private int fat;
    private int carbohydrate;
    private String production;

    // Конструктор класу
    public Candy(String name, int energy, String candyType, int water, int sugar, int fructose, int vanillin, int protein, int fat, int carbohydrate, String production) {
        this.name = name;
        this.energy = energy;
        this.candyType = candyType;
        this.water = water;
        this.sugar = sugar;
        this.fructose = fructose;
        this.vanillin = vanillin;
        this.protein = protein;
        this.fat = fat;
        this.carbohydrate = carbohydrate;
        this.production = production;
    }

    // Геттери і сеттери для полів класу
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

    public String getCandyType() {
        return candyType;
    }

    public void setCandyType(String candyType) {
        this.candyType = candyType;
    }

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public int getSugar() {
        return sugar;
    }

    public void setSugar(int sugar) {
        this.sugar = sugar;
    }

    public int getFructose() {
        return fructose;
    }

    public void setFructose(int fructose) {
        this.fructose = fructose;
    }

    public int getVanillin() {
        return vanillin;
    }

    public void setVanillin(int vanillin) {
        this.vanillin = vanillin;
    }

    public int getProtein() {
        return protein;
    }

    public void setProtein(int protein) {
        this.protein = protein;
    }

    public int getFat() {
        return fat;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public int getCarbohydrate() {
        return carbohydrate;
    }

    public void setCarbohydrate(int carbohydrate) {
        this.carbohydrate = carbohydrate;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    // Метод, що повертає рядкове представлення об'єкта класу
    public String toString() {
        return "Candy{" +
                "name='" + name + '\'' +
                ", energy=" + energy +
                ", candyType='" + candyType + '\'' +
                ", water=" + water +
                ", sugar=" + sugar +
                ", fructose=" + fructose +
                ", vanillin=" + vanillin +
                ", protein=" + protein +
                ", fat=" + fat +
                ", carbohydrate=" + carbohydrate +
                ", production='" + production + '\'' +
                '}';
    }
}
