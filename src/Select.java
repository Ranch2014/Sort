/**
 * Created by jaxer on 6/15/16.
 * 排序算法:选择排序
 */
public class Select {
    public static void main(String[] args) {
        int[] a = {3, 1, 19, 21, 9, 4, 12, 0, 6, 5};
        System.out.print("排序之前:");
        for (int i=0; i<a.length; i++) {
            System.out.print(a[i] + " ");
        }

        selectSort(a);

        System.out.println();
        System.out.print("排序之后:");
        for (int i=0; i<a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    /**
     * 简单选择排序法
     * @param a 需要进行排序的数组
     */
    public static void selectSort(int[] a) {
        for (int i=0; i<a.length; i++) {
            int min = a[i]; //最小数
            int idx = i; //最小数的索引
            for (int j=i+1; j<a.length; j++) {
                if (a[j] < min) {
                    min = a[j];
                    idx = j;
                }
            }
            a[idx] = a[i]; //互换
            a[i] = min;
        }
    }
}
