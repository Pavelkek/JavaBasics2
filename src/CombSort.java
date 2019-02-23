import java.util.Scanner;

public class CombSort {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Веди длину массива");
        int masLength = 0;
        for (int i = 0; i < 1; i++){
            try {
                masLength = in.nextInt();
            } catch (java.util.InputMismatchException e){
                System.out.println("Введено не число! Введи по новой");
                i--;
                in.next();
            }
        }
        int mas[] = new int[masLength];

        for (int i = 0; i < masLength; i++){
            System.out.println("Введи " + (i+1) + "й элемент массива");
            try {
                mas[i] = in.nextInt();
            } catch (java.util.InputMismatchException e){
                System.out.println("Введено не число! Введи по новой");
                i--;
                in.next();
            }
        }

        System.out.println("Исхожный массив:");
        for (int i = 0; i < masLength; i++){
            System.out.print(mas[i] + " ");
        }

        int width = masLength;
        for (int i = 0; i < masLength-1; i++){
            width--;
            for (int j = 0; j < masLength; j++){
                if ((j + width) < masLength){
                    if(mas[j] > mas[j+width]){
                        int variable = mas[j];
                        mas[j] = mas[j + width];
                        mas[j + width] = variable;
                    }
                } else {
                    break;
                }
            }
        }

        System.out.println("\nОтсортированный массив:");
        for (int i = 0; i < masLength; i++){
            System.out.print(mas[i] + " ");
        }
    }
}