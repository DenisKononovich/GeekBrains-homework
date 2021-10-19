/**
 * Java 1. Homework 5 Sequel
 *
 * @author Denis Kononovich
 * @version 19.10.21
 */

class HomeWork5AppSequel {
    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new Person("Ivanov Ivanko", "Junior Engineer", "ivivanko@mailbox.com", "8923123121", 300000, 40);
        persArray[2] = new Person("Ivanov Ivanok", "Midlle Engineer", "ivivanok@mailbox.com", "8923123122", 3000000, 50);
        persArray[3] = new Person("Ivanov Ivanek", "Senior Engineer", "ivivanek@mailbox.com", "8923123123", 4000000, 55);
        persArray[4] = new Person("Ivanov Ivanenko", "Intern", "ivivanenko@mailbox.com", "8923123124", 3000, 20);

        for (Person person: persArray) {
            if (person.getAge() > 40) {
                System.out.println(person);
            }
        }
    }
}

class Person {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Person (String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return ("Full name: " + name + "\nPosition: " + position + "\nE-mail: " + email + "\nPhone: " + phone + "\nSalary: " + salary + "\nAge: " + age + "\n");
    }
}