import java.util.Scanner;

public class Lec10_HWQ2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        
    System.out.print("Enter Size Of Array: ");
    int size = sc.nextInt();
    sc.nextLine();
    
    int arr[] = new int[size];
    
    for(int i = 0; i < arr.length; i++){
      System.out.print("Enter Element at Index " + i + ": ");
      arr[i] = sc.nextInt();
    }
    
    // Initialize min and max with the first element
    int min = arr[0];
    int max = arr[0];
    
    // Start the loop from index 1 since we've already used the first element
    for(int i = 1; i < arr.length; i++){
      if(arr[i] < min){
        min = arr[i];
      }
      
      if(arr[i] > max){
        max = arr[i];
      }
    }
    
    System.out.println("Max Number is: " + max);
    System.out.println("Min Number is: " + min);
    
    sc.close(); // Good practice to close the Scanner
  }
}