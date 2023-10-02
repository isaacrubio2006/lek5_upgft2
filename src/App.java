import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner tangentbord = new Scanner(System.in)){   
       int[] fält1 = new int[4];
       fält1[0]= tangentbord.nextInt();
       fält1[1]= tangentbord.nextInt();
       fält1[2]= tangentbord.nextInt();
       fält1[3]= tangentbord.nextInt();
       System.out.println(fält1[0]+" "+fält1[1]+" "+fält1[2]+" "+fält1[3]);
            
       int temp = fält1[0];
       fält1[0] = fält1[3];
       fält1[3] = temp;
       
       System.out.println(fält1[0]+" "+fält1[1]+" "+fält1[2]+" "+fält1[3]);

       String str1 = "hej";
       String str2 = "nej";
       String str3 = "dig";
       System.out.println("gissa");
       String skriv = tangentbord.nextLine();
       skriv = tangentbord.nextLine();
       System.out.println("gissa");
       String skriv2 = tangentbord.nextLine();
       skriv = tangentbord.nextLine();
       System.out.println("gissa");
       String skriv3 = tangentbord.nextLine();
       skriv = tangentbord.nextLine();
       
       System.out.println(skriv.equals(str1));
        System.out.println(skriv2.equals(str2));
         System.out.println(skriv3.equals(str3));
        
    

        }
    }
}
