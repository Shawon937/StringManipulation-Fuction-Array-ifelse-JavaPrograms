// Write a program to calculate GPA and find grade

package ifelse_and_loop;

import java.util.Scanner;

public class _2_CalculateGPA {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Marks obtained in Bangla: ");
        double bangla = sc.nextDouble();
        System.out.print("Enter Marks obtained in English: ");
        double english = sc.nextDouble();
        System.out.print("Enter Marks obtained in Math: ");
        double math = sc.nextDouble();
        System.out.print("Enter Marks obtained in Science: ");
        double science = sc.nextDouble();
        System.out.print("Enter Marks obtained in Religion: ");
        double religion = sc.nextDouble();

        double banGp = 0, engGp = 0, mathGp = 0, sciGp = 0, relGp = 0;
        String banGrade = "", engGrade = "", mathGrade = "", sciGrade = "", relGrade = "";
        double gpa;


        //Bangla
        if (bangla >= 80 && bangla <= 100) {
            banGrade = "A+";
            banGp = 5;
        } else if (bangla >= 70 && bangla < 80) {
            banGrade = "A";
            banGp = 4;
        } else if (bangla >= 60 && bangla < 70) {
            banGrade = "A-";
            banGp = 3.5;
        } else if (bangla >= 50 && bangla < 60) {
            banGrade = "B";
            banGp = 3;
        } else if (bangla >= 40 && bangla < 50) {
            banGrade = "C";
            banGp = 2;
        } else if (bangla >= 33 && bangla < 40) {
            banGrade = "D";
            banGp = 1;
        } else if (bangla >= 0 && bangla < 33) {
            banGrade = "F";
            banGp = 0;
        } else {
            banGrade = "N/A";
            System.out.println("\nInvalid Number for Bangla." +
                    "Hence GradePoint for Bangla is Counted as 0.0");
        }

        //English
        if (english >= 80 && english <= 100) {
            engGrade = "A+";
            engGp = 5;
        } else if (english >= 70 && english < 80) {
            engGrade = "A";
            engGp = 4;
        } else if (english >= 60 && english < 70) {
            engGrade = "A-";
            engGp = 3.5;
        } else if (english >= 50 && english < 60) {
            engGrade = "B";
            engGp = 3;
        } else if (english >= 40 && english < 50) {
            engGrade = "C";
            engGp = 2;
        } else if (english >= 33 && english < 40) {
            engGrade = "D";
            engGp = 1;
        } else if (english >= 0 && english < 33) {
            engGrade = "F";
            engGp = 0;
        } else {
            engGrade = "N/A";
            System.out.println("\nInvalid Number for English." +
                    "Hence GradePoint for English is Counted as 0.0");
        }

        //Math
        if (math >= 80 && math <= 100) {
            mathGrade = "A+";
            mathGp = 5;
        } else if (math >= 70 && math < 80) {
            mathGrade = "A";
            mathGp = 4;
        } else if (math >= 60 && math < 70) {
            mathGrade = "A-";
            mathGp = 3.5;
        } else if (math >= 50 && math < 60) {
            mathGrade = "B";
            mathGp = 3;
        } else if (math >= 40 && math < 50) {
            mathGrade = "C";
            mathGp = 2;
        } else if (math >= 33 && math < 40) {
            mathGrade = "D";
            mathGp = 1;
        } else if (math >= 0 && math < 33) {
            mathGrade = "F";
            mathGp = 0;
        } else {
            mathGrade = "N/A";
            System.out.println("\nInvalid Number for Math." +
                    "Hence GradePoint for Math is Counted as 0.0");
        }

        //Science
        if (science >= 80 && science <= 100) {
            sciGrade = "A+";
            sciGp = 5;
        } else if (science >= 70 && science < 80) {
            sciGrade = "A";
            sciGp = 4;
        } else if (science >= 60 && science < 70) {
            sciGrade = "A-";
            sciGp = 3.5;
        } else if (science >= 50 && science < 60) {
            sciGrade = "B";
            sciGp = 3;
        } else if (science >= 40 && science < 50) {
            sciGrade = "C";
            sciGp = 2;
        } else if (science >= 33 && science < 40) {
            sciGrade = "D";
            sciGp = 1;
        } else if (science >= 0 && science < 33) {
            sciGrade = "F";
            sciGp = 0;
        } else {
            sciGrade = "N/A";
            System.out.println("\nInvalid Number for Science." +
                    "Hence GradePoint for Science is Counted as 0.0");
        }

        //Religion
        if (religion >= 80 && religion <= 100) {
            relGrade = "A+";
            relGp = 5;
        } else if (religion >= 70 && religion < 80) {
            relGrade = "A";
            relGp = 4;
        } else if (religion >= 60 && religion < 70) {
            relGrade = "A-";
            relGp = 3.5;
        } else if (religion >= 50 && religion < 60) {
            relGrade = "B";
            relGp = 3;
        } else if (religion >= 40 && religion < 50) {
            relGrade = "C";
            relGp = 2;
        } else if (religion >= 33 && religion < 40) {
            relGrade = "D";
            relGp = 1;
        } else if (religion >= 0 && religion < 33) {
            relGrade = "F";
            relGp = 0;
        } else {
            relGrade = "N/A";
            System.out.println("\nInvalid Number for Religion." +
                    "Hence GradePoint for Religion is Counted as 0.0");
        }
        Double TotalGp = banGp + engGp + mathGp + sciGp + relGp;
        gpa = TotalGp / 5;
        String totalGrade = "";

        //Overall Grade
        if (banGp != 0 && engGp != 0 && mathGp != 0 && sciGp != 0 && relGp != 0) {
            if (gpa == 5) {
                totalGrade = "A+";
            } else if (gpa >= 4 && gpa < 5) {
                totalGrade = "A";
            } else if (gpa >= 3.5 && gpa < 4) {
                totalGrade = "A-";
            } else if (gpa >= 3 && gpa < 3.5) {
                totalGrade = "B";
            } else if (gpa >= 2.5 && gpa < 3) {
                totalGrade = "C";
            } else if (gpa >= 2 && gpa < 2.5) {
                totalGrade = "D";
            }
        } else {
            totalGrade = "F";
        }

        System.out.println();
        System.out.println("Subject: " + " Marks" + " Grade " + " " + "GradePoint ");
        System.out.println("Bangla\t  " + bangla + " \t " + banGrade + "\t   " + banGp);
        System.out.println("English\t  " + english + " \t " + engGrade + "\t   " + engGp);
        System.out.println("Math\t  " + math + " \t " + mathGrade + "\t   " + mathGp);
        System.out.println("Science\t  " + science + " \t " + sciGrade + "\t   " + sciGp);
        System.out.println("Religion  " + religion + " \t " + relGrade + "\t   " + relGp);

        System.out.println("\n" + "GPA\t   " + "Overall_Grade");
        System.out.println(gpa + "\t\t\t" + totalGrade);


    }
}