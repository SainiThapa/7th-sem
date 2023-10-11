import java.util.*;

public class qn2{
    public void perimeter(int a,int b){
        System.out.println("Perimeter = " + (a+b));
    }
    public void area (int a, int b){
        System.out.println("Area = " + (a*b));
    }

    public static void main(String args[]){
        qn2 a1= new qn2();
        Scanner inp= new Scanner(System.in);
        System.out.println("Enter the length and breadth of the rectangle: \n");
        int a=inp.nextInt();
        int b=inp.nextInt();
        
        a1.perimeter(a,b);
        a1.area(a,b);

    }
}