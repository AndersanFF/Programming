package CommandsPackage;

import java.time.LocalDate;
import java.util.Scanner;

import BasePackage.Coordinates;
import BasePackage.Flat;
import BasePackage.House;
import BasePackage.Transport;
import FlatCollectionPackage.MainCollection;
public class Update_id extends Invoker{
    String name1 = null;
    Float x1;
    Integer y1;
    double area1 = 0;
    Long numberOfRooms1 = null;
    Integer height1 = null;
    Boolean next1 = false;
    Transport transport1 = null;
    String houseName1 = null;
    Integer year1 = null;
    int numberOfFloors1 = 0;
    Long numberOfLifts1 = null;
    LocalDate initTime = LocalDate.now();
    MainCollection mainCollection = new MainCollection();
    @Override
    public void invoke1(String arg){
        update_id(arg);
    }

    Scanner scanner = new Scanner(System.in);
    public void update_id(String arg){

        int id1 = Integer.parseInt(arg);

        mainCollection.getMaincol().remove(id1);

        int id = id1;
        System.out.println("Введите название квартиры");
        while (true){

            String name = scanner.next();
            
            if(name.length() == 0 | name.equals(null)){
                System.out.println("Введите имя заново");
            }
            else{
                
                name1 = name;
                break;
            }
        }

        System.out.println("Введите координату x");
        while(true){
        Float x = scanner.nextFloat();

        if (x>-292 | !x.equals(null)){
            x1 = x;
            break;
        }
        else{
            System.out.println("Введите x заново");
        }
        }
        
        System.out.println("Введите координату y");
        while(true){
        Integer y = scanner.nextInt();

        if(y>-474 | !y.equals(null)){
            y1 = y;
            break;
        }else{
            System.out.println("Введите y заново");
        }

        }

        

        LocalDate creationDate = initTime;

        System.out.println("Введите полу area");
        while(true){
        double area = scanner.nextDouble();
        
        if(area > 0){
            area1 = area;
            break;
        }else{
            System.out.println("Введите поле area заново");
        }
        }

        System.out.println("Введите кол-во комнат");
        while(true){
        Long numberOfRooms = scanner.nextLong();

        if (numberOfRooms <= 11 | numberOfRooms != 0 ){
            numberOfRooms1 = numberOfRooms;
            break;
        }else{
            System.out.println("Введите кол-во комнат заново");
        }
        }

        System.out.println("Введите поле height");
        while(true){
        Integer height = scanner.nextInt();

        if(height > 0){
            height1 = height;
            break;
        }else{
            System.out.println("В ведите поле height заново");
        }
        }

        System.out.println("Новая квартира или нет?");
        
        Boolean next = scanner.nextBoolean();
        
        
        
        System.out.println("Введите кол-во транспорта в городе");
        while(true){
            String enumget = scanner.next();

        if (enumget.length()!=0){
            transport1 = Transport.valueOf(enumget);
            break;
        }else{
            System.out.println("Введите кол-во транпорта заново");
        }
        }
        
        System.out.println("Введите имя дома");
        while(true){
        String houseName = scanner.next();
        
        if(!houseName.equals(null)){
            houseName1 = houseName;
            break;
        }else{
            System.out.println("Введите имя дома заново");
        }
        }

        System.out.println("Введите год");
        while(true){
        Integer year = scanner.nextInt();

        if(year > 0){
            year1 = year;
            break;
        }else{
            System.out.println("Введите год заново");
        }
        }

        System.out.println("Введите количество этажей");
        while(true){
        int numberOfFloors = scanner.nextInt();

        if (numberOfFloors > 0){
            numberOfFloors1 = numberOfFloors;
            break;
        }else{
            System.out.println("Введите кол-во этажей заново");
        }
        }
        
        System.out.println("Введите кол-во лифтов");
        while(true){
        Long numberOfLifts = scanner.nextLong();
        if (numberOfLifts > 0){
            numberOfLifts1 = numberOfLifts;
            break;
        }else{
            System.out.println("Введите кол-во лифтов заново");
        }
        }
        
        Coordinates coordinates = new Coordinates(x1, y1);
        
        House house = new House(houseName1, year1, numberOfFloors1, numberOfLifts1);
        
        Flat flat = new Flat(name1, coordinates, creationDate, area1, numberOfRooms1, height1, next, transport1, house);
        mainCollection.getMaincol().put(id, flat);
        
    }
    
}
