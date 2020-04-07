
package week10;

import java.util.Scanner;

public class arimatika {
    public static void main(String[] args) {
        
       Scanner input = new Scanner(System.in);
       
       System.out.print("Masukkan nila a =");
       int a = input.nextInt();
       
       System.out.print("Masukkan nilai b =");
       int b = input.nextInt();
       System.out.println("berikut ini adalah 10 bilangan pertama pada barisan aritmatika. Dengan suku pertama " + a + "dan beda " + b );
          
       for (int n=1;n <=10; n++) {
           System.out.println(a +(n-1)*b+"");   
       }
       int jawaban ;
        
       System.out.print("SOAL LATIHAN "+"");
       
       System.out.print("Berapakah nilai dari suku ke - 5 dari barisan aritmatika yang memiliki a = 5 dan b = 3 ?");
       jawaban = input.nextInt();
       
       if (jawaban == 17 ){
           System.out.print("jawaban anda benar");
       } else {
           System.out.print("jawaban anda salah");
       }
       }
    }
    

