package com.demo.object;

import java.util.Scanner;

public class Worker extends Person {
    private int level;

    public Worker() {
        super();
    }

    public Worker(String name, int age, boolean gender, String address, int level) {
        super(name, age, gender, address);
        this.level = level;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.print("--- Nhap level: ");
        this.level = sc.nextInt();
    }

    @Override
    public String toString() {
        return super.toString() + " Worker [level=" + level + "]";
    }

    @Override
    public void display() {
        System.out.println(this.toString());
    }

}
