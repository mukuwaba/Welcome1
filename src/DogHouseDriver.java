public class DogHouseDriver {
    public static void main(String[] args) {
        DogHouseBlueprint timothyDogHouseObjRef = new DogHouseBlueprint();

        timothyDogHouseObjRef.setNameOfDog("Killy");

      //  timothyDogHouseObjRef.colorOfDogHouse = "Red";
        System.out.println("Color of Timothy's doghouse is..." + timothyDogHouseObjRef.getNameOfDog());

        DogHouseBlueprint joshuaDogHouseObjRef = new DogHouseBlueprint ();

        joshuaDogHouseObjRef.setNameOfDog("Gnome");

    }


}
