package CommandsPackage;

public class Exit extends Invoker{
    @Override
    public void invoke(){
        exit();
    }
    public void exit(){
        System.exit(0);
    }
}
