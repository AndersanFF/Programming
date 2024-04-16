package CommandsPackage;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;

import FlatCollectionPackage.FileReadeer;


public class Execute_script extends Invoker {
    
    FileReadeer commands = new FileReadeer();
    public static boolean flag = false;
    private static Stack<String> handledScripts = new Stack<>();
    BufferedReader reader;
    static BufferedReader bufferedReader;
    
    @Override
    public void invoke1(String arg){
        execute_script(arg);
    }

    public void execute_script(String arg) {
        
        File file = new File(arg);
        try{
        bufferedReader = new BufferedReader(new FileReader(file));
        String line;
			while ((line = bufferedReader.readLine()) != null) {
                if(line.split(" ").length == 1){
                flag = true;
				commands.scriptReader(line);
                reader = bufferedReader;
                }else if(line.split(" ").length == 2){
               commands.scriptReader(line);
                flag = true;
                reader = bufferedReader;
                }
			}
		
    }catch(IOException e){
        System.out.println("Имя файла не найдено");
    }
    
    }
    public BufferedReader getReader(){
        return bufferedReader;
    }
}




