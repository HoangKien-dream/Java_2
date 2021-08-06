package contract_book;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContactController {
    Scanner scanner = new Scanner(System.in);
    HashMap<String, String> hashMap = new HashMap<>();
    Contact contact = new Contact();

    public void callingAdd() {
        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();
        contact.setContactName(name);
        System.out.println("Please enter your phone: ");
        String phone = scanner.nextLine();
        contact.setPhone(phone);
        hashMap.put(name,phone);
    }

    public void showList(){
        System.out.println("----Address Book----");
        System.out.println("Name - Phone");
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
    public void findByName(){
        System.out.println("Please enter your name searching: ");
        String name = scanner.nextLine();
        if (hashMap.containsKey(name)){
            System.out.printf("Name: %s\n", name);
            System.out.printf("Phone: %s\n", hashMap.get(name));
        }else {
            System.out.println("Not Found!!!");
        }
    }
}
