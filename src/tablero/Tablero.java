// Ctrl + Space dropdown menu

package tablero;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author LuikFear
 */
public class Tablero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        
        //Declaration of the Array
        char player [][] = new char [8][8];
        char trap  [][] = new char [8][8];
        int num [][]= new int [8][8];
        String vac = " ";
         int val =64;
          int posi = 0;
          int mover = 0;
          int fila = 7;
          Random random = new Random();
            Scanner sp= new Scanner(System.in);
        //We use while to make a nonstop game or program
        //START OF THE MENU
          while (true) {            
           
          
              System.out.println("♦-♦♦Menu♦♦-♦");
              System.out.println("1. Iniciar partida");
              System.out.println("2.Retomar Partida ");
              System.out.println("3. Salir ♥");
              
              
            int opcion = sp.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("Partida Iniciada");
                    break;
                case 2: 
                    System.out.println("Resumir juego");
                    break;
                case 3: 
                    System.exit(0);
                    break;
              }
        

        
        
        




       
      
        
      // boolean to make it back
       boolean lado = true;
      // if that'll be will change direction (this is called a inverse for)
        for (int i = 0; i < num.length; i++) {
            
            if (lado) {
                                      // we use -1 cuz position 8 doesn't exist
                for (int j =num[i].length-1; j >= 0; j--) {
                   
                    num[i][j]=val;
                    //-- to retract 1
                    val--;
                    
                }
                //
                lado = false;
                //else to change direction
            } else {                   //
                for (int j = 0; j < num[i].length; j++) {
                     num[i][j]=val;
                    val--;
                    
                } //we make those true-false to make it goes from 0 to 7 
                lado= true;
            }
            
            
            
       
                 
            }
        
            //we use for here to make all the lines OwO and that symbol that even the teacher forgot its name "│" this one, ALT + 179
           
          
            trap[7][7] = '#';
              player[7][7] = '@';
            while (posi <= 64){
                //First line impression
        System.out.println("----*-----*-----*------*------*------*------*-");
            for (int i = 0; i < num.length; i++) {
                for (int j = 0; j < num[i].length; j++) {
               
                if (num[i][j]<10) {
                        System.out.print("│   " +num [i]  [j]);
                    } else {
                            System.out.print("│  " +num [i]  [j]);
                    }
                
                
                    
                }
            
            
            System.out.println("│");
            // trap system
                for (int j = 0; j < trap.length; j++) {
                   System.out.print("│ "+ player[i][j] + trap [i][j]);
                    
                }
               System.out.println("│");
                System.out.println("----*-----*-----*------*------*------*------*-");
        }
               for (int i = 0; i < player.length; i++) {
                            for (int j = 0; j < player[i].length; j++) {
                                player[i][j] = ' ';
                                
                            }
               }    
        
        
                System.out.println("Deseas Tirar el dado con la R o salir al menu con P");
                String op = sp.nextLine();
                
                switch (op) {
                
                    case "r":
                    int dado = (int) (Math.random() * (6-2)+2);
                        System.out.println(dado + "Puedes moverte ");
                        posi += dado;
                        
                     if (posi <= 56 ){
                     player[0][57-posi]= '@'; 
                                
                               } else if (posi <= 48 ){
                           player[1][49-posi]= '@';  
                                           
                           } else if (posi <= 40 ){
                           player[2][41-posi]= '@'; 

                          } else if (posi <= 32 ){
                           player[3][33-posi]= '@';       
                         
                        } else if (posi <= 24 ){
                           player[4][25-posi]= '@';
                           
                        } else if (posi <= 16 ){
                           player[5][16-posi]= '@';
                        
                        } else if (posi <= 7 ){
                           player[6][posi -8]= '@';
                            
                        } else {
                             player[7][7-posi]= '@';
                        }
                        
              
                               break;
                    case "p":
                        System.out.println("Abrir Menu");
                 
                               break;
                        
                }
                
                
                
                
         
                 
                       
                        
                        
                        
                
                
            }
            }
               
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }


    

