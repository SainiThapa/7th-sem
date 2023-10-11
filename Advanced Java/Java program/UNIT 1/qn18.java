import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
// import java.util.Scanner;

public class qn18 {
    
    public static void main(String args[])
    {
        String source = "C:\\Users\\LENOVO\\Desktop\\7th sem\\Advanced Java\\Java program\\UNIT 1\\Saini.txt";
        
        // Scanner scan = new Scanner(System.in);
        boolean BoolLogic=true;
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(source));
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            while(BoolLogic){
                String line = br.readLine();
                if("quit".equalsIgnoreCase(line.trim())){
                    BoolLogic=false;
                }
                else{
                    bw.write(line);
                    bw.newLine();
                }
            }
            System.out.println("File Writing completed");
        }
        catch(IOException e){
            System.err.println("An error occurred: " + e.getMessage()); 
        }
        // finally{
        //     scan.close(); 
        // }
    }
}
