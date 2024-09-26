class ArrSecLarg{
  public static void main(String[] args){
    int[] arr = {10, 20, 30, 40, 50};
    int largest = Integer.MIN_VALUE;
    int secondlargest = Integer.MIN_VALUE;

    for(int num : arr){
      if(num > largest){
        secondlargest = largest;
        largest = num;
      }
      if(num > secondlargest && num!= largest){
        secondlargest = num;
      }
    }
    System.out.println("The second largest element is : " + secondlargest);
  }
}
    
