package AddressBook;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Address Book Program");

        AddressBook addressBook = new AddressBook();

        boolean exit = false;

        while (!exit) {
            System.out.println("\nMenu");
            System.out.println("1. add contact");
            System.out.println("2. display contact");
            System.out.println("3. exit");
            System.out.println("Choose an option");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter First Name: ");
                    String firstName = sc.nextLine();
                    System.out.print("Enter Last Name: ");
                    String lastName = sc.nextLine();
                    System.out.print("Enter Address: ");
                    String address = sc.nextLine();
                    System.out.print("Enter City: ");
                    String city = sc.nextLine();
                    System.out.print("Enter State: ");
                    String state = sc.nextLine();
                    System.out.print("Enter Zip Code: ");
                    String zip = sc.nextLine();
                    System.out.print("Enter Phone Number: ");
                    String phoneNumber = sc.nextLine();
                    System.out.print("Enter Email: ");
                    String email = sc.nextLine();

                    Contacts contact = new Contacts(firstName, lastName, address, city, state, zip, phoneNumber, email);
                    addressBook.addContact(contact);
                    System.out.println("Contact added successfully..!");
                    break;
                case 2:
                    addressBook.displayContacts();
                    break;
                case 3:
                    exit = true;
                    System.out.println("Exiting address Book..!");
                    break;
                default:
                    System.out.println("Invalid input..!");
            }
        }
    }
}
