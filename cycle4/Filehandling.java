import java.io.file;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
public class Filehandling{
    public static void main(String[] args)
    {
        try{
            File f=new File("file.txt");
            if(f.createNewFile())
            {
                System.out.println("File created"+f.getName())
            }
            else{
                System.out.println("File exist");
            }
        }
        catch(IOException e1)
        {
            System.out.println("Error occured");
            e1.printStackTrace();
        }
       try{
           FileWriter writer=new FileWriter("file.txt");
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter text");
           String text=sc.nextLine();
           writer.write(text);
           writer.close();
           System.out.println("Successfully wrote to file");
       }
       catch(IOException e2){
           System.out.println("Error occured");
           e2.printStackTrace();
       }
    }
    
}
