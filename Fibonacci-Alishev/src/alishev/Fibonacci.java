// Алгоритмы и Структуры Данных (playlist) - Alishev
// https://www.youtube.com/watch?v=2kSx7wMAhcc&list=PLAma_mKffTOT_qpTFv4KdD9DhOAUd5Rqy&index=1
package alishev;

public class Fibonacci {

	public static void main(String[] args) {
// for calculate number Fibonacci on place 100 we need 50000 year with recursion
		System.out.println(fibNaive(10));
		System.out.println(fibEffective(100));
		
	}
	
	// recursion - 50000 year for 100
	private static long fibNaive(int n) {
		if(n <= 1) {
			return n;			
		}
		return fibNaive(n-1) + fibNaive(n-2);
	}
	
	// loop - less second for 100
	private static long fibEffective(int n) {
		long[] arr = new long[n+1];
		arr[0] = 0;
		arr[1] = 1;
		for(int i=2; i <= n; i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}
		return arr[n];
	}
}
