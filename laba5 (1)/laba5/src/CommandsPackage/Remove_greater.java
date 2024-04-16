package CommandsPackage;

import java.util.Scanner;

import FlatCollectionPackage.MainCollection;

public class Remove_greater extends Invoker{
    Scanner console = new Scanner(System.in);
    MainCollection mainCollection = new MainCollection();
    @Override
    public void invoke(){
        remove_greater();
    }

    public void remove_greater(){
        int key = console.nextInt();
        for(int a : mainCollection.getMaincol().keySet()){
            if(a > key){
                mainCollection.getMaincol().remove(a);
            }
        }
    }
}
