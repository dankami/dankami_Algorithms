package algo;
/**
 * ѡ������
 * @author zhou
 *
 */

public class SelectSort {

	public static void doSort(int[] a) {
		if (a == null || a.length <= 0) {  
		    return;  
		}  
		for (int i = 0; i < a.length; i++) {  
		    int min = i; /* ����ǰ�±궨��Ϊ��Сֵ�±� */  

		    for (int j = i + 1; j < a.length; j++) {  
		        if (a[min] > a[j]) { /* �����С�ڵ�ǰ��Сֵ�Ĺؼ��� */  
		            min = j; /* ���˹ؼ��ֵ��±긳ֵ��min */  
		        }  
		    }  
		    if (i != min) {/* ��min������i��˵���ҵ���Сֵ������ */  
		        int tmp = a[min];  
		        a[min] = a[i];  
		        a[i] = tmp;  
		    }  
		}
	}

}
