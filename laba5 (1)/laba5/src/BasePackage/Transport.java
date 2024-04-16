package BasePackage;

public enum Transport {
    FEW ("Очень мало"),
    NONE ("Нет"),
    LITTLE ("Мало"),
    NORMAL ("Нормально"),
    ENOUGH ("Достаточно");

    protected String title;

    Transport(String title){
        this.title = title;
    }
    public String getTitle(){
        return title;
    }
}