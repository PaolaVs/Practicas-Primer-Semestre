
import java.util.Scanner;


public class Principal {
  
    public static void main(String[] args) {
        
        double media = 0.0;
        
        
        System.out.println("¿Cuantas personas son?");
          Scanner cNum = new Scanner(System.in);
          int num = cNum.nextInt();
          int[] edad = new int[num];
          for (int i = 0; i < num; i++) {
          System.out.println("Ingrese edad");
          edad[i] = cNum.nextInt();
          media = media + edad[i];
             
          
          
            
        }
       
        
            
            
        }
        
        
          
          
// TODO code application logic here
    }
    

