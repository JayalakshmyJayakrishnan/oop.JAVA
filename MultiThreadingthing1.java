import java.util.*;
class MultiThreadingthing extends Thread {
    private int threadNumber;
     public MultiThreadingthing(int threadNumber) {
        this.threadNumber = threadNumber;
    }
    
    @Override 
     public void run() {
        for(int i = 1; i<=5; i++) {
            System.out.println(i + " FROM THREAD " + threadNumber);
            
            try{
            Thread.sleep(1000);
            } catch(InterruptedException e) {
                e.printStackTrace();

            }
        }


    }
}
public class MultiThreadingthing1 {
    public static void main(String[] args) {
    for(int i = 0; i<5; i++) {
        MultiThreadingthing mythread1 = new MultiThreadingthing(i);
        mythread1.start(); 
    }
   
    }
}


/*
OUTPUT:
1 FROM THREAD 2
1 FROM THREAD 0
1 FROM THREAD 1
1 FROM THREAD 4
1 FROM THREAD 3
2 FROM THREAD 2
2 FROM THREAD 0
2 FROM THREAD 1
2 FROM THREAD 4
2 FROM THREAD 3
3 FROM THREAD 2
3 FROM THREAD 0
3 FROM THREAD 1
3 FROM THREAD 4
3 FROM THREAD 3
4 FROM THREAD 2
4 FROM THREAD 0
4 FROM THREAD 1
4 FROM THREAD 4
4 FROM THREAD 3
5 FROM THREAD 2
5 FROM THREAD 0
5 FROM THREAD 1
5 FROM THREAD 4
5 FROM THREAD 3

*/
