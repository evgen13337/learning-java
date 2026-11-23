package ru.evg.oop.employee;

abstract class Employee {
    private String name;
    private String surname;
    private int age;

    public Employee(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public  String getFullName() {
        return "Имя - " + name + " Фамилия - " + surname;
    }

    public int getAge() {
        return age;
    }
}
