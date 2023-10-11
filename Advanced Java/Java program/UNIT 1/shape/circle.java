package shape;

public class circle {
    private int radius;
    
    public circle(int radius){
        this.radius=radius;
    }

    double GetArea(){
        return 22*radius*radius/7;
    }
}
