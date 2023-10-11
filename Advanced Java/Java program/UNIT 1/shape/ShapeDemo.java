package shape;

public class ShapeDemo {
    
    public static void main(String args[]){
        // ShapeDemo S1 = new ShapeDemo();
        circle c= new circle(5);
        System.out.println(c.GetArea());

        square s= new square(10);
        System.out.println(s.GetArea());
    }
}
