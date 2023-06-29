import java.io.Console;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Random ran=new Random();
        int[] massiv=new int[20];
        for (int i = 0; i < massiv.length; i++) {
            massiv[i]= ran.nextInt(1,20);
            System.out.print(massiv[i]+"   ");

        }int max=massiv[0];
        int min=massiv[0];
        double orto =0;
        for (int i = 0; i < massiv.length; i++) {
            if(max<massiv[i]){
                max=massiv[i];
            }if(min>massiv[i]){
                min=massiv[i];
            }orto+=(double) massiv[i]/massiv.length;
        }
        System.out.println();
        System.out.println("max = "+max);
        System.out.println("min = "+min);
        System.out.println("arif = "+orto);*/

     san(100,200);

    }
    static  void san(int a, int v){
        Random ran=new Random();
        for (int i = 0; i < 5; i++) {
            int c= ran.nextInt(a,v);
            System.out.print(" "+c+" ");

        }

    }

    }
