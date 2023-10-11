package shape;

public class square {
    private int length;
    
    public square(int radius){
        this.length=radius;
    }

    double GetArea(){
        return length * length;
    }
}
