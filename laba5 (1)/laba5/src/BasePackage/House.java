package BasePackage;

public class House{
    protected String name; //Поле не может быть null
    protected Integer year; //Значение поля должно быть больше 0
    protected int numberOfFloors; //Значение поля должно быть больше 0
    protected Long numberOfLifts; //Значение поля должно быть больше 0

    public House(String name, Integer year, int numberOfFloors, Long numberOfLifts){
        this.name = name;
        this.year = year;
        this.numberOfFloors = numberOfFloors;
        this.numberOfLifts = numberOfLifts;

        
    }
    public String getName(){
        return this.name;
    }
    public String getYear(){
        return String.valueOf(this.year);
    }
    public String getNumberOfFloors(){
        return String.valueOf(this.numberOfFloors);
    }
    public String getNumberOfLifts(){
        return String.valueOf(this.numberOfLifts);
    }
}