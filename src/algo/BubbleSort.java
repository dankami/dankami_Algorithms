package algo;
/**
 * ð������
 * @author zhou
 *
 */
public class BubbleSort {
	public static void doSort(int[] a) {
		int temp = 0;
		for (int i = a.length - 1; i > 0; --i) { //ÿð��һ�Σ��ų����һ�����ֵ�����
			for (int j = 0; j < i; ++j) {
				if (a[j + 1] < a[j]) {  // ����������С��ǰ��ľͽ��������С����ǰ
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
	}
}
