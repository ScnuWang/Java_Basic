package cn.geekview.datatype;

import org.junit.Test;

public class _Array {
    @Test
    public void test(){
        char[] ch1 = {'a','b','c'};
        char[] ch2 = ch1;//这样直接赋值相当于直接将ch1的引用地址赋值给ch2
        ch1[1] = 'x';
        System.out.println(ch1==ch2);//true
    }
}
