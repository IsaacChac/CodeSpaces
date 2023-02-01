import java.io.*;
//Isaac Gallo/Jose Luis Zavala
public class GalloZavalaCOLACIRCULAR {
   public static class ClaseColaCircular { // Declaracion de la clase 
    static int MAX=5; //Declaracion de variables
    static int cola[]=new int[MAX]; 
    static int frente, fin; 

    ClaseColaCircular() { 
     frente=-1;    fin=-1;
    }
    
    public void show() {//Funcion de mostrar.
     int i=0;
     if(frente==-1) {
      System.out.println(" Cola Vacia");
     }
     else {
      i=frente;
      System.out.println("Elementos:");
      do {
              System.out.println(cola[i]);
              i++;
              if(i==MAX && frente>fin) i=0;
         }while(i!=fin+1);
        }
    }
        
    public void push(int dato) {//Funcion para insertar.
     if((fin==MAX-1 && frente==0) || (fin+1==frente)) {
      System.out.println(" Cola LLena :(");
      return;
     }
     if(fin==MAX-1 && frente!=0) fin=0; else fin++;
     cola[fin]=dato;
     if(frente==-1) frente=0;
    }
    
    public void pull() {//Funcion para pull
     if(frente==-1) {
      System.out.println("Cola vacia");
      return;
     }
     System.out.println("Dato eliminado correctamente");
     if(frente==fin) {
        frente=-1;   fin=-1;
      return;
     }
     if(frente==MAX) frente=0; else frente++;
    }
   }
   
   // Instancia del objeto
   static ClaseColaCircular ColaCircular=new ClaseColaCircular();
   
   // Funcion Main
   public static void main(String args[]) throws IOException {
      int op=0;
      do {//menú
              System.out.println("Seleccione una opcion");
              System.out.println("1.- push");
              System.out.println("2.- pull");
              System.out.println("3.- show");
              System.out.println("0.- Salir");

              op=getInt();
              switch(op) {
               case 1 : dato();                           break;
               case 2 : ColaCircular.pull();  break;
               case 3 : ColaCircular.show();   break;
              }
      }while(op!=0);//fin del do while.
   }
   
   public static void dato() throws IOException {//funcion parasolicitar dato.
    int dato;
    System.out.print("inserta dato: ");
    dato=getInt();
    ColaCircular.push(dato); 
   }
   
   // Funcion para string
       public static String getString() throws IOException {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            String s = br.readLine();
            return s;
        }    
        
        // Funcion para ints
        public static int getInt() throws IOException {
            String s = getString();
            return Integer.parseInt(s);
        }    
}