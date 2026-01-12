import java.util.ArrayList;
import java.util.Scanner;

public class CCPMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> complaints = new ArrayList<>(); 
        int choice;

        do {
            System.out.println("\n--- Customer Complaint Portal ---");
            System.out.println("1. Add Complaint");
            System.out.println("2. View Complaints");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            
            while (!sc.hasNextInt()) {
                System.out.println("Please enter a valid number!");
                sc.next(); 
            }
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter your complaint: ");
                    String complaint = sc.nextLine();
                    complaints.add(complaint);
                    System.out.println("✅ Complaint added successfully!");
                    break;

                case 2:
                    System.out.println("\n--- Complaints List ---");
                    if (complaints.isEmpty()) {
                        System.out.println("No complaints yet.");
                    } else {
                        for (int i = 0; i < complaints.size(); i++) {
                            System.out.println((i + 1) + ". " + complaints.get(i));
                        }
                    }
                    break;

                case 3:
                    System.out.println("Exiting... Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice, please try again.");
            }
        } while (choice != 3);

        sc.close();
    }
}