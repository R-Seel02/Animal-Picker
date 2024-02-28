import java.util.Scanner;

public class Mod5 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in) ;
        String aniC;
       



       
    do {
        System.out.println("Would you like to see a Cat or Dog");
       aniC = scan.nextLine().toLowerCase();
        System.out.println("You picked" + aniC);


        if(aniC.equals("Cat")) {
            System.out.println("Cat ASCII ART HERE");
         } else if (aniC.equals("Dog")) { 
            System.out.println("Dog ASCII ART HERE");
            
            
        } else{
            System.out.println("INVALID" + "Enter Dog or Cat Please");
        }


    } while (!aniC.equals("dog") && !aniC.equals("cat"));

    scan.close();
       

        



    }

   
}
