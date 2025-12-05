import java.util.Scanner;


public class Main {
    public static void main(String[] Args) 
    {  
        Scanner sc = new Scanner(System.in);
       System.out.println("Whats your favorite part of coding chat?: ");
        String answer = sc.nextLine();
        System.out.println("\n" + answer);
    }

}