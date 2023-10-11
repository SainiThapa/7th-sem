import java.util.Scanner;
public class qn4{

    public static float SimpleInterest(float rate, int time, int principal){
        return (rate*time*principal)/100;
    }
    public static void main(String args[]){
        Scanner SI=new Scanner(System.in);
        System.out.println("Enter Principal amount: ");
        int principal = SI.nextInt();
        System.out.println("Enter Interest rate: ");
        float rate = SI.nextFloat();
        System.out.println("Enter Time(in years): ");
        int time = SI.nextInt();

        System.out.println("Simple interest  =  "+ qn4.SimpleInterest(rate, time, principal));
        
    }
}