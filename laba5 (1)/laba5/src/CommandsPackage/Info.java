package CommandsPackage;


import java.time.LocalDate;

import FlatCollectionPackage.MainCollection;

public class Info extends Invoker{
    MainCollection maincol = new MainCollection();
    LocalDate initTime = LocalDate.now();
    public void info(){
        System.out.println(maincol.getMaincol().getClass().getSuperclass());
        System.out.println(initTime);
        System.out.println(maincol.getMaincol().size());
    }
    @Override
    public void invoke(){
        info();
    }
}
