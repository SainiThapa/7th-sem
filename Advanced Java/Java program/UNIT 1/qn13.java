class PThread extends Thread{
    public PThread(String name){
        super(name);
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " is running, Count: "+i);
        }
        System.out.println("\n");
    }
}

public class qn13 {
    public static void main(String args[]){
        PThread p1= new PThread("1st Thread");
        PThread p2= new PThread("2nd Thread");
        PThread p3= new PThread("3rd Thread");

        //Set thread priority
        
        p1.setPriority(Thread.MIN_PRIORITY);
        p2.setPriority(Thread.NORM_PRIORITY);
        p3.setPriority(Thread.MAX_PRIORITY);

        p1.start();
        p2.start();
        p3.start();


    }

}
