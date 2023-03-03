
import java.util.*;

public class CollectionTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("JavaScript");


        System.out.println(list.get(3));

        //set : ~로 바꾸기.
        list.set(3, "Js");
        System.out.println(list.get(3));

        System.out.println("사이즈 구하기 : " + list.size());
        //삭제
        list.remove(2);
        System.out.println(list.size());


        Set<String> set = new HashSet<>();
        set.add("Javascript");
        set.add("Python");
        set.add("C++");
        set.add("Javascript"); // 이미 존재하는 엘리먼트는 추가되지 않는다.

        System.out.println(set); // [Javascript, C++, Python]

        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 1);
        map.put("strawberry", 2);
        map.put("banana", 3);

        //key를 통해 value를 확인받음.
        Integer value = map.get("strawberry");
        System.out.println(value);

        //key의 여부를 확인받음.
        boolean hasGrape = map.containsKey("grape"); // false
        System.out.println(hasGrape);

        //전체의 key를 보여줌.
        Set<String> keysView = map.keySet();
        System.out.println(keysView);

        //전체의 Values를 보여줌.
        Collection<Integer> values = map.values();
        System.out.println(values);

        String s = "example";
        int hash = s.hashCode();

        System.out.println(hash);


    }
}
