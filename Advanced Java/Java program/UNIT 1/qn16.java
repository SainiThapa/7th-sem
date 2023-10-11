import java.io.*;
public class qn16{

    public static void main(String args[]){
        String sourcefile = "C:\\Users\\LENOVO\\Desktop\\7th sem\\Advanced Java\\Java program\\UNIT 1\\source.txt";

        String DestFile = "C:\\Users\\LENOVO\\Desktop\\7th sem\\Advanced Java\\Java program\\UNIT 1\\dest.txt";
        
        try (BufferedReader reader = new BufferedReader(new FileReader(sourcefile));
        BufferedWriter writer = new BufferedWriter(new FileWriter(DestFile))) {

       String line;
       while ((line = reader.readLine()) != null) {
           String[] parts = line.split(",");
           if (parts.length == 4) {
               String name = parts[0].trim();
               double principle = Double.parseDouble(parts[1].trim());
               double rate = Double.parseDouble(parts[2].trim());
               double time = Double.parseDouble(parts[3].trim());

               double simpleInterest = (principle * rate * time) / 100.0;
               String outputLine = name + ", " + principle + ", " + rate + ", " + time + ", " + simpleInterest;

               writer.write(outputLine);
               writer.newLine(); // Add a newline character to separate records
           }
       }

       System.out.println("Simple interest calculated and written to the destination file!");

   } 
   catch (IOException | NumberFormatException e) {
       e.printStackTrace();
        }
    }
}
