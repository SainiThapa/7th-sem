package qn9;

public class Polymorphism implements sounds{
    @Override
    public void Sound(){
        System.out.println("Hey Hey");
    }
    public static void main(String args[]){
        Polymorphism p1= new Polymorphism();
        p1.Sound();
    }
}
