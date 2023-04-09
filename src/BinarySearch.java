import java.lang.*;
import java.util.*;
public class BinarySearch
{
    static int search(int[] arr , int l , int r , int key)
    {
        if(r >= l)
        {
            int mid = l + (r - l) / 2;
            //condition for element found at mid
            if(arr[mid] == key) return mid;
            //condition if mid element is lesser than key
            else if(arr[mid] < key) return search(arr , mid+1 , r , key);
            //condition if mid element is greater than key
            else return search(arr , l , mid-1 , key);
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
        int res = search(arr , 0 , n-1 , key);
        if(res == -1)
        {
            System.out.println("Key not found");
        }
        else
        {
            System.out.println(key+" found at "+res+"rd index");
        }
    }
}
