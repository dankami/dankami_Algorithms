package algo;
/**
 * 二分法
 * @author zhou
 *
 */
public class TwoSelectSort {
	public static void doSort(int a[]) {
		int len = a.length;
	    
		for (int i = 0; i < len / 2; i++) {
			int min = a[i];
			int max = a[i];
			int minI = i;
			int maxI = i;
			for (int j = i; j < len-i; j++ ){
				if(a[j] < min){
					min = a[j];
					minI = j;
				}
				if(a[j] > max){
					max = a[j];
					maxI = j;
				}
			}
			if (min < a[i]){
				int tmp = a[i];
				a[i] = min;
				a[minI] = tmp;
				if (maxI == i){
					maxI = minI;
				}
			}
			if (max > a[len - i - 1]){
				int tmp = a[len - i - 1];
				a[len - i - 1] = max;
				a[maxI] = tmp;
			}
		}
	}
}
