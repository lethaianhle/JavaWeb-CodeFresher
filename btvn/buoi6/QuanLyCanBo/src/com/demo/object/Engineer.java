package com.demo.object;

import java.util.Scanner;

public class Engineer extends Person {
    private String trainingIndustry;

    public Engineer(String name, int age, boolean gender, String address, String trainingIndustry) {
        super(name, age, gender, address);
        this.trainingIndustry = trainingIndustry;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.println("--- Nhap nghanh dao tao: ");
        this.trainingIndustry = sc.nextLine();
    }

    @Override
    public String toString() {
        return super.toString() + " Engineer [trainingIndustry=" + trainingIndustry + "]";
    }

    @Override
    public void display() {
        System.out.println(this.toString());
    }
}
