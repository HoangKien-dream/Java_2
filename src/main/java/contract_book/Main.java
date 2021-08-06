package contract_book;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContactController contactController = new ContactController();
        while (true){
            System.out.printf("Address Book\n");
            System.out.printf("--------------------\n");
            System.out.printf("1. Create new Contact.\n");
            System.out.printf("2. Find a contact by name.\n");;
            System.out.printf("3. Display contacts \n");
            System.out.printf("4. Exit program\n");
            System.out.printf("--------------------\n");
            System.out.printf("Please enter your choice (1-4): \n");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    contactController.callingAdd();
                    break;
                case 2:
                    contactController.findByName();
                    break;
                case 3:
                    contactController.showList();
                    break;
                case 4:
                    System.out.println("Exit program");
                    break;
                default:
                    System.out.printf("Please choice again (1-4)");
                    break;
            }
            scanner.nextLine();
            if (choice == 4){
                break;
            }
        }
    }
}
