import java.io.*;
public class qn14 {
    public static void main(String args[])
    {
        String sourcefile = "C:\\Users\\LENOVO\\Desktop\\7th sem\\Advanced Java\\Java program\\UNIT 1\\Saini.txt";

        String DestFile = "C:\\Users\\LENOVO\\Desktop\\7th sem\\Advanced Java\\Java program\\UNIT 1\\Thapa.txt";
        
        try (BufferedReader FR = new BufferedReader(new FileReader(sourcefile));
        BufferedWriter FW = new BufferedWriter(new FileWriter(DestFile))){
            String line;
            while((line=FR.readLine())!=null){
                FW.write(line);
            }
            System.out.println("File copied successfully");
        }
        catch(IOException e){
            System.out.println("An error occured : " + e.getMessage());
        }
    }
    
}
