package qn9;

public class poly2 extends Polymorphism{
    @Override
    public void Sound(){
        System.out.println("ROAR");
    }

    public static void main(String args[]){
        poly2 n1= new poly2();
        Polymorphism n2= new Polymorphism();
        n1.Sound();
        n2.Sound();

    }
    
}
