import java.util.Scanner;

public class Mod5 {
    public static void main(String args[]){
        System.out.println("Would you like to see a Cat or Dog");
        Scanner scan = new Scanner(System.in) ;
        String aniC = scan.nextLine();
        System.out.println("You picked" + aniC);

        if(aniC.equals("Cat")) {
            System.out.println("Cat ASCII ART HERE");
         } else if (aniC.equals("Dog")) { 
            System.out.println("Dog ASCII ART HERE");
            
            
        } else{
            System.out.println("Enter Dog or Cat Please");
        }
        



    }
}
