package algo;
/**
 * ��������
 * @zhou
 *
 */
public class InsertionSort {
	
	public static void doSort(int[] a) {
		if (a == null || a.length < 2) {
			return;
		}
		for (int i = 1; i < a.length; i++) {
			for (int j = i; j > 0; j--) {  // ����ؼ�����ǰ���a[j]��һ��λ�ò��ȥ
				if (a[j] < a[j - 1]) {  //�������С��ǰ���������������������
					// TODO:
					int temp = a[j];
					a[j] = a[j - 1];
					a[j - 1] = temp;
				} else {
					// �����������ù�
					break;
				}
			}
		}
	}
}
