package CommandsPackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import BasePackage.Flat;
import FlatCollectionPackage.MainCollection;

public class FilterStartsWithName extends Invoker{
    MainCollection mainCollection = new MainCollection();
    @Override
    public void invoke1(String arg){
        filter_starts_with_name(arg);
    }

    public void filter_starts_with_name(String arg){
        for(int a : mainCollection.getMaincol().keySet()){
            Flat flat = mainCollection.getMaincol().get(a);
            Pattern pattern = Pattern.compile(arg+"*");
            Matcher matcher = pattern.matcher(mainCollection.getMaincol().get(a).getName());
            if(matcher.find()){
                System.out.println(flat.getName() + "\n" + flat.getCoordinates() + "\n" + flat.getArea() + "\n" + flat.getNumberOfRooms() + "\n" + flat.getHeight() + "\n" + flat.getNext() + " \n" + flat.getTransport() + "\n" + flat.getHouse());
            }
            
            
        }
    }
    
}
