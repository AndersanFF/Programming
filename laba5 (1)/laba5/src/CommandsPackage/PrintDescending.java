package CommandsPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import BasePackage.Flat;
import FlatCollectionPackage.MainCollection;


public class PrintDescending extends Invoker{
    @Override
    public void invoke(){
        print_descending();
    }
    MainCollection mainCollection = new MainCollection();
    
    
    public void print_descending(){
        List<Integer> sortedList = new ArrayList<>(mainCollection.getMaincol().keySet());
        Collections.sort(sortedList);
        Collections.reverse(sortedList);
        for (int a : sortedList){
            Flat b = mainCollection.getMaincol().get(a);
            System.out.println(b.getId() + "\n" + b.getName() + "\n" + b.getCoordinates() + "\n" + b.getArea() + "\n" + b.getNumberOfRooms() + "\n" + b.getHeight() + "\n" + b.getNext() + " \n" + b.getTransport() + "\n" + b.getHouse() + "\n");
        }
    }
}
