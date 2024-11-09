import java.util.*;

class thread1 implements Runnable {
    public void run() {
        int a = 1;
        while( a == 1 ) {
            int n = (int)(Math.random()*100);
            System.out.println("The generated number is " + n);
        
            if(n%2 == 0) {
                thread2 even = new thread2(n);
                Thread evenThread = new Thread(even);
                evenThread.start();
                
                try { 
                    Thread.sleep(1000);
            } catch(InterruptedException e) {
                System.out.println(e);
            }
            
       
        } else {
                thread3 odd = new thread3(n);
                Thread oddThread = new Thread(odd);
                oddThread.start();
                
                try { 
                    Thread.sleep(1000);
            } catch(InterruptedException e) {
                System.out.println(e);
            }
            
            
        }
    }
}   
}

class thread2 implements Runnable {
    private int num;
    thread2(int n) {
        num = n;
    }
   public void run(){
    System.out.println("The square of the generated number is " + (num*num)); }
}


class thread3 implements Runnable {
    private int num;
    thread3(int n) {
        num = n;
    }
     public void run(){
    System.out.println("The cube of the generated number is " + (num*num*num)); }
}


public class MultiThreading {
    public static void main(String[] args) {
        thread1 t = new thread1();
        Thread thread = new Thread(t);
        thread.start();
    }
}


//SAMPLE OUTPUT 
/** The generated number is 70
The square of the generated number is 4900
The generated number is 91
The cube of the generated number is 753571
The generated number is 64
The square of the generated number is 4096
The generated number is 68
The square of the generated number is 4624
The generated number is 50
The square of the generated number is 2500
The generated number is 68
The square of the generated number is 4624
The generated number is 79
The cube of the generated number is 493039
The generated number is 26
The square of the generated number is 676
The generated number is 9
The cube of the generated number is 729
The generated number is 56
The square of the generated number is 3136
The generated number is 31
The cube of the generated number is 29791
The generated number is 90
The square of the generated number is 8100
The generated number is 99
...
*/

