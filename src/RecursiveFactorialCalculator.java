
public class RecursiveFactorialCalculator {
	// Recursive method to calculate last entry first
	public static int calculateFactorialTypeA(int n) {
		if(n == 0 || n == 1) {
			return 1;
		}
		return n * calculateFactorialTypeA(n-1);
	}
	// Recursive method to calculate first entry first
	public static int calculateFactorialTypeB(int n, int num) {
		if(n == 0) {
			return num;
		}
			return n * calculateFactorialTypeB(n - 1, n * num);
	}
	// Recursive Method to display array backward last entry to first
	public static void displayArrayLastToFirst(int[] array, int start, int end) {
		if(end >= start) {
			System.out.print(array[end] + " ");
			displayArrayLastToFirst(array, start, end - 1);
		}
	}
	// Recursive Method to display array first entry to first
	public static void displayArrayFirstToLast(int[] array, int start, int end) {
		if(start <= end) {
			System.out.print(array[start] + " ");
			displayArrayFirstToLast(array, start + 1, end);			
		}
	}	
	public static void main(String[] args) {
		// Test the factorial calculation
		int n = 5;
		System.out.println("Factorial of " + n + " (Last To First): " + calculateFactorialTypeA(n));
		System.out.println("Factorial of " + n + " (First To Last): " + calculateFactorialTypeB(n, 1));
		// Test the array display backward
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int start = 1;
		int end = 7;		
		System.out.println("Display Array Bakcward(Last entry first) : ");
		displayArrayLastToFirst(array, start, end);		
		System.out.println("\nDisplay Array Backward(First entry first) : ");
		displayArrayFirstToLast(array, start, end);		
	}
}
