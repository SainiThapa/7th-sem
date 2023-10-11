package qn8;
public class Derivedclass extends Baseclass{

    public void DOG(){
        System.out.println("WOOF");
    }
    public static void main(String args[]){
        Derivedclass a1= new Derivedclass();
        a1.DOG();
        a1.Tiger();
    }
}