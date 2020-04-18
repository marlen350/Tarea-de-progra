package prueba;
import java.util.Scanner;
public class MatrIz3 {
    public static void main(String[] args) {
        Scanner matris=new Scanner(System.in);      
        System.out.println("Ingresa un total de filas(numero): ");
 int ma,tr;   
    ma=matris.nextInt();
    int e=ma-1;
        System.out.println("Ingrese un total de columnas(numero): ");
    tr=matris.nextInt();
        String matriz [][]= new String [ma][tr];
int i,j;
        for( i=0;i<ma;i++){
            for(j=0;j<tr;j++){
                    matriz[i][j]=" ";  
                }}
        for(i=0;i<tr;i++){
            matriz[0][i]="x";
            matriz[e-1][i]="x";
        } for(i=0;i<ma;i++){
            matriz[i][0]=" X ";
            matriz[i][tr-1]=" X ";
        }for(i=0; i<ma;i++){ for(j=0;j<tr;j++){
              System.out.print(" [ " + matriz[i][j] + "  ] ");
            }System.out.println();}
        
    }
}
