import java.lang.*;
import java.util.*;
public class LinearSearch
{
    static int search(int[] arr , int n , int key)
    {
        for(int i=0 ; i<n ; i++)
        {
            if(arr[i] == key)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++)
        {
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        int res = search(arr , n , key);
        if(res == -1)
        {
            System.out.println("Key not found");
        }
        else
        {
            System.out.println(key + " found at "+res+"rd index");
        }
    }
}
