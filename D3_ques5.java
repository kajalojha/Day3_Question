package Avi_Training;
import java.util.*;
public class D3_ques5
{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the num");
    int n = sc.nextInt();
    System.out.println("enter the query");
    int q = sc.nextInt();
    int sum = 0 , pro = 1;
    for(int i = 1 ;i<=n ;i++)
    {
        if(q == 1)
        {
            sum = sum+i;
        }
        else if(q==2){
            pro = pro*i;
        }
    }
        System.out.println(sum + " " + pro);

    }
}
