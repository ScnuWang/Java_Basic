package cn.geekview.datatype;

import org.junit.Test;

public class _Integer {

    @Test
    public void test2(){
        System.out.println(Integer.MAX_VALUE);//2147483647 = 2^(32-1)
        System.out.println(Integer.MIN_VALUE);//-2147483648=-2^(32-1)
    }


    @Test
    public void test1(){
        /**
         * Integer有缓存机制：默认缓存-128到127之间的值，
         * 我们在比较两个Integer对象的值时，无论是怎么声明的，都一定要使用equals去比较，不能用==
         * 答案：https://zhuanlan.zhihu.com/p/27562748
         *
         */
        Integer i1 = 100;
        Integer i2 = 100;
        int i = i1;
        System.out.println(i1==i2);//true

        Integer i3 = 300;
        Integer i4 = 300;
        System.out.println(i3==i4);//false
        System.out.println(i3.equals(i4));//true

        Integer i5 = new Integer(100);
        Integer i6 = new Integer(100);
        System.out.println(i5==i6);//false
        System.out.println(i5.equals(i6));//true
    }
}
