import java.util.*;
public class InsertionSort
{
	public static void main(String[] args) {
		int[] arr =  {2,9,5,1,3};
		for(int i=1;i<arr.length;i++){ 
		    int val=arr[i];
		    int j=i-1;
		    while(j>=0&&arr[j]>val){
		        arr[j+1]=arr[j];
		        j--;
		    }
		    arr[j+1]=val;
		}
		System.out.println(Arrays.toString(arr));
	}
}