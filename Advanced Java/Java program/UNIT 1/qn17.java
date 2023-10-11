import java.io.*;

public class qn17 extends Thread{

    public static void main(String args[])
    {

        String sourcefile = "C:\\Users\\LENOVO\\Desktop\\7th sem\\Advanced Java\\Java program\\UNIT 1\\dest.txt";    
        try{
            BufferedReader reader = new BufferedReader(new FileReader(sourcefile));
            String line;
        while((line=reader.readLine())!=null){
            System.out.println(line);
             }
        }
    catch(IOException e){
        System.err.println("An error occurred: " + e.getMessage()); 
         }
    }

}