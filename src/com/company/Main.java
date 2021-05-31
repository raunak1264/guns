package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Enter the number of the gun");
        Scanner sc = new Scanner(System.in);
        int thegun = sc.nextInt();
//            if(thegun <9){
//                thegun += 1;
//            }else
//            {
//                thegun = 1;
//            }
            switch(thegun){
                case 1:
                    System.out.println("︻デ═一");
                    break;
                case 2:
                    System.out.println("*-* ︻┳デ═—");
                    break;
                case 3:
                    System.out.println( "▄︻̷̿┻̿═━一");
                    break;
                case 4:
                    System.out.println( "(⌐■_■)--︻╦╤─ - - -");
                    break;
                case 5:
                    System.out.println( "︻╦̵̵͇══╤─");
                    break;
                case 6:
                    System.out.println( "✯╾━╤デ╦︻✯");
                    break;
                case 7:
                    System.out.println( " ̿̿ ( ▀ ͜͞ʖ▀)=€̿̿▄︻̷̿┻̿═━一");
                    break;
                case 8:
                    System.out.println( "(⌐■_■)–︻╦╤─");
                    break;
                case 9:
                    System.out.println( "╾━╤デ╦︻༼ಠ益ಠ༽︻╦̵̵͇══╤─");
                    break;
            }
    }
}
