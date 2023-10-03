import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {


        //for Subject PF
        System.out.println("Enter your marks for PF:");
        Scanner sc1 = new Scanner(System.in);
        int marks1 = sc1.nextInt();
        int Pc1 = 0;
        if (marks1 >= 0 && marks1 <= 100) {
            Pc1 = (marks1 * 100) / 100;
        } else {
            System.out.print("Out Range Marks. Kindly Input Marks in Range.");
        }


        //For Linear Alegbra
        System.out.println("Enter your marks for Linear Alegbra:");
        Scanner sc2 = new Scanner(System.in);
        int marks2 = sc2.nextInt();
        int Pc2 = 0;
        if (marks2 >= 0 && marks2 <= 100) {
            Pc2 = (marks2 * 100) / 100;
        } else {
            System.out.print("Out Range Marks. Kindly Input Marks in Range.");
        }


        //for DLD
        System.out.println("Enter your marks for DLD:");
        Scanner sc3 = new Scanner(System.in);
        int marks3 = sc3.nextInt();
        int Pc3 = 0;
        if (marks3 >= 0 && marks3 <= 100) {
            Pc3 = (marks3 * 100) / 100;
        } else {
            System.out.print("Out Range Marks. Kindly Input Marks in Range.");
        }


        //for Communication and Presentation Skill
        System.out.println("Enter your marks for Communication and Presentation Skill:");
        Scanner sc4 = new Scanner(System.in);
        int marks4 = sc4.nextInt();
        int Pc4 = 0;
        if (marks4 >= 0 && marks4 <= 100) {
            Pc4 = (marks4 * 100) / 100;
        } else {
            System.out.print("Out Range Marks. Kindly Input Marks in Range.");
        }

        //for PF lab
        System.out.println("Enter your marks for PF-Lab:");
        Scanner sc5 = new Scanner(System.in);
        int marks5 = sc5.nextInt();
        int Pc5 = 0;
        if (marks5 >= 0 && marks5 <= 100) {
            Pc5 = (marks5 * 100) / 100;
        } else {
            System.out.print("Out Range Marks. Kindly Input Marks in Range.");
        }


        System.out.println("Your Marks in PF is:" + marks1);
        System.out.println("Your Percentage in PF is:" + Pc1);
        System.out.println("Your Marks in Linear Algebra is:" + marks2);
        System.out.println("Your Percentage in Linear Algebra is:" + Pc2);
        System.out.println("Your Marks in Digital Logic Design is:" + marks3);
        System.out.println("Your Percentage in Digital Logic Design is:" + Pc3);
        System.out.println("Your Marks in Communication and Presentation Skills is:" + marks4);
        System.out.println("Your Percentage in Communication and Presentation Skills is:" + Pc4);
        System.out.println("Your Marks in PF-Lab is:" + marks5);
        System.out.println("Your Percentage in PF-Lab is:" + Pc5);

        int TotalMarks = (marks1) + (marks2) + (marks3) + (marks4) + (marks5);
        System.out.println("Your Grand Total is:" + TotalMarks);
        int TotalPercentage = (TotalMarks * 100) / 500;
        System.out.println("Your overall Percentage is:" + TotalPercentage);

        if (TotalPercentage >= 90 ) {
            System.out.println("Grade: A");
        } else if (TotalPercentage >= 80){
            System.out.println("Grade: B");
        } else if (TotalPercentage >=70) {
            System.out.println("Grade: C");
        } else if (TotalPercentage >= 60) {
            System.out.println("Grade: D");
        } else if (TotalPercentage >= 50) {
            System.out.println("Grade: E");
        } else {
            System.out.println("Grade: Fail");
        }


    }
}
