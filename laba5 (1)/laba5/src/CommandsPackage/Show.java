package CommandsPackage;

import BasePackage.Flat;
import FlatCollectionPackage.MainCollection;

public class Show extends Invoker{
    public void show(){
        MainCollection maincol = new MainCollection();
        for(Flat a : maincol.getMaincol().values()){
            System.out.println(a.getId() + "\n" + a.getName() + "\n" + a.getCoordinates() + "\n" + a.getArea() + "\n" + a.getNumberOfRooms() + "\n" + a.getHeight() + "\n" + a.getNext() + " \n" + a.getTransport() + "\n" + a.getHouse());

        }
    }
    @Override
    public void invoke(){
        show();
    }
    
}
