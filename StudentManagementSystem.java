import java.util.ArrayList;
import java.util.Scanner;

class Student {
        int rollNo;
        String name;
        String grade;

        public Student(int r, String n, String g) {

                rollNo = r;
                name = n;
                grade = g;
        }

        void display() {
                System.out.println("Roll No: " + rollNo + ", Name: " + name + ", Grade: " + grade);
        }
}

public class StudentManagementSystem {

        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                ArrayList<Student> students = new ArrayList<>();
                int choice;

                do {
                        System.out.println("\n--- Student Management System ---");
                        System.out.println("1. Add Student");
                        System.out.println("2. Edit Student");
                        System.out.println("3. Remove Student");
                        System.out.println("4. Search Student");
                        System.out.println("5. Display All Students");
                        System.out.println("6. Exit");
                        System.out.print("Enter choice: ");
                        choice = sc.nextInt();
                        sc.nextLine();

                        switch (choice) {

                                case 1:
                                        System.out.print("Enter Roll No: ");
                                        int r = sc.nextInt();
                                        sc.nextLine();
                                        System.out.print("Enter Name: ");
                                        String n = sc.nextLine();
                                        if (n.isEmpty()) {
                                                System.out.println("Name cannot be empty!");
                                                break;
                                        }
                                        System.out.print("Enter Grade: ");
                                        String g = sc.nextLine();
                                        if (g.isEmpty()) {
                                                System.out.println("Grade cannot be empty!");
                                                break;
                                        }
                                        students.add(new Student(r, n, g));
                                        System.out.println("Student added successfully!");
                                        break;

                                case 2:
                                        System.out.print("Enter Roll No to Edit: ");
                                        int editRoll = sc.nextInt();
                                        sc.nextLine();
                                        boolean found = false;
                                        for (Student s : students) {
                                                if (s.rollNo == editRoll) {
                                                        System.out.print("Enter New Name (leave blank to keep same): ");
                                                        String newName = sc.nextLine();
                                                        if (!newName.isEmpty())
                                                                s.name = newName;
                                                        System.out.print(
                                                                        "Enter New Grade (leave blank to keep same): ");
                                                        String newGrade = sc.nextLine();
                                                        if (!newGrade.isEmpty())
                                                                s.grade = newGrade;
                                                        System.out.println("Student updated successfully!");
                                                        found = true;
                                                        break;
                                                }
                                        }
                                        if (!found)
                                                System.out.println("Student not found!");
                                        break;

                                case 3:
                                        System.out.print("Enter Roll No to Remove: ");
                                        int removeRoll = sc.nextInt();
                                        boolean removed = students.removeIf(s -> s.rollNo == removeRoll);
                                        if (removed)
                                                System.out.println("Student removed successfully!");
                                        else
                                                System.out.println("Student not found!");
                                        break;

                                case 4:
                                        System.out.print("Enter Roll No to Search: ");
                                        int searchRoll = sc.nextInt();
                                        found = false;
                                        for (Student s : students) {
                                                if (s.rollNo == searchRoll) {
                                                        s.display();
                                                        found = true;
                                                        break;
                                                }
                                        }
                                        if (!found)
                                                System.out.println("Student not found!");
                                        break;

                                case 5:
                                        if (students.isEmpty())
                                                System.out.println("No students available!");
                                        else
                                                for (Student s : students)
                                                        s.display();
                                        break;

                                case 6:
                                        System.out.println("Exiting...");
                                        break;

                                default:
                                        System.out.println("Invalid choice!");
                        }

                } while (choice != 6);

                sc.close();
        }
}
