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
		//System.out.println(arr);
	}

}
