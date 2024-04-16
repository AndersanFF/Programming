package CommandsPackage;

import java.util.ArrayList;
import java.util.List;

public class History extends Invoker{
    static List<String> historyColl = new ArrayList<>();
    public void historySup(String commandName){
        historyColl.add(commandName);
        if (historyColl.size() > 13){
            historyColl.remove(0);
        }
    }
    @Override
    public void invoke(){
        history();
    }
    public void history(){
        for (String a : historyColl){
            System.out.println(a);
        }
    }
}
