/**
 * Created by jaxer on 7/21/16.
 * 排序算法:希尔排序
 */
public class Shell {
    public static void main(String[] args) {
        int[] a = {3, 1, 19, 21, 9, 4, 12, 0, 6, 5};
        System.out.print("排序之前:");
        for (int i=0; i<a.length; i++) {
            System.out.print(a[i] + " ");
        }

        shellSort(a);

        System.out.println();
        System.out.print("排序之后:");
        for (int i=0; i<a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    /**
     * 希尔排序算法(插入排序的加强版)
     * @param a 要进行排序的数组
     */
    public static void shellSort(int[] a) {
        int gap = a.length / 2; //5
        while (gap >= 1) {
            //把距离为 gap 的元素编成一个组,扫描所有组
            for (int i=gap; i<a.length; i++) {
                int temp = a[i];
                int j;

                //对距离为 gap 的元素排序
                for (j=i-gap; j>=0 && temp<a[j]; j=j-gap) {
                    a[j+gap] = a[j];
                }
                a[j+gap] = temp; //注意前面的循环已经减去了 gap
            }
            gap /= 2;
        }
    }
}
