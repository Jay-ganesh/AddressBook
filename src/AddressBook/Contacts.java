package AddressBook;

public class Contacts {
    String firstName;
    String secondName;
    String address;
    String city;
    String state;
    String zip;
    String phoneNumber;
    String email;

    public Contacts(String firstName,String secondName,String address,String city, String state,String zip,String phoneNumber, String email){
        this.firstName = firstName;
        this.secondName = secondName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contact Details : \n"+
                "Name : "+firstName+" "+secondName+"\n"+
                "Address : "+address+" "+city+" "+state+" "+zip+"\n"+
                "Phone number : "+phoneNumber+"\n"+
                "Email : "+email;
    }
}
