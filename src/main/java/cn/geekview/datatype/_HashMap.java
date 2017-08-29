package cn.geekview.datatype;

import cn.geekview.domain.Person;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class _HashMap {
    @Test
    public void test() {
        Map<String,Person> map = new HashMap<String, Person>();
        System.out.println(hash("china"));
    }

    static int hash(Object key) {
        int h;
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }
}
