
#常见排序算法

- 选择排序

首先，找到数组中最小的元素，将它和数组的第一个元素互换（如果第一个元素就是最小元素它就自己交换）。  
其次，在剩下的元素中找到最小的元素，将它与数组的第二个元素互换。  
以此类推。  

两个特点:  
1. 运行时间和输入无关.  
2. 数据移动是最少的.  

参考链接:[http://www.cnblogs.com/kkun/archive/2011/11/23/2260281.html](http://www.cnblogs.com/kkun/archive/2011/11/23/2260281.html)


- 插入排序

算法描述:

1. 从第一个元素开始,该元素可以认为已经被排序
2. 取出下一个元素,在已经排序的元素序列中从后向前扫描
3. 如果该元素(已排序)大于新元素,将该元素后移到下一位置
4. 重复步骤3,直到找到已排序的元素小于或等于新元素的位置
5. 将新元素插入到该位置后
6. 重复步骤2~5

参考链接:[https://zh.wikipedia.org/wiki/%E6%8F%92%E5%85%A5%E6%8E%92%E5%BA%8F](https://zh.wikipedia.org/wiki/%E6%8F%92%E5%85%A5%E6%8E%92%E5%BA%8F)

插入排序所需的时间取决于输入中元素的初始顺序。

倒置指的是数组中的两个顺序颠倒的元素。如果数组中倒置的数量小于数组大小的某个倍数，称这个数组是部分有序的。

几种典型的部分有序数组：  

1. 数组中每个元素离它的最终位置都不远；
2. 一个有序的大数组接一个小数组；
3. 数组中只有几个元素的位置不正确。

插入排序对于部分有序的数组十分高效,也很适合小规模数组.

示意图1:  

![示意图1](https://github.com/Ranch2014/Sort/blob/master/imgs/insert.png)

示意图2: 

![示意图2](https://github.com/Ranch2014/Sort/blob/master/imgs/insert2.png)


- 二分插入排序

二分插入排序,即先用二分查找算法找出新元素要插入的位置,然后将该位置以后的所有元素后移一位,将新元素插入到该位置.

示意图:

![二分插入排序](https://github.com/Ranch2014/Sort/blob/master/imgs/BinaryInsert.jpg)

参考链接:[http://blog.csdn.net/sinianzain/article/details/8071416](http://blog.csdn.net/sinianzain/article/details/8071416)

- 希尔排序

希尔排序的思想是使数组中任意间隔为 h 的元素都是有序的。其实质就是分组插入排序，该方法又称缩小增量排序，因DL.Shell于1959年提出而得名。

参考链接:  
[http://blog.csdn.net/morewindows/article/details/6668714](http://blog.csdn.net/morewindows/article/details/6668714)  
[http://www.cnblogs.com/jingmoxukong/p/4303279.html](http://www.cnblogs.com/jingmoxukong/p/4303279.html)

上面希尔排序的步长选择都是从n/2开始，每次再减半，直到最后为1。
其实也可以有另外的更高效的步长选择，关于步长的问题,可参考维基百科:    
[https://zh.wikipedia.org/wiki/%E5%B8%8C%E5%B0%94%E6%8E%92%E5%BA%8F#.E6.AD.A5.E9.95.BF.E5.BA.8F.E5.88.97](https://zh.wikipedia.org/wiki/%E5%B8%8C%E5%B0%94%E6%8E%92%E5%BA%8F#.E6.AD.A5.E9.95.BF.E5.BA.8F.E5.88.97)

- 冒泡排序

示意图:  

![冒泡排序](https://github.com/Ranch2014/Sort/blob/master/imgs/bubbleSort.png)

参考链接:[http://blog.csdn.net/pzhtpf/article/details/7560294](http://blog.csdn.net/pzhtpf/article/details/7560294)

- 其他链接

各种排序算法:[http://www.cnblogs.com/liuling/p/2013-7-24-01.html](http://www.cnblogs.com/liuling/p/2013-7-24-01.html)

常用算法稳定性分析:[http://www.cnblogs.com/Braveliu/archive/2013/01/15/2861201.html](http://www.cnblogs.com/Braveliu/archive/2013/01/15/2861201.html)

动画演示网址:[http://zh.visualgo.net/](http://zh.visualgo.net/)