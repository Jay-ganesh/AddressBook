package AddressBook;

import java.util.ArrayList;

public class AddressBook {
    private ArrayList<Contacts> contacts;

    public AddressBook(){
        this.contacts = new ArrayList<>();
    }

    public void addContact(Contacts contact){
        contacts.add(contact);
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
