package src;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println("Hola Mundo " + number + "!");
        scanner.close();
        
    }
}