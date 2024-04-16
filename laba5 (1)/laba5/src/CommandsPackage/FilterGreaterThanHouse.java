package CommandsPackage;

import BasePackage.Flat;
import FlatCollectionPackage.MainCollection;

public class FilterGreaterThanHouse extends Invoker{
    @Override
    public void invoke1(String arg){
        filter_greater_than_house(arg);
    }
    MainCollection maincol = new MainCollection();
    public void filter_greater_than_house(String arg){
        for(Flat a : maincol.getMaincol().values()){
            if(Integer.parseInt(a.getHouse2().getNumberOfFloors()) > Integer.parseInt(arg)){
                System.out.println(a.getId() + "\n" + a.getName() + "\n" + a.getCoordinates() + "\n" + a.getArea() + "\n" + a.getNumberOfRooms() + "\n" + a.getHeight() + "\n" + a.getNext() + " \n" + a.getTransport() + "\n" + a.getHouse());
            }
        }
    }
    
}
