import algo.BubbleSort;
import algo.InsertionSort;
import algo.SelectSort;
import algo.ShellSort;
import algo.TwoSelectSort;

public class Start {
	public static void main(String[] args) {
		System.out.println("我自己改改看!!!");

		int[] test = { 10, 9, 8, 7, 6, 4, 3, 2, 1, 5 };
		// BubbleSort.doSort(test);
		// SelectSort.doSort(test);
		// InsertionSort.doSort(test);
//		ShellSort.doSort(test);
		TwoSelectSort.doSort(test);
		printArray(test);
	}

	public static void printArray(int[] a) {
		int len = a.length;
		for (int i = 0; i < len; i++) {
			System.out.print(a[i] + ",");
		}
	}
}
