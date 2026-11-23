package ru.evg.oop.employee;

public class Main {
     static void main(String[] args) {
         Programmer programmer = new Programmer("Petr", "Kakashnim", 42,100000, 20000);
         System.out.println(programmer.getFullName());
         System.out.println("Возраст - " + programmer.getAge());
         System.out.println(programmer.calculateSalary());
    }
}

