package Avi_Training;
import java.util.Scanner;
public class D3_qus1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int sum = 0;
        System.out.println("enter the element of array");
        for(int i = 0 ;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("element of array");
        for(int i = 0 ;i<arr.length ;i++){
            sum = sum+arr[i];

        }
        System.out.println(sum);
    }
}
