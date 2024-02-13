//this will be used to generate objects (instances of the class) of type AccountSection2 (CLASS
//AKA BLUEPRINT)
public class AccountSection2Driver {
    public static void main(String[] args) {
        //type m and hit TAB for a shortcut to the above argument
        AccountSection2 myAccount = new AccountSection2("Sailor", 1_000_000); //creates the object
       // AccountSection2 myAccount4 = new AccountSection2("Ohemaa", 1_000_000; //creates object
        AccountSection2 myAccount2 = new AccountSection2("Timothy",1_000_000);
        AccountSection2 myAccount3 = new AccountSection2("Ben",1_000);

        System.out.printf("Initial name is: %s%n%n", myAccount.getName());
        myAccount.setName("Mukuwa");
      //  myAccount4.setName("Ohemaa");
        myAccount3.deposit(2.01);

        System.out.printf("How much cash does Ben have? He has: $%.2f\n", myAccount2.getBalance());
        myAccount3.deposit(7888);
        //System.out.printf("\nHow much cash does " + myAccount3.getname() + "have? He has: $%.2f\n" myAccount3.getBalance());

        System.out.printf("How much cash does Ohemaa have? He has: $%.2f\n", myAccount2.getBalance());
        //System.out.printf("\nHow much cash does " + myAccount3.getname() + "have? He has: $%.2f\n" myAccount3.getBalance()

        System.out.printf("Initial name");
        System.out.printf("%s balance: $%. 2f%n");
      //  myAccount4.getName(), myAccount3.getBalance());
    } //end main
}//end class AccountSection Driver2
