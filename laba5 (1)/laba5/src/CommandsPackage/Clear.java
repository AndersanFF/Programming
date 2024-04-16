package CommandsPackage;

import FlatCollectionPackage.MainCollection;

public class Clear extends Invoker{
    MainCollection mainCollection = new MainCollection();
    @Override
    public void invoke(){
        clear();
    }

    public void clear(){
        mainCollection.getMaincol().clear();
    }
    
}
