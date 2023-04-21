import java.util.Scanner;
public class customers{
    public static String InputName() {
    Scanner inputname = new Scanner(System.in); 
    System.out.println("Enter customers name");

    String Name = inputname.nextLine();  
    inputname.close();

    return Name.toString();
    }
}
