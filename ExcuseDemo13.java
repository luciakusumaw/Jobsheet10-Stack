import java.util.Scanner;

public class ExcuseDemo13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ExcuseLetterStack13 stack = new ExcuseLetterStack13(10); // Kapasitas 10
        int choice;

        do {
            System.out.println("\n--- Excuse Letter System ---");
            System.out.println("1. Submit Excuse Letter");
            System.out.println("2. Process Excuse Letter");
            System.out.println("3. View Latest Excuse Letter");
            System.out.println("4. Search for Letter");
            System.out.println("5. Exit");
            System.out.print("Select menu: ");
            choice = scan.nextInt();
            scan.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("ID: "); String id = scan.nextLine();
                    System.out.print("Name: "); String name = scan.nextLine();
                    System.out.print("Class: "); String cls = scan.nextLine();
                    System.out.print("Type (S/I): "); char type = scan.next().charAt(0);
                    System.out.print("Duration (days): "); int dur = scan.nextInt();
                    stack.push(new ExcuseLetter13(id, name, cls, type, dur));
                    break;
                case 2:
                    ExcuseLetter13 processed = stack.pop();
                    if (processed != null) {
                        System.out.println("Processing letter from: " + processed.name);
                    } else {
                        System.out.println("No letters to process.");
                    }
                    break;
                case 3:
                    ExcuseLetter13 latest = stack.peek();
                    if (latest != null) {
                        System.out.println("Latest letter is from: " + latest.name);
                    } else {
                        System.out.println("Stack is empty.");
                    }
                    break;
                case 4:
                    System.out.print("Enter student name to search: ");
                    String searchName = scan.nextLine();
                    stack.searchByName(searchName);
                    break;
            }
        } while (choice != 5);
    }
}