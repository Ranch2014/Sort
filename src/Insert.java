/**
 * Created by jaxer on 6/16/16.
 * 插入排序
 * 动画演示: http://zh.visualgo.net/sorting
 */
public class Insert {

    public static void main(String[] args) {
        int[] a = {3, 1, 19, 21, 9, 4, 12, 0, 6, 5};
        System.out.print("排序之前:");
        for (int i=0; i<a.length; i++) {
            System.out.print(a[i] + " ");
        }

        directInsert(a); //直接插入排序
        binaryInsert(a); //二分插入排序

        System.out.println();
        System.out.print("排序之后:");
        for (int i=0; i<a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    /**
     * 二分插入排序(折半排序法)
     * @param a 要进行排序的数组
     */
    public static void binaryInsert(int[] a) {
        int i, j, low, mid, high, temp;
        for (i=1; i<a.length; i++) { //第一个元素看做已经排好
            temp = a[i]; //要插入的元素(即,已经排好序的下一位)
            low = 0; //最低位置
            high = i-1; //最高位置
            while (low <= high) { //确定要插入元素的位置
                mid = (low + high) / 2;
                if (temp < a[mid]) { //判断要插入元素和中间元素的大小
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            for (j=i-1; j>high; j--) { //high~i-1 的所有元素后移一位
                a[j+1] = a[j];
            }
            a[high+1] = temp; //插入元素,位置为 low 或 high+1
        }
    }

    /**
     * 直接插入排序
     * @param a 要进行排序的数组
     */
    public static void directInsert(int[] a) {
        for (int i = 1; i < a.length; i ++) { //第一个元素看做已经排好
            if (a[i] < a[i-1]) {
                int temp = a[i]; //要插入的元素
                int j = i; //要插入元素的位置
                while (j > 0 && temp < a[j-1]) { //将要插入的元素依次和前面的元素比较,若大于,将前面的元素后移一位
                    a[j] = a[j-1];
                    j --;
                }
                a[j] = temp; //PS: 上面的 j 已经减 1 了
            }
        }
    }
}
