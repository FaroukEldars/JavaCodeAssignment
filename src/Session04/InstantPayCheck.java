package Session04;

import java.util.Scanner;

public class InstantPayCheck {
    static double requiredSalary = 20000;
    static double requiredCreditScore = 500;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double salary = getEmployeeSalary();
        double creditScore = getEmployeeCreditScore();
        boolean qualified = isQualified(salary, creditScore);
        notifyUser(qualified);
        scanner.close();
    }

//    static double getEmployeeInfo(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter Your Salary ");
//        double salary = scanner.nextDouble();
//        System.out.println("Enter Your Credit Score ");
//        double creditScore = scanner.nextDouble();
//        scanner.close();
//        return salary,creditScore;
//
//    }

    static double getEmployeeSalary() {
        System.out.println("Enter Your Salary ");
//        double salary = scanner.nextDouble();
//        return salary;
        return scanner.nextDouble();
    }

    static double getEmployeeCreditScore() {
        System.out.println("Enter Your Credit Score ");
        return scanner.nextDouble();
    }

    static boolean isQualified(double salary, double creditScore) {
        if (salary >= requiredSalary && creditScore >= requiredCreditScore) {
            return true;
        } else {
            return false;
        }
    }

    static void notifyUser(boolean qualified) {
        if (qualified) {
            System.out.println("Congrats , you are qualified for the loan");
        } else {
            System.out.println("Sorry , You are not qualified for the loan");
        }
    }
}