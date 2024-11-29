package AddressBook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    Scanner sc = new Scanner(System.in);
    private ArrayList<Contacts> contacts;

    public AddressBook(){
        this.contacts = new ArrayList<>();
    }

    public void addContact(Contacts contact){
        contacts.add(contact);
        System.out.println("Contact added successfully..!");
    }
    public void updateContact(String name){
        boolean found = false;
        for(Contacts contacts1 : contacts){
            if(contacts1.getFirstName().equalsIgnoreCase(name)){
                found = true;
                contacts1.setFirstName(updatedDetails("First name", contacts1.getFirstName()));
                contacts1.setSecondName(updatedDetails("Second name", contacts1.getSecondName()));
                contacts1.setAddress(updatedDetails("Address", contacts1.getAddress()));
                contacts1.setCity(updatedDetails("City", contacts1.getCity()));
                contacts1.setState(updatedDetails("State", contacts1.getState()));
                contacts1.setZip(updatedDetails("Zip", contacts1.getZip()));
                contacts1.setPhoneNumber(updatedDetails("Phone Number", contacts1.getPhoneNumber()));
                contacts1.setEmail(updatedDetails("Email", contacts1.getEmail()));

                System.out.println("Contact updated successfully..!");
                break;
            }
        }
        if(!found){
            System.out.println("Contact not found..!");
        }
    }
    private String updatedDetails(String fieldName, String value){
        System.out.println(fieldName+", existing value : "+value);
        System.out.println("Enter new value : ");
        String update = sc.nextLine();
        return update.isEmpty() ? value : update;
    }
    public void deleteContacts(String name){
        boolean found = false;
        for(int i=0;i<contacts.size();i++){
            if(contacts.get(i).getFirstName().equalsIgnoreCase(name)){
                contacts.remove(i);
                found = true;
                System.out.println("Contact deleted successfully..!");
                break;
            }
        }
        if (!found){
            System.out.println("Contact not found..!");
        }
    }
    public void displayContacts(){
        if(contacts.isEmpty()){
            System.out.println("No contacts found..!");
        }
        else{
            System.out.println("Contacts : ");
            for (int i=0;i<contacts.size();i++){
                System.out.println("Contact "+(i+1) +" : ");
                System.out.println(contacts.get(i));
            }
        }
    }
}
