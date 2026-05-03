import java.util.Scanner;
public class StudentDemo13 {
public static void main(String[] args) {
    StudentAssignmentStack13 stack = new StudentAssignmentStack13(5);
    Scanner scan = new Scanner(System.in);
    int choice;
    do {
    System.out.println("\nMenu:");
    System.out.println("1. Submit Assignment");
    System.out.println("2. Grade Assignment");
    System.out.println("3. View Top Assignment");
    System.out.println("4. View Assignment List");
    System.out.println("5. View First Student (Bottom)");
    System.out.println("6. Show Total Number of Assignments");
    System.out.print("Select: ");
    choice = scan.nextInt();
    scan.nextLine(); 

    switch (choice) {
        case 1:
            System.out.print("Name: ");
            String name = scan.nextLine();
            System.out.print("NIM: ");
            String nim = scan.nextLine();
            System.out.print("Class: ");
            String className = scan.nextLine();
            
           
            Student13 std = new Student13(name, nim, className);
            stack.push(std);
            System.out.printf("Assignment by %s successfully submitted\n", std.name);
            break;
            
        case 2:
            Student13 graded = stack.pop();
            if (graded != null) {
                System.out.println("Grading assignment from " + graded.name);
                System.out.print("Enter grade (0-100): ");
                int score = scan.nextInt();
                graded.grading(score);
                System.out.printf("Assignment grade for %s is %d\n", graded.name, score);
                String binary = stack.convertToBinary(score); 
                System.out.printf("Assignment grade in binary is %s\n", binary);
            }
            break;
            
        case 3:
            Student13 view = stack.peek();
            if (view != null) {
                System.out.println("Latest assignment submitted by " + view.name);
            }
            break;
            
        case 4:
            System.out.println("List of all assignments");
            System.out.println("Name\tNIM\tClass");
            stack.print();
            break;

        case 5:
            Student13 first = stack.peekBottom();
            if (first != null) {
            System.out.println("The first student to submit was: " + first.name);
            }
            break;

        case 6:
            int total = stack.getAssignmentCount();
            System.out.println("Current assignments in stack: " + total);
            break;

        default:
            System.out.println("Invalid choice.");
    }
} while (choice >= 1 && choice <= 6);
}
}
