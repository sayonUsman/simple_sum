package com.sum;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int number = scanner.nextInt();

    int number2 = scanner.nextInt();

    int sum = number + number2;

    System.out.printf("The sum is = %d", sum);
  }
}
