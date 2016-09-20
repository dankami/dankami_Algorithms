package algo;
/**
 * 冒泡排序
 * @author zhou
 *
 */
public class BubbleSort {
	public static void doSort(int[] a) {
		int temp = 0;
		for (int i = a.length - 1; i > 0; --i) { //每冒泡一次，排除最后一个数字的排序
			for (int j = 0; j < i; ++j) {
				if (a[j + 1] < a[j]) {  // 如果后面的数小于前面的就交换，最后小数在前
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
	}
}
