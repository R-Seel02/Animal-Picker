import java.util.Scanner;

public class Mod5 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in) ;
        String aniC;
       



       
    do {
        System.out.println("Would you like to see a Cat or Dog or Fish");
       aniC = scan.nextLine().toLowerCase();
        System.out.println("You picked  " + aniC);


        if(aniC.equals("Cat")) {
            System.out.println("\" _._     _,-\\'\\\"\\\"`-._\\n" + //
                    "(,-.`._,\\'(       |\\\\`-/|\\n" + //
                    "    `-.-\\' \\\\ )-`( , o o)\\n" + //
                    "    ");
         } else if (aniC.equals("Dog")) { 
            System.out.println("\"  __      _\\n" + //
                    "o\\'\\')}____//\\n" + //
                    " `_/      )\\n" + //
                    " (_(_/-(_/\"");
            
            
        } else if (aniC.equals("Fish")){
            System.out.println("\"\\\" o\\\\n" + //
                    "o      ______/~/~/~/__           /((\\\\n" + //
                    "  o  // __            ====__    /_((\\\\n" + //
                    " o  //  @))       ))))      ===/__((\\\\n" + //
                    "    ))           )))))))        __((\\\\n" + //
                    "    \\\\\\\\\\\\\\\\     \\\\\\\\)     ))))    __===\\\\\\\\ _((\\\\n" + //
                    "     \\\\\\\\\\\\\\\\_______________====      \\\\\\\\_((\\\\n" + //
                    "                                 \\\\\\\\((\\\"\"");
        }
        
        else{
            System.out.println("INVALID " + "Enter Dog or Cat or Fish Please");
        }


    } while (!aniC.equals("Dog") && !aniC.equals("Cat") && !aniC.equals("Fish"));

    scan.close();
       

        



    }

   
}
