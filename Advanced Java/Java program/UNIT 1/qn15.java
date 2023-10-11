import java.io.*;

public class qn15 {
    
    
    public static void main(String[] args) {
        String sourcefile = "C:\\Users\\LENOVO\\Desktop\\7th sem\\Advanced Java\\Java program\\UNIT 1\\Saini.txt";

        String DestFile = "C:\\Users\\LENOVO\\Desktop\\7th sem\\Advanced Java\\Java program\\UNIT 1\\Thapa.txt";
        
        try (FileReader reader = new FileReader(sourcefile);
        FileWriter writer = new FileWriter(DestFile)) {
            
            int charRead;
            while ((charRead = reader.read()) != -1) {
                writer.write(charRead);
                //                writer.write(charRead);
            }
            
            System.out.println("Characters duplicated successfully!");
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}