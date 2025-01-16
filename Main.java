import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    // Problem 1 - Create a scanner and an array of size 3
    // double [] num = new double[3];
    // System.out.println("Enter 3 numbers: ");
    // num[0] = sc.nextDouble();
    // num[1] = sc.nextDouble();
    // num[2] = sc.nextDouble();

    // double sum = num[0] + num[1] + num[2];
    // System.out.println("The sum is: " + sum);

    // Problem 2
    // Use the scanner to get user input and give it to the method
    System.out.println("Enter a positive number: ");
    int N = sc.nextInt();
    int[] output = sumsOfNums(N);
        
    for (int i = 0; i < output.length; i++) 
    {
      System.out.print(output[i] + " ");
    }

    public static int[] sumsOfNums(int N) {
        int sum = 0;
        int[] output = new int[N];
        for (int i = 0; i < N; i++) {
            sum += i;
            output[i] = sum;
        }
        return output;
    }
}

