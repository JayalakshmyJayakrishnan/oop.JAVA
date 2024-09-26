import java.util.Scanner;
class ArrOcc{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

   System.out.println("Enter the characters : ");
   String input = sc.nextLine();
char[] charac = input.toCharArray();

System.out.println("Enter the target character: ");
char target = sc.next().charAt(0);

int count = 0;
for( char c: charac){
if ( c == target){
count ++;
}
}
System.out.println("The character " + target + " occurs " + count +  " times. ");
}
}



 






















