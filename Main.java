import java.util.*;
import java.io.*;
class Main {
  public static void main(String[] args) throws FileNotFoundException
  {
    Scanner user= new Scanner(System.in);
    int option= 0;
    while (option!=5){
      System.out.println("Press 1 to learn about the salary.");
      System.out.println("Press 2 to learn about the job.");
      System.out.println("Press 3 to learn about the demand.");
      System.out.println("Press 4 to view current students.");
      System.out.println("Press 5 to quit.");
      option= user.nextInt();
      if(option==1){
        System.out.println("$98,345 average salary in South Florida!");
      }
      else if(option==2){
        System.out.println("US news - 100 Best Jobs!");
      }
      else if(option==3){
        System.out.println("Top 10 Forbes In-Demand Jobs!");
      }
      else if(option==4){
          Scanner file = new Scanner(new File("names.txt"));
          while(file.hasNextLine()){
            String line= file.nextLine();
            System.out.println(line);
          }
      }
      else if(option==5){
       return;
      }
    }
  }
}