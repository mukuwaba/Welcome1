public class DogHouseBlueprint {
//Instance variables
   //These are the attributes of our dog house
    public String colorOfDoghouse;
    public void setColorOfDoghouse(String colorOfDog) {
       // this.colorOfDogHouse = colorOfDog;
    }
   // public String getColorOfDog() {
     //   return colorOfDogHouse;
   // }
    //private string, cannot access color without going through a string
    private int widthInFeet;

    private int heightInFeet;

    private int depthInFeet;

    private String nameOfDog;

    public void setNameOfDog(String nameOfDog) {
        this.nameOfDog = nameOfDog;
    }
    public String getNameOfDog() {
        return nameOfDog;
    }
}
