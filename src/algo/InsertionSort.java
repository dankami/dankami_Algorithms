package algo;
/**
 * 插入排序
 * @zhou
 *
 */
public class InsertionSort {
	
	public static void doSort(int[] a) {
		if (a == null || a.length < 2) {
			return;
		}
		for (int i = 1; i < a.length; i++) {
			for (int j = i; j > 0; j--) {  // 这里关键是在前面给a[j]找一个位置插进去
				if (a[j] < a[j - 1]) {  //后面的数小于前面的数交换，最终是升序
					// TODO:
					int temp = a[j];
					a[j] = a[j - 1];
					a[j - 1] = temp;
				} else {
					// 接下来是无用功
					break;
				}
			}
		}
	}
}
