import java.util.Arrays;
public class Selection_Sort 
{
    static void Selection(int arr[])
    {
        System.out.print("Origninal Array: ");
        getArray(arr);
        
        int n=arr.length;
        int min=-1;
        
        for(int i=0; i<n;i++)
        {
            min = i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[min]>arr[j])
                {
                    min=j;
                }
            }
            if(min!=i)
            {
                int temp=arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
            }
        }
        System.out.print("Sorted Array: ");
        getArray(arr);
    }
    public static void getArray(int [] arr)  
	{  
            System.out.print("[");
		for (int i=0;i<arr.length;i++)
                {
                    System.out.print(arr[i]+" , ");
                }
            System.out.println("]\n\n");
		
	}  
    public static void main(String args[])
    {
        int [] arr={9,7,8,3,5,0,1,2,10,4};
        Selection(arr);
    }
    
}
