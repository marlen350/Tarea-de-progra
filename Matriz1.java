package prueba;
import java.util.Scanner;
public class Matriz1 {
   
    public static void main(String[] args) {
       Scanner matris= new Scanner(System.in);
        int m,t;
        System.out.println("Ingresa un numero de filas: ");
        m= matris.nextInt();
        t=m-1;
        System.out.println("Ingresa un numero de columnas: ");
        int one= matris.nextInt();
        int j,i;
        String matriz [][]=new String [m][one];
        for(i=0;i<m;i++)
        {
            for(j=0;j<one;j++){
                matriz [i][j]= "x";
            }
        }
       for(j=0;j<one;j++){
           matriz[t][j]=" ";
           t--;
       } 
       for(i=0;i<m;i++){
           for(j=0;j<one;j++){
               System.out.println("[      "+ matriz[i][j]+ " ]");
           }
           System.out.println( );
       }         
    }
}
