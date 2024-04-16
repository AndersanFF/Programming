package FlatCollectionPackage;



import CommandsPackage.Invoker;

public class FileReadeer {
    public void scriptReader(String command){

    
    while (true){
        String name = command;
        if(name.split(" ").length == 2){
    
            Object jid = Commands.getCommands().getObject(name.split(" ")[0]);
    
        if (jid instanceof Invoker){
    
            Invoker popa = (Invoker) Commands.getCommands().getObject(name.split(" ")[0]);
            String arg = name.split(" ")[1];
            popa.invoke1(arg);
    
        }
        else{
    
            System.out.println("ne robit");
    
            }
            
        }else if(name.split(" ").length == 1){
            Object jid = Commands.getCommands().getObject(name);
        if (jid instanceof Invoker){
            Invoker popa = (Invoker) Commands.getCommands().getObject(name);
            popa.invoke();
            break;
    
        }else{
            System.out.println("ne robit");
        }
        }else if(name.split(" ").length == 3){
            Object jid = Commands.getCommands().getObject(name.split(" ")[0]);
        if (jid instanceof Invoker){
            Invoker popa = (Invoker) Commands.getCommands().getObject(name.split(" ")[0]);
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
