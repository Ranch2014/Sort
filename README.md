
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

示意图:

![二分插入排序](https://github.com/Ranch2014/Sort/blob/master/imgs/BinaryInsert.jpg)

参考链接:[http://blog.csdn.net/sinianzain/article/details/8071416](http://blog.csdn.net/sinianzain/article/details/8071416)

- 冒泡排序

示意图:  

![冒泡排序](https://github.com/Ranch2014/Sort/blob/master/imgs/bubbleSort.png)

参考链接:[http://blog.csdn.net/pzhtpf/article/details/7560294](http://blog.csdn.net/pzhtpf/article/details/7560294)

- 其他链接

各种排序算法:[http://www.cnblogs.com/liuling/p/2013-7-24-01.html](http://www.cnblogs.com/liuling/p/2013-7-24-01.html)

常用算法稳定性分析:[http://www.cnblogs.com/Braveliu/archive/2013/01/15/2861201.html](http://www.cnblogs.com/Braveliu/archive/2013/01/15/2861201.html)

动画演示网址:[http://zh.visualgo.net/](http://zh.visualgo.net/)