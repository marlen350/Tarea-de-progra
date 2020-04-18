package HERENCIA;
import java.util.Scanner;
public class HERENCIA {
    public static void main(String[] args) {
        Dog[] dogs= insertDog();
        dogs = insertDog();
        printDogsOnConsole(dogs);
        feed(dogs);
        System.out.println("After eating------------");
        printDogsOnConsole(dogs);
    }
    private static void feed(Dog[] dogs){
        for(int i = 0;i<dogs.length;i++) {
            double weightBeforefeeding = dogs[i].getWeight();
            dogs[i].setWeight(weightBeforefeeding + 0.5);
        }
    }
    private static void printDogsOnConsole(Dog[]dogs){
        for (int i = 0;i< dogs.length;i++) {
            dogs[i].printToConsole();
        }
} private static Dog2[] insertDog() {
        Dog2[] dogs = new Dog2[4];
        String[] names = new String[4];
        String[] colours = new String[4];
        Double[] weight = new Double[4];
        Double[] portion = new Double[4];
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < dogs.length; i++) {
            System.out.println("Ingrese el nombre del perro " + (i + 1));
            String nombre = teclado.nextLine();
            names[i] = nombre;
        }
        for (int i = 0; i < dogs.length; i++) {
            System.out.println("Ingrese el color del perro " + (i + 1));
            String color = teclado.nextLine();
            colours[i] = color;
        }
        for (int i = 0; i < dogs.length; i++) {
            System.out.println("Ingrese el peso del perro " + (i + 1));
            Double peso = teclado.nextDouble();
            weight[i] = peso;
        }
        for (int i = 0; i < dogs.length; i++) {
            System.out.println("Ingrese la porcion del perro " + (i + 1));
            Double porcion = teclado.nextDouble();
            portion[i] = porcion;
        }
        for (int i = 0; i < dogs.length; i++) {
            Dog2 dog = new Dog2();
            dog.setName(names[i]);
            dog.setColour(colours[i]);
            dog.setWeight(weight[i]);
            dog.setPortion(portion[i]);
            dogs[i] = dog;
        }
        return dogs;
    }
}
