class NumberPrinter extends Thread{
    private int start;
    private int end;
    private long miliseconds;

    public NumberPrinter(int start,int end,long miliseconds){
        this.start=start;
        this.end=end;
        this.miliseconds=miliseconds;
    }

    public void run() {
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
            try {
                Thread.sleep(miliseconds);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class qn12{
    public static void main(String args[]){
        Thread p1= new NumberPrinter(1, 10, 500);
        Thread p2 = new NumberPrinter(1, 10, 1000);

        p1.start();
        System.out.println("\n");
        p2.start();
    }
}