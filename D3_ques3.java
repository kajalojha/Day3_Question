package Avi_Training;

import java.util.Scanner;

public class D3_ques3
{
    public static void main(String[] args) {
        int arr[] = {1,2,1,1};
        int i ,j;
        for(i = 0 ; i<arr.length ;i++)// for i
        {
            int c = 0;
            for(j = 0 ;j<arr.length ;j++)// for j
            {
                if(arr[i] == arr[j] ) { // agar arr of i ki value arr of j ke
                    // brabar hoga than count +1 krdo
                    c++;
                }

            }
            if(c==1) {
                System.out.println(arr[i]);
            }
        }

    }
}
