public class Vehicle {

    private String make;
    private String model;
    private int year;


    public Vehicle (String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }
    
    public String getMake(){
        return make;
    }

    public void setMake(String ma){
        make = ma;
    }

    public String getModel(){
        return model;
    }

    public void setModel(String mo){
        model = mo;
    }

    public int getYear(){
        return year;
    }

    public void setYear(int y){
        year = y;
    }

    public void displayInfo(){
        System.out.println("Vehicle Information");
        System.out.println("--------------------");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        }
}