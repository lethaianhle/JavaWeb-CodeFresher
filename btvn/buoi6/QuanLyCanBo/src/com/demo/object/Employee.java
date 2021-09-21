package com.demo.object;

import java.util.Scanner;

public class Employee extends Person {
    private String job;

    public Employee(String name, int age, boolean gender, String address, String job) {
        super(name, age, gender, address);
        this.job = job;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.println("--- Nhap cong viec: ");
        this.job = sc.nextLine();
    }

    @Override
    public String toString() {
        return super.toString() + " Employee [job=" + job + "]";
    }

    @Override
    public void display() {
        System.out.println(this.toString());
    }
}
