package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double money = 1;
        int month =1;
        double interset_rate = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số tiền gửi :");
        money = sc.nextDouble();
        System.out.println("Nhập tháng gửi : ");
        month = sc.nextInt();
        System.out.println("Nhập lãi suất : ");
        interset_rate = sc.nextDouble();
        double total_interset = 0;
        for (int i =0;i<month;i++){
            total_interset += money * (interset_rate/100)/12*month;
        }
        System.out.println("total interset : "+total_interset);

    }
}
