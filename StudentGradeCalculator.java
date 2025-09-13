package Programs;

import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        int m1, m2, m3, m4, m5, sum;
        float avg;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Java marks : ");
        m1 = sc.nextInt();
        System.out.print("Enter C++ marks : ");
        m2 = sc.nextInt();
        System.out.print("Enter Python marks : ");
        m3 = sc.nextInt();
        System.out.print("Enter Cyber Security marks : ");
        m4 = sc.nextInt();
        System.out.print("Enter Software Testing marks : ");
        m5 = sc.nextInt();

        sum = m1 + m2 + m3 + m4 + m5;
        System.out.println("Total Marks : " + sum);

        avg = sum / 5.0f;
        System.out.println("Overall Percentage : " + avg);

        // Subject-wise fail check
        if (m1 < 35 || m2 < 35 || m3 < 35 || m4 < 35 || m5 < 35) {
            System.out.println("Result: Failed (because one or more subjects are below 35)");
        } else {
            // Grade calculation only if passed in all subjects
            if (avg >= 95) {
                System.out.println("Grade: O");
            } else if (avg >= 85) {
                System.out.println("Grade: A+");
            } else if (avg >= 75) {
                System.out.println("Grade: A");
            } else if (avg >= 65) {
                System.out.println("Grade: B+");
            } else if (avg >= 55) {
                System.out.println("Grade: B");
            } else if (avg >= 45) {
                System.out.println("Grade: C");
            } else if (avg >= 35) {
                System.out.println("Grade: D");
            } else {
                System.out.println("Result: Failed");
            }
        }

        sc.close();
    }
}
