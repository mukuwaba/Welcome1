public class Student {
    private String name;
    private double average;

    public Student(String name, double average){//creates student object
        //will run when you create a new student object
//constructor, has the same name as the class
//double is a data type, one of the eight, twice the size of a float
        this.name = name; //set instance variable


        //validate that average is >(positive) 0.0 and <= 100.0; otherwise
        //keep instance variable average's default value (0,0)
        if (average > 0.0){
            if(average <= 100.00){
                this.average = average; //take the value and assign it to the average
            }
        }
    }//Student constructor
}//Student
