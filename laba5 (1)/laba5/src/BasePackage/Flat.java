package BasePackage;

import java.time.LocalDate;


public class Flat {
    protected long id; //Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    protected String name; //Поле не может быть null, Строка не может быть пустой
    protected Coordinates coordinates; //Поле не может быть null
    protected LocalDate creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    protected double area; //Поле может быть null, Значение поля должно быть больше 0
    protected long numberOfRooms; //Значение поля должно быть больше 0
    protected int height; //Значение поля должно быть больше 0
    protected Boolean next; //Поле может быть null
    protected Transport transport; //Поле не может быть null
    protected House house; //Поле не может быть null

    public Flat(String name, Coordinates coordinates, LocalDate creationDate, double area,long numberOfRooms, int height, Boolean next, Transport transport, House house){
        this.name = name;
        this.coordinates = coordinates;
        this.creationDate = creationDate;
        this.area = area;
        this.numberOfRooms = numberOfRooms;
        this.height = height;
        this.next = next;
        this.transport = transport;
        this.house = house;

    }
    public Flat(){

    }
    public void setId(String id){
        this.id = Long.parseLong(id);
    }
    public String getId(){
        return String.valueOf(this.id);
    }
    public String getName(){
        return this.name;
    }
    public String getCoordinates(){
        return ("x = " + coordinates.getX() + "\n" + "y = " + coordinates.getY());
    }
    public String getArea(){
        return String.valueOf(this.area);
    }
    public String getNumberOfRooms(){
        return String.valueOf(this.numberOfRooms);
    }
    public String getHeight(){
        return String.valueOf(this.height);
    }
    public String getNext(){
        return String.valueOf(this.next);
    }
    public String getTransport(){
        return transport.getTitle();
    }
    public String getHouse(){
        return ("Name of house:" + house.getName() + "\n" + "Number of floors: " + house.getNumberOfFloors() + "\n" + "Number of lifts: " + house.getNumberOfLifts() + "\n" + "Year of creation: " + house.getYear());
    }
    public House getHouse2(){
        return this.house;
    }
    public LocalDate getLocalDate(){
        return this.creationDate;
    }
}
