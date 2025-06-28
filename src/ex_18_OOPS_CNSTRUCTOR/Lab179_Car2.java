package ex_18_OOPS_CNSTRUCTOR;

public class Lab179_Car2 {
    String model;
    int year;


    void Car2(){
        model= "XXX";
        year  = 1900;
        System.out.println("DC");
    }

    void Car2(String model_name, int year_created){
       // this("3000"); Showing error
        this.model = model_name;
        this.year = year_created;

    }

    void Car2(String model_name){
        this.model = model_name;
    }

}
