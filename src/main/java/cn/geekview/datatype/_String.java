package cn.geekview.datatype;

import org.junit.Test;

/**
 * String底层是char数组
 */
public class _String {
    @Test
    public void test(){
        /**
         *
         * 当==两边是基本数据类型时，==于比较的是两边的两个值是否相等，当==两边是引用类型时比较的是两个内存地址
         *
         *
         * 1、我们在比较两个String对象内容时，无论是怎么声明的，都一定要使用equals去比较，不能用==;
         * 2、在JVM中，当代码执行到String s1 = "100" 时，会先看常量池里有没有字符串刚好是“100”这个对象，
         *      如果没有，在常量池里创建初始化该对象，并把引用指向它;
         * 3、字符串常量池不是在堆内存中，而是在方法区的常量池中;
         * 4、new关键字，这个关键字呢就是告诉JVM，你直接在堆内存里给我开辟一块新的内存;
         */
        String s1 = "100";
        String s2 = "100";
        System.out.println(s1==s2);//true

        String s3 = new String("100");
        String s4 = new String("100");
        System.out.println(s3==s4);//false
        System.out.println(s3.equals(s4));//true
    }
}
