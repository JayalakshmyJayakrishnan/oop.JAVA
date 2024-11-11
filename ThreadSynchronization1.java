import java.util.Random;

class Counter {
    private int count = 0;
    
    public synchronized void Inc() {
        count ++;
    }
    
    public synchronized int getCount() {
        return count;
    }
    
}


class IncThread extends Thread {
    private Counter c;
    
   public IncThread(Counter c) {
       this.c = c;
   } 
    
    public void run() {
    for(int i = 0; i<1000; i++) 
    c.Inc();
        
    }
    
}

class Main {
    public static void main(String[] args) {
        Counter c = new Counter();
        IncThread t1 = new IncThread(c);
        IncThread t2 = new IncThread(c);
        
        t1.start();
        t2.start();
    
     try{  
         t1.join();
         t2.join();
    } catch(InterruptedException e) {
        e.printStackTrace();
    } 
    
    
    Random num = new Random();
    int randnum = num.nextInt(100);
    System.out.println("Generated random number is " + randnum);
    
    if(randnum%2 == 0) {
        System.out.println("The generated number is even.");
    } else {
        System.out.println("The generated number is odd.");
    } 
    System.out.println("EXITING THE PROGRAM....");
    }
}

/* 
OUTPUT
Generated random number is 100
The generated number is even.
EXITING THE PROGRAM....
  */
