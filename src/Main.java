import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = s1.nextInt();
        System.out.println("-------");
        int[] arr = new int[num];
        int[] arr2 = userInput(arr);
        Arrays.sort(arr2);
        for (int number : arr2) System.out.print(number + " ");
    }
    public static int[] userInput(int[] arr){
        Scanner s2 = new Scanner(System.in);
        for(int i = 0; i < arr.length; i++) arr[i] = s2.nextInt();
        return arr;
    }
}
