package com.demo.object;

import java.util.Scanner;

public class Person {
    private String name;
    private int age;
    private boolean gender;
    private String address;

    public Person() {
        super();
    }

    public Person(String name, int age, boolean gender, String address) {
        super();
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("--- Nhap ho va ten: ");
        this.name = sc.nextLine();
        System.out.print("--- Nhap tuoi: ");
        this.age = sc.nextInt();
        System.out.print("--- Nhap gioi tinh: ");
        this.gender = sc.nextBoolean();
        System.out.print("--- Nhap dia chi: ");
        sc.nextLine();
        this.address = sc.nextLine();
    }

    @Override
    public String toString() {
        return "Person [address=" + address + ", age=" + age + ", gender=" + gender + ", name=" + name + "]";
    }

    public void display() {
        System.out.println(this.toString());
    }
}
