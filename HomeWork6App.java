/**
 * Java 1. Homework 6
 *
 * @author Denis Kononovich
 * @version 24.10.21
 */

class HomeWork6App {
    public static void main(String[] args) {
        Dog dog = new Dog(500, 10);
        Cat cat = new Cat(200, 0);

        System.out.println(dog.run(500));
        System.out.println(cat.run(200));
        System.out.println(dog.swim(200));
        System.out.println(cat.swim(0));

        System.out.println("\nСоздано животных: " + Animal.getCountOfAnimals());
    }
}

class Dog extends Animal {
    Dog(int runRange, int swimRange) {
        super(runRange, swimRange);
    }
}

class Cat extends Animal {
    Cat(int runRange, int swimRange) {
        super(runRange, swimRange);
    }

    @Override
    public String swim(int distance) {
        return getClassName() + " не умеет плавать.";
    }
}

abstract class Animal implements IAnimal {
    private int runRange;
    private int swimRange;
    private String className;
    private static int countOfAnimals = 0;

    Animal(int runRange, int swimRange) {
        this.runRange= runRange;
        this.swimRange = swimRange;
        className = getClass().getSimpleName();
        countOfAnimals++;
    }

    public String getClassName() {
        return className;
    }

    public static int getCountOfAnimals() {
        return countOfAnimals;
    }

    @Override
    public String run(int distance) {
        if (distance <= 0 || distance > runRange) {
            return className + " не пробежал " + distance + " м.";
        } else {
            return className + " пробежал " + distance + " м.";
        }
    }

    @Override
    public String swim(int distance) {
        if (distance <= 0 || distance > runRange) {
            return className + " не проплыл " + distance + " м.";
        } else {
            return className + " проплыл " + distance + " м.";
        }
    }
}

interface IAnimal {
    String run(int distance);
    String swim(int distance);
}