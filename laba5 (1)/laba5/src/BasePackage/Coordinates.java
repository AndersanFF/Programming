package BasePackage;

public class Coordinates {
    
    protected Float x; //Значение поля должно быть больше -292, Поле не может быть null
    protected Integer y; //Значение поля должно быть больше -747

    public Coordinates(float x, Integer y){
        this.x = x;
        this.y = y;
    }
    public String getX(){
        return String.valueOf(this.x);
    }
    public String getY(){
        return String.valueOf(this.y);
    }
}
