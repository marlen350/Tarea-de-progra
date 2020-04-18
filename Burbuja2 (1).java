package ordenamiento;
import java.util.Scanner;
public class Burbuja2 {
    public static void main(String[] args) {
       	Scanner medida=new Scanner(System.in);
		int f;
		System.out.println("Ingresar un tamano fijo: ");
		f=medida.nextInt(); 
		int au[]=new int[f]; 
		System.out.println("Ingresar los " +f+ " valores enteros:");
		for(int i=0;i<f;i++)		{	
			au[i]=medida.nextInt(); 			
		}
		int a=0;
		for(int j=0;j<f;j++)
		{
			for(int i=0;i<f-1;i++)
			{		   if(au[i]>au[i+1])
		{
			a=au[i];
			au[i]=au[i+1];
			au[i+1]=a;
		    }			}	}		int p=0;
		System.out.println("Numeros ordenados:");
		while(p<f)
		{
			System.out.println(au[p]);
			p++;
		}
        
}
}