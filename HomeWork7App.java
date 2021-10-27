/**
 * Java 1. Homework 7
 *
 * @author Denis Kononovich
 * @version 27.10.21
 */

class HomeWork7App {
    public static void main(String[] args) {
        Cat[] catsArray = new Cat[3];
        catsArray[0] = new Cat("Барсик", 15);
        catsArray[1]  = new Cat("Рыжик", 2);
        catsArray[2]  = new Cat("Мурка", 4);

        Plate plate = new Plate(10, 2);

        System.out.println(plate);
        for (Cat cat : catsArray) {
            cat.setFullness();
            cat.eat(plate);
            System.out.println(cat);
        }

        System.out.println(plate);
        plate.add(2);
        System.out.println(plate);
    }
}

class Cat {
    private final String name;
    private final int appetite;
    private boolean fullness;

    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        fullness = false;
    }

    void setFullness() {
        fullness = false;
    }

    void eat(Plate plate) {
        if (!fullness) {
            fullness = plate.decreaseFood(appetite);
        }
    }

    @Override
    public String toString() {
        return "Кот " + name + ", съест: " + appetite + ", сыт: " + fullness;
    }
}

class Plate {
    int food;
    int addFood;

    Plate(int food, int addFood) {
        this.food = food;
        this.addFood = addFood;
    }

    boolean decreaseFood(int intake) {
        if (food > intake) {
            food -= intake;
            return true;
        }
        return false;
    }

    void add(int food) {
        this.food += food;
    }

    @Override
    public String toString() {
        return "Сейчас в миске: " + food;
    }
}