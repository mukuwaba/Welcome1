

public class AccountSection2 {
//instance variable
    private String name;
    //private, so the only thing that has access if the class Account
    //use the set method to set the value of "name"
    //private ensures that the general public cannot get to main
   //this is a CONSTRUCTOR! It's our first

   private double balance;

    public AccountSection2(String name, double balance){//AccountSection is a constructor, idenitical to class
        //method that helps create the object
        this.name = name;

        //only allow postive numbers
        if(balance > 0.0){
            this.balance = balance;
        }
    }

    //This will allow someone to deposit money into the account
    public void deposit( double depositAmount){
        if( depositAmount > 0.0){
            balance = balance + depositAmount;
        }
    }
    //This provides a means to return the balance
    public double getBalance(){
        return balance;

    }

    public void setName(String name) {
        this.name = name;
        //this references the object that has been created
        //two names are different variables
    }//end setName

    //Use the get method to find the value of "name"
    public String getName(){
        return name;
    }//end getName
}// end class Account
//cannot execute the code because there is no main, needed to execute and
//run the code
