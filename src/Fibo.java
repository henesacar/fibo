import java.util.Scanner;
public class Fibo {
    static int fib(int info){
        if(info == 2 || info ==1){
            return 1;
        }
        return fib(info-1)+fib(info-2);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int data = scn.nextInt();
        System.out.println("Fibonacci sayısı: " +fib(data));

    }
}
