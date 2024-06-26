package recursion;

public class Checksort {
	static int arraySortedOrNot(int arr[], int n)
	{
		if (n == 1 || n == 0)
			return 1;
		if (arr[n - 1] < arr[n - 2])
			return 0;
		return arraySortedOrNot(arr, n - 1);
	}
	public static void main(String[] args)
	{
		int arr[] = { 20, 23, 23, 45, 78, 88 };
		int n = arr.length;
		if (arraySortedOrNot(arr, n) != 0)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}

