import java.util.Scanner;
public class Stack{
    int[] stack;
    int top;

    public Stack(int size){
        stack = new int[size];
        top = -1;

    }


public boolean isEmpty(){
    return top == -1;

}

public boolean isFull(){
    return top == stack.length - 1;

}

public void push(int data){
    if (isFull()){
        System.out.println("Stack Overflow Condition!");
        return;

    }

top++;
stack[top]=data;
}


public int pop(){
    if(isEmpty()){
        System.out.println("Stack Underflow Condition!");
        return -1;

    }
int poppedItem = stack[top];
top --;
return poppedItem;
}

public int peek(){
    if(isEmpty()){
        System.out.println("Stack is empty.");
        return -1;

    }

    return stack[top];

}

public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the size: ");
    int size = sc.nextInt();
    
    Stack stack = new Stack(size);


    while(true) {
        System.out.println("1. PUSH");
        System.out.println("2. POP");
        System.out.println("3. PEEK");
        System.out.println("4. EXIT");
        System.out.println("Enter your choice: ");

        int choice = sc.nextInt();


        switch(choice){
            case 1:
            System.out.println("Enter the element to be pushed: ");
            int ele = sc.nextInt();
            stack.push(ele);
            break;

            case 2:
            int poppedItem = stack.pop();
            if(poppedItem!= -1){
                System.out.println("Popped element: " + poppedItem);

            }
            break;

            case 3:
            int peekedItem = stack.peek();
            if(peekedItem!= -1){
                System.out.println("Top element: " + peekedItem);

            }
            break;

            case 4:
            System.exit(0);

            default:
            System.out.println("Invalid choice!");
        }


    }
}
}
