package cn.geekview.datatype;

import cn.geekview.domain.Person;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

public class _LinkedList {
    @Test
    public void test() {
        int a = 8;
        int b = 2;
        System.out.println(a >> b); //a >> b 相当于 a 除以 2的b次方
        System.out.println(a << b); //a << b 相当于 a 乘以 2的b次方
    }

    @Test
    public void test2() {
        List list = new LinkedList();
        list.add(new Person("柳岩"));
        list.add(new Person("冬冬"));
        list.add(new Person("艾希"));
        System.out.println(list);
        System.out.println(list.get(1));
    }

}
