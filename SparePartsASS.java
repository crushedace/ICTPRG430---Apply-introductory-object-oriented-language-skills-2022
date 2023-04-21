
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SparePartsASS{
    public static void main(String[] args) throws IOException {

// this is the block of code for the blamazon menu

    char userSelected;
        String userEntry;
        Boolean isMenuItem = false;
        System.out.println("BLAMAZON fulfiment center \n");
        System.out.println("Select a number to continue...\n");
        System.out.println("1. Start entering details\n");
        System.out.println("2. are you gonna try your luck this time ???? \n ");
        System.out.println("0. Exit\n");
      

        try (Scanner myInputDevice = new Scanner(System.in)) {
          while (!isMenuItem){

              userEntry = myInputDevice.nextLine();
              userSelected = userEntry.charAt(0);

              switch (userSelected) {
                  case '0':
                      System.out.println("Exiting program now!");
                      isMenuItem=true;
                      break;

                  case '1':
                          System.out.println("please enter customer details!");
                          isMenuItem=true;
                          System.out.println("customers name will appear on order:");
                          break;
                  case '2':
                          System.out.println("you tried your luck that was very risky");
                          isMenuItem=true;
                          break;}      
                        
  {
  //File Read and load into array
  List<String> listOfStrings = new ArrayList<String>();
  BufferedReader buff = new BufferedReader(new FileReader("tickets.txt"));
  String line = buff.readLine();
  while (line != null) 
  { 
   listOfStrings.add(line);
   line = buff.readLine();

  }
  buff.close();
  String[] array = listOfStrings.toArray(new String[0]);
  //
  int num =Randomizer.NumGen();
  String Name=customers.InputName();
  System.out.println(Name + "'s Ticket Number Is :"+ num);
  
  //File Writer
  if(array[0].contains(String.valueOf(num)))
  {
   try 
   {
          FileWriter myWriter = new FileWriter("tickets.txt",true);
          myWriter.write(Name + "'s Ticket Number Is :"+ num+1+  "\r\n"   );
          myWriter.close();
          System.out.println(" Successfully wrote to the file.");
   } catch (IOException e) 
   {
          System.out.println(" An error occurred.");
          e.printStackTrace();
   }
  }
  else
  {
   try
    {
          FileWriter myWriter = new FileWriter("tickets.txt",true);
          myWriter.write(Name + "'s Ticket Number Is :"+ num+  "\r\n"   );
          myWriter.close();
          System.out.println(" Successfully wrote to the file.");
   }
    catch (IOException e) {
          System.out.println(" An error occurred.");
          e.printStackTrace();
   }
  }
 }
}
}
}
}

 
 




    
 