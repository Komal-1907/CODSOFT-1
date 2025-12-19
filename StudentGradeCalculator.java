
import java.util.Scanner;

class Student {

        int[] marks;
        int total = 0;
        double average;
        char grade;
        String result;

        void inputMarks(int n) {
                Scanner scan = new Scanner(System.in);
                marks = new int[n];

                for (int i = 0; i < n; i++) {
                        System.out.print("Enter marks of subject " + (i + 1) + ": ");
                        marks[i] = scan.nextInt();
                        total += marks[i];
                }
        }

        void calculate() {
                average = (double) total / marks.length;

                if (average >= 90)
                        grade = 'A';
                else if (average >= 80)
                        grade = 'B';
                else if (average >= 70)
                        grade = 'C';
                else if (average >= 60)
                        grade = 'D';
                else if (average >= 50)
                        grade = 'E';
                else
                        grade = 'F';

                if (average >= 40)
                        result = "PASS";
                else
                        result = "FAIL";
        }

        void display() {
                System.out.println("\nTotal Marks: " + total);
                System.out.println("Average Percentage: " + average + "%");
                System.out.println("Grade: " + grade);
                System.out.println("Result: " + result);
        }
}

public class StudentGradeCalculator {
        public static void main(String[] args) {

                Scanner scan = new Scanner(System.in);
                Student s = new Student();

                System.out.print("Enter number of subjects: ");
                int n = scan.nextInt();

                s.inputMarks(n);
                s.calculate();
                s.display();

                scan.close();
        }
}
