package CommandsPackage;

import java.io.File;
import java.io.FileWriter;
import java.time.LocalDate;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import FlatCollectionPackage.MainCollection;


public class Save extends Invoker{
    MainCollection mainCollection = new MainCollection();
    
    @Override
    public void invoke(){
        try {
            save();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void save() throws Exception{
    GsonBuilder gsonBuilder = new GsonBuilder();
    gsonBuilder.registerTypeAdapter(LocalDate.class, new LocalDateSerializer());
    Gson gson = gsonBuilder.setPrettyPrinting().create();
    File file = new File("saved.json");
    FileWriter writer = new FileWriter(file);
    //for(Map.Entry<Integer, Flat> a : mainCollection.getMaincol().entrySet()){
    String json = gson.toJson(mainCollection.getMaincol().values());
    writer.write(json);
    //}
    writer.close();
    }
}
