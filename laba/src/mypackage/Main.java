package mypackage;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        Komnata k = new Komnata();
        char c;
        System.out.println("1 - добавить стул");
        System.out.println("2 - добавить дверь");
        System.out.println("3 - убрать 1 стул");
        System.out.println("4 - убрать 1 дверь");
        System.out.println("5 - показать все");
        System.out.println("6 - выход");
        do
        {
            c = (char)('0' + scanner.nextByte());
            if( c == '1' ) {
                k.DobavitStul();
            }
            else
            if( c == '2' ) {
                k.DobavitDver();
            }
            else
            if( c == '3' ) {
                k.UbratStul();
            }
            else
            if( c == '4' ) {
                k.UbratDver();
            }
            else
            if( c == '5' ) {
                k.PokazatVse();
            }
        }
        while (c != '6');
    }
}
