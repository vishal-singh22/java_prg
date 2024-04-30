package recursion;

public class MAX_MIN {
	public static int findMin(int A[], int n) 
	{ 
	if(n == 1) 
		return A[0]; 
		
		return Math.min(A[n-1], findMin(A, n-1)); 
	} 
    public static int findMax(int A[],int n) {
        if(n==1)
         return A[0];

         return Math.max(A[n-1],findMax(A, n-1));  
    }
    static void printmax_min(int[] A,int n){
        System.out.println("MIN value is :"+findMin(A,n));
        System.out.println("MAX value is :"+findMax(A,n));
    }
	public static void main(String args[]) 
	{ 
		int A[] = {1, 4, 45, 6, -50, 10, 2}; 
		int n = A.length; 
		printmax_min(A, n); 
	} 
} 