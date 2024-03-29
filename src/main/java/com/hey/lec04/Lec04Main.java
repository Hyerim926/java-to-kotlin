package com.hey.lec04;

public class Lec04Main {

  public static void main(String[] args) {
    JavaMoney money1 = new JavaMoney(1_000L);
    JavaMoney money2 = new JavaMoney(2_000L);
    if (money1.compareTo(money2) > 0) {
      System.out.println("Money1이 Money2보다 금액이 큽니다");
    }
  }

  public static void identityEquality() {
    JavaMoney money1 = new JavaMoney(1_000L);
    JavaMoney money2 = money1;
    JavaMoney money3 = new JavaMoney(1_000L);

    System.out.println(money1 == money2); // true
    System.out.println(money1 == money3); // false
    System.out.println(money1.equals(money3)); // true
  }

  public static void plusObject() {
    JavaMoney money1 = new JavaMoney(1_000L);
    JavaMoney money2 = new JavaMoney(1_000L);
    System.out.println(money1.plus(money2));
  }

}
