package CommandsPackage;


import java.io.BufferedReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

import BasePackage.Coordinates;
import BasePackage.Flat;
import BasePackage.House;
import BasePackage.Transport;
import FlatCollectionPackage.MainCollection;


public class Insert extends Invoker{

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

    Scanner scanner = new Scanner(System.in);
    LocalDate initTime = LocalDate.now();
    MainCollection mainCollection = new MainCollection();
    
    Execute_script execute_script = new Execute_script();

    
    public void insert(String arg){

        int id = Integer.parseInt(arg);
        
        while(true){

        if (mainCollection.getMaincol().keySet().contains(id)){
            System.out.println("Введите другой id, такой уже есть");
            id = scanner.nextInt(id);
        }else{
            break;
        }

        }
        if(Execute_script.flag == false){
        System.out.println("Введите название квартиры");
        }
        while (true){
            String name;
            if(Execute_script.flag == false){
            name = scanner.next();
            if(name.length() == 0 | name.equals(null)){
                System.out.println("Введите имя заново");
            }
            else{
                name1 = name;
                break;
            }
            }else{
                try{
                    name1 = Execute_script.bufferedReader.readLine();
        
        }catch(IOException e){
            e.printStackTrace();
        }
            }
            
            
        
        }
        if(Execute_script.flag == false){
        System.out.println("Введите координату x");
        }

        while(true){
            Float x;
            if(Execute_script.flag == false){
        x = scanner.nextFloat();

        if (x>-292 | !x.equals(null)){
            x1 = x;
            break;
        }
        else{
            System.out.println("Введите x заново");
        }
        }else{
            try{
            x1 = Float.parseFloat(Execute_script.bufferedReader.readLine());
            }catch(IOException e){
                e.printStackTrace();
            }
        }
        }
        if(Execute_script.flag == false){
        System.out.println("Введите координату y");
        }
        while(true){
        Integer y;
        if(Execute_script.flag == false){
        y = scanner.nextInt();
        
        if(y>-474 | !y.equals(null)){
            y1 = y;
            break;
        }else{
            System.out.println("Введите y заново");
        }
    }else{
        try{
            y1 = Integer.parseInt(execute_script.getReader().readLine());
        }catch(IOException e){
            e.printStackTrace();
        }
    }
        }

        
        
        LocalDate creationDate = initTime;

        if(Execute_script.flag == false){
        System.out.println("Введите полу area");
        }
        while(true){
        double area;
        if(Execute_script.flag == false){
        area = scanner.nextDouble();
        if(area > 0){
            area1 = area;
            break;
        }else{
            System.out.println("Введите поле area заново");
        }
    }else{
        try{
        area1 = Double.parseDouble(execute_script.reader.readLine());
    }catch(IOException e){
        e.printStackTrace();
    }
    }
        }
        if(Execute_script.flag == false){
        System.out.println("Введите кол-во комнат");
        }
        while(true){
        Long numberOfRooms;
        if(Execute_script.flag ==false){
            numberOfRooms = scanner.nextLong();
        if (numberOfRooms <= 11 | numberOfRooms != 0 ){
            numberOfRooms1 = numberOfRooms;
            break;
        }else{
            System.out.println("Введите кол-во комнат заново");
        }
    }else{
        try{
            numberOfRooms1 = Long.parseLong(execute_script.getReader().readLine());
        }catch(IOException e){
            e.printStackTrace();
        }
    }
        }
        if(Execute_script.flag == false){
        System.out.println("Введите поле height");
        }
        while(true){
        Integer height;
        if(Execute_script.flag == false){
        height = scanner.nextInt();
        if(height > 0){
            height1 = height;
            break;
        }else{
            System.out.println("В ведите поле height заново");
        }
    }else{
        try{
            height1 = Integer.parseInt(execute_script.getReader().readLine());
        }catch(IOException e){
            e.printStackTrace();
        }
    }
        }
        if(Execute_script.flag == false){
        System.out.println("Новая квартира или нет?");
        }
        while(true){
            String next;
            if(Execute_script.flag == false){
                next = scanner.next();
            if(next.equals("true") | next.equals("false")){
                next1 = Boolean.parseBoolean(next);
                break;
            }else{
                System.out.println("Введите заново");
            }
            }else{
                try{
                    next1 = Boolean.parseBoolean(execute_script.getReader().readLine());
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
        }
        if(Execute_script.flag == false){
        System.out.println("Введите кол-во транспорта в городе");
        }
        while(true){
            String enumget;
            if(Execute_script.flag == false){
                enumget = scanner.next();
        if (enumget.equals("FEW") | enumget.equals("NORMAL") | enumget.equals("NONE") | enumget.equals("LITTLE") | enumget.equals("ENOUGH")){
            
            transport1 = Transport.valueOf(enumget);
            break;
        }else{
            System.out.println("Введите кол-во транпорта заново");
        }
    }else{
        try{
            enumget = execute_script.getReader().readLine();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
        }
        if(Execute_script.flag == false){
        System.out.println("Введите имя дома");
        }
        while(true){
        String houseName;
        if(Execute_script.flag == false){
        houseName = scanner.next();
        if(!houseName.equals(null)){
            houseName1 = houseName;
            break;
        }else{
            System.out.println("Введите имя дома заново");
        }
    }else{
        try{
            houseName1 = execute_script.getReader().readLine();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
        
        }
    
        if(Execute_script.flag == false){
        System.out.println("Введите год");
        }
        while(true){
        Integer year;
        if(Execute_script.flag == false){
        year = scanner.nextInt();
        if(year > 0){
            year1 = year;
            break;
        }else{
            System.out.println("Введите год заново");
        }
        }else{
            try{
                year1 = Integer.parseInt(execute_script.getReader().readLine());
            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }
        if(Execute_script.flag == false){
        System.out.println("Введите количество этажей");
        }
        while(true){
        int numberOfFloors;
        if(Execute_script.flag == false){
        numberOfFloors = scanner.nextInt();
        if (numberOfFloors > 0){
            numberOfFloors1 = numberOfFloors;
            break;
        }else{
            System.out.println("Введите кол-во этажей заново");
        }
    }
        }
        if(Execute_script.flag == false){
        System.out.println("Введите кол-во лифтов");
        }
        while(true){
        Long numberOfLifts;
        if(Execute_script.flag == false){
        numberOfLifts = scanner.nextLong();
        if (numberOfLifts > 0){
            numberOfLifts1 = numberOfLifts;
            break;
        }else{
            System.out.println("Введите кол-во лифтов заново");
        }
    }else{
        try{
            numberOfLifts1 = Long.parseLong(execute_script.getReader().readLine()); 
        }catch(IOException e){
            e.printStackTrace();
        }
    }
        }
        
        Coordinates coordinates = new Coordinates(x1, y1);
        
        House house = new House(houseName1, year1, numberOfFloors1, numberOfLifts1);
        
        Flat flat = new Flat(name1, coordinates, creationDate, area1, numberOfRooms1, height1, next1, transport1, house);
        mainCollection.getMaincol().put(id, flat);
        System.out.println("Ура, объедк креатед");

    }


    @Override
    public void invoke1(String arg){
        insert(arg);
    }
    
}