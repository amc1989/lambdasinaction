package lamda.common;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * Created by zhulei on 2017/6/24.
 */
public class test {


    public static  void main(String[] args){
        List<person> list = new ArrayList<>();
        person person = new person();
        person.setAge(1);
        person.setName("a");
        person person1 = new person();
        person1.setName("b");
        person1.setAge(2);

        list.add(person);
        list.add(person1);


        List<String> list1 = new ArrayList<String>(){{
            add("tom");
            add("mark");
            add("telufsiji");

        }};
        List<Integer> stringLength = getStringLength(list1, Length::getLength);
        stringLength.forEach(len-> System.err.println(len));
    }

    static List<Integer> getStringLength(List<String> strings, Function<String, Integer> function) {
        List<Integer> list = new ArrayList<>();
        for(String str:strings){
            list.add(function.apply(str));


        }
        return list;
    }

   static class Length{

     static Integer getLength(String s) {
            return s.length();
        }
    }
  static   class person{
        private int age;
        private String name;

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
