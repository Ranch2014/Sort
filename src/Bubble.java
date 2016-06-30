/**
 * Created by jaxer on 6/15/16.
 * 排序算法:冒泡排序
 */
public class Bubble {
    public static void main(String[] args) {
        int[] a = {3, 1, 19, 21, 9, 4, 12, 0, 6, 5};
        System.out.print("排序之前:");
        for (int i=0; i<a.length; i++) {
            System.out.print(a[i] + " ");
        }

        bubbleSort(a);

        System.out.println();
        System.out.print("排序之后:");
        for (int i=0; i<a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    /**
     * 冒泡排序法
     * @param a 要进行排序的数组
     */
    static void bubbleSort(int[] a) {
        int temp;
        for (int i=0; i<a.length-1; i++) { //一趟比较(若由n个数,需要比较n-1趟)
            for (int j=0; j<a.length-1-i; j++) { //每趟需要比较的次数递减
                if (a[j] > a[j+1]) { //大数沉底
                    temp = a[j]; //互换
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }
}
