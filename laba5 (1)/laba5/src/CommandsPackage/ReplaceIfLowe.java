package CommandsPackage;

import java.util.Scanner;

import FlatCollectionPackage.MainCollection;

public class ReplaceIfLowe extends Invoker{
    MainCollection maincol = new MainCollection();
    Scanner scanner = new Scanner(System.in);
    @Override
    public void invoke2(String arg, String arg2){
        replace_if_lowe(arg, arg2);
    }
    public void replace_if_lowe(String arg, String arg2){
        while(true){
        if(maincol.getMaincol().keySet().contains(Integer.parseInt(arg2))){
        if(Integer.parseInt(maincol.getMaincol().get(Integer.parseInt(arg2)).getId()) > Integer.parseInt(arg)){
            maincol.getMaincol().get(Integer.parseInt(arg)).setId(arg);
        }else{
            break;
        }
        }
        else{
            System.out.println("Введите поле заново");
            arg = scanner.nextLine();
    }
    }
    }
}
