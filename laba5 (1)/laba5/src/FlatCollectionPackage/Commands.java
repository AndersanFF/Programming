package FlatCollectionPackage;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

import CommandsPackage.Clear;
import CommandsPackage.Execute_script;
import CommandsPackage.Exit;
import CommandsPackage.FilterStartsWithName;
import CommandsPackage.Help;
import CommandsPackage.History;
import CommandsPackage.Info;
import CommandsPackage.Insert;
import CommandsPackage.Invoker;
import CommandsPackage.PrintDescending;
import CommandsPackage.Remove_Key;
import CommandsPackage.Remove_greater;
import CommandsPackage.ReplaceIfLowe;
import CommandsPackage.Save;
import CommandsPackage.Show;
import CommandsPackage.Update_id;

public class Commands implements CommandInterface{
    Help help = new Help();
    Info info = new Info();
    Clear clear = new Clear();
    Execute_script execute_script = new Execute_script();
    Exit exit = new Exit();
    History history = new History();
    Remove_greater remove_greater = new Remove_greater();
    Save save = new Save();
    Show show = new Show();
    Update_id update_id = new Update_id();
    Insert insert = new Insert();
    Remove_Key remove_Key = new Remove_Key();
    ReplaceIfLowe replaceIfLowe = new ReplaceIfLowe();
    FilterStartsWithName filterStartsWithName = new FilterStartsWithName();
    PrintDescending printDescending = new PrintDescending();
    Scanner console = new Scanner(System.in);

    static Commands commands2 = new Commands();
    public static Commands getCommands(){
        return commands2;
    }

    protected Map<String, Object> commands = new LinkedHashMap<String, Object>(){{
        put("help", help);
        put("info", info);
        put("clear", clear);
        put("execute_script", execute_script);
        put("exit", exit);
        put("history", history);
        put("remove_greater", remove_greater);
        put("save", save);
        put("show", show);
        put("update_id", update_id);
        put("insert", insert);
        put("remove", remove_Key);
        put("replace_if_lowe", replaceIfLowe);
        put("filter_starts_with_name", filterStartsWithName);
        put("print_descending", printDescending);

    }};
    @Override
    public Object getObject(String command){
        return commands.get(command);
    }

public void consoleReader(){

while (true){
    String name = console.nextLine();
    if(name.split(" ").length == 2){

        Object jid = commands.get(name.split(" ")[0]);

    if (jid instanceof Invoker){

        Invoker popa = (Invoker) commands.get(name.split(" ")[0]);
        String arg = name.split(" ")[1];
        popa.invoke1(arg);

    }
    else{

        System.out.println("ne robit");

        }
        
    }else if(name.split(" ").length == 1){
        Object jid = commands.get(name);
    if (jid instanceof Invoker){
        Invoker popa = (Invoker) commands.get(name);
        popa.invoke();

    }else{
        System.out.println("ne robit");
    }
    }else if(name.split(" ").length == 3){
        Object jid = commands.get(name.split(" ")[0]);
    if (jid instanceof Invoker){
        Invoker popa = (Invoker) commands.get(name.split(" ")[0]);
        popa.invoke2(name.split(" ")[1], name.split(" ")[2]);}
        else{
        System.out.println("ne robit");
        }
    }else{
        System.out.println("ne robit");
    }
    }
    
}



}



