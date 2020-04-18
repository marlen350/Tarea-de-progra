package prueba;
import java.util.Scanner;
public class mAtriz2 {
    public static void main(String[] args) {
        Scanner matris = new Scanner(System.in);
        System.out.println("Ingresa cunatas filas: ");
        int m, t;
        m= matris.nextInt();
        int v=m-1;
        System.out.println("Ingrese cuantas columnas: ");
        t= matris.nextInt();
        String matriz[][] = new String[m][t];
        int i, j;
        for (i=0;i<m;i++) {
            for (j=0;j<t;j++) {
                if (i == j) {
                    matriz[i][j] = " ";
                } else 
                {    
                    matriz[i][j] = " x ";
                }            }
        }
        for(j=0;j<t;j++) {
            matriz[v][j] = " ";
        }
        for (i=0;i<m;i++) {
            for (j = 0; j < t; j++) {
                System.out.println(" [ " + matriz[i][j] + "]");
            }
            System.out.println();
        }
    }

}
