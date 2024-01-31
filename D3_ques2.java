package Avi_Training;
import java.util.Scanner;
public class D3_ques2
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("enter the element of array");
        for(int i =0;i<= arr.length -1; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the position");
        int pos = sc.nextInt();
        System.out.println(" the reverse of sub array");
        int left = pos+1;
        int right = arr.length-1;
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.println("new array is : ");
                for(int i = 0; i<size ;i++){
                    System.out.println(arr[i]);

                }
        }

    }


