package ru.evg.oop.employee;

public class Programmer extends Employee implements Payable {
    private double salary;
    private double bonus;

    public Programmer(String name, String surname, int age, double salary, double bonus) {
        super(name, surname, age);
        this.bonus = bonus;
        this.salary = salary;
    }

    @Override
    public double calculateSalary() {
        return salary + bonus;
    }
}
