package CommandsPackage;

import java.util.Scanner;

import FlatCollectionPackage.MainCollection;

public class Remove_Key extends Invoker{
    MainCollection mainCollection = new MainCollection();
    Scanner scanner = new Scanner(System.in);
    @Override
    public void invoke1(String arg){
        remove_Key(arg);
    }
    
    public void remove_Key(String arg){
        int id = Integer.parseInt(arg);
        while(true){
            if(mainCollection.getMaincol().contains(arg)){
                System.out.println("Такого id нет, введите другой");
                id = scanner.nextInt();
            }else{
                break;
            }
        }
        mainCollection.getMaincol().remove(id);
    }
}
