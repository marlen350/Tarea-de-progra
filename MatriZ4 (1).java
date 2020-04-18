package prueba;
import java.util.Scanner;
public class MatriZ4 {
public static void main(String[] args) {
        Scanner matris = new Scanner(System.in);
        System.out.println("Ingresa un tamano de filas: ");
        int m, z;
        m = matris.nextInt();
        System.out.println("Ingrese un tamano de columnas:  ");
        z = matris.nextInt();
        String matriz[][] = new String[m][z];
        int i, p;
        for (i = 0; i < m; i++) {
            for (p = 0; p < z; p++) {
                matriz[i][p] = " D";            }        }
        for (i = 0; i < m; i++) {
            for (p = 0; p < z; p++) {
                if ((i == 0) && (p > 0) && (p < 6)) {
                    matriz[i][p] = " 1";                }
                if ((i == z) && (p > z) && (p < 5)) {
                    matriz[i][p] = " 1 ";                }
                if ((i == 2) && (p > 2) && (p < 4)) {
                    matriz[i][p] = "1";
                }            }        }
        for (i = 0; i < m; i++) {
            for (p = 0; p < z; p++) {
                if ((i == 6) && (p > 0) && (p < 6)) {
                    matriz[i][p] = "3";                }
                if ((i == 5) && (p > 1) && (p < 5)) {
                    matriz[i][p] = "3";                }
                if ((i == 4) && (p > 2) && (p < 4)) {
                    matriz[i][p] = "3";                }            }        }
        for (i = 0; i < m; i++) {
            for (p = 0; p < z; p++) {
                if ((p == 6) && (i > 0) && (i < 6)) {
                    matriz[i][p] = "2";                }
                if ((p == 5) && (i > 1) && (i < 5)) {
                    matriz[i][p] = "2";                }
                if ((p == 4) && (i > 2) && (i < 4)) {
                    matriz[i][p] = "2";                }            }        }
        for (i = 0; i < m; i++) {
            for (p = 0; p < z; p++) {
                if ((p == 0) && (i > 0) && (i < 6)) {
                    matriz[i][p] = "4";                }
                if ((p == 1) && (i > 1) && (i < 5)) {
                    matriz[i][p] = "4";                }
                if ((p == 2) && (i > 2) && (i < 4)) {
                    matriz[i][p] = "4";                }            }        }
        for (i = 0; i < m; i++) {
            for (p = 0; p < z; p++) {
                if (i == p) {    matriz[i][p] = "0";                }
                if ((i + p) == (i - 1)) {
                    matriz[i][p] = "0";                }            }        }
        for (i = 0; i < m; i++) {
            for (p = 0; p < z; p++) { System.out.print(" [ " + matriz[i][p] + "  ] ");
            }    System.out.println();
        }
    }
}
