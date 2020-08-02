import java.util.Arrays;
import java.util.*;
public class Arrayrotation {
    public void  leftrotation(int arr[],int d,int n)
    {
        for(int i=0;i<d;i++)
        {
            leftrotationby(arr,n);
        }
    }
    public void leftrotationby(int arr[],int n)
    {
        int temp=arr[0];
        for(int i=0;i<n-1;i++)
        {
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
    }
     public void print(int arr[],int n)

    {
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args)
    {
        Arrayrotation a=new Arrayrotation();
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of array ");
        int n=sc.nextInt();
        System.out.println("Enter the value for rotation");
        int d = sc.nextInt();
        System.out.println("Enter the array");
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++)
        {
              arr[i]=sc.nextInt();
        }
        a.leftrotation(arr,d,n);
        a.print(arr,n);
    }
}
