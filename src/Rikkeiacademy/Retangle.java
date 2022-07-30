package Rikkeiacademy;

public class Retangle extends Shape{
    private double width = 1.0;
    private double length = 1.0;

    public Retangle(){

    }
    public Retangle ( double width, double length){
        this.width= width;
        this.length= length;
    }
    public Retangle (double width, double length ,String color, boolean filled){
        super(color,filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        return width * this.length;
    }
    public double getPerimerter(){
        return 2 * (width+ this.length);

    }

    @Override
    public String toString() {
        return "A Rectangle with width="
                +getWidth()
                +"add length"
                +getLength()
                + ", which is a subclass of "
                +super.toString();
    }
}
