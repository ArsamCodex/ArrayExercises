package ArraysExercuse;

import java.util.Scanner;

public class Example6_1 {
    static Scanner console = new Scanner(System.in);

    public static void main(String [] args){
        int items [] = new int [5];
        int i , sum;
        sum = 0;
        System.out.println("ENTER V INTEGER");
        for(i = 0 ; i < items.length ; i++ ){
            items[i]  = console.nextInt();
            sum += items[i];
        }

        System.out.println("THE SUM OF NUMBERS IS " + sum);
        System.out.println("THE NUMBERS IN REVERSE ORDE");
        for( i = items.length - 1 ;i >=0 ;i--){
            System.out.println(items[i] + " ");
        }

    }
}
