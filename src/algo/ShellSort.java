package algo;

/**
 * 希尔算法
 * 
 * @author xuan
 *
 */
public class ShellSort {

	public static void doSort(int[] a) {
		// TODO Auto-generated method stub
		int d = 5;
		while (true) {
			for (int i = 0; i < d; i++) {
				for (int j = i; j + d < a.length; j += d) {
					int temp;
					if (a[j] > a[j + d]) {
						temp = a[j];
						a[j] = a[j + d];
						a[j + d] = temp;
					}
				}
			}

			if (d == 1) {
				break;
			}
			d--;
		}
	}

}
