public class Main {
    public static void main(String [] args){
        ContactsManager myContactManager = new ContactsManager();
        Contact friend1 = new Contact();
        friend1.name = "A";
        friend1.phoneNumber = "666";
        Contact friend2 = new Contact();
        friend2.name = "B";
        friend2.phoneNumber = "555";
        Contact friend3 = new Contact();
        friend3.name = "C";
        friend3.phoneNumber = "444";
        Contact friend4 = new Contact();
        friend4.name = "D";
        friend4.phoneNumber = "333";
        myContactManager.addContact(friend1);
        myContactManager.addContact(friend2);
        myContactManager.addContact(friend3);
        myContactManager.addContact(friend4);
        Contact searchFriend = myContactManager.searchContact("A");
        System.out.println(searchFriend.phoneNumber);
    }
}
