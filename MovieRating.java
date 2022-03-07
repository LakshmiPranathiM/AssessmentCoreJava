package Collections;
import java.util.Scanner; 

public class MovieRating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the constraints:");  
		n= sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the input rating : ");
		
		for(int i=0; i<n; i++)  
		{  
			//reading array elements from the user   
			arr[i]=sc.nextInt();  
		}  
		//System.out.println(arr[2]);
		
		int[] subArr= new int[4];
		int max= 0;
		for (int i=0 ; i<subArr.length;i++) {
			max +=arr[i];
		}
		System.out.println("The maximum sum for any contiguous subarray in " + max);
	}

}
