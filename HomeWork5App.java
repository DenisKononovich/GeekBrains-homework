/**
 * Java 1. Homework 5
 *
 * @author Denis Kononovich
 * @version 19.10.21
 */

class HomeWork5App {
    public static void main(String[] args) {
        Employee employee = new Employee("Vasily Utkin Artemovich", "Junior Seller", "Vasily.Utkin@sell-m.com", "+3752912345678", 500, 33);
        System.out.println(employee);
    }
}

class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    Employee (String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public String toString() {
        return ("Full name: " + name + "\nPosition: " + position + "\nE-mail: " + email + "\nPhone: " + phone + "\nSalary: " + salary + "\nAge: " + age);
    }
}