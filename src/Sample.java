import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;

public class Sample {
    public static void main(String[] args) {
        ArrayList<Integer> pitches = new ArrayList<>();
        pitches.add(1);
        pitches.add(2);
        System.out.println(pitches);

        String[] pitch={"1,2,3"};
        Integer[] pitch2={1,2,3,4};

        ArrayList<String> pitches2 = new ArrayList<>(Arrays.asList(pitch));
        ArrayList<Integer> pitches3 = new ArrayList<>(Arrays.asList(pitch2));
        System.out.println(pitches2);
        System.out.println(pitches3);

        pitches3.sort(Comparator.reverseOrder());
        System.out.println(pitches3);

        HashMap<String, String> map = new HashMap<>();
        map.put("Kim","Name");
        map.put("Myeongjin","Kim");
        System.out.println(map);

        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3,4,5,6));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4,5,6,7,8,9));
        HashSet<Integer> s1temp = new HashSet<>(s1);
        HashSet<Integer> s1temp2 = new HashSet<>(s1);
        HashSet<Integer> s1temp3 = new HashSet<>(s1);
        System.out.println(s1temp);
        s1temp.retainAll(s2);
        System.out.println(s1temp);
        s1temp2.addAll(s2);
        System.out.println(s1temp2);
        s1temp3.removeAll(s2);
        System.out.println(s1temp3);

        s2.addAll(Arrays.asList(10,11,12));
        System.out.println(s2);
        s2.addAll(Arrays.asList(13,14,15));
        System.out.println(s2);

        String str = "123";
        int str1 = Integer.parseInt(str);
        System.out.println(str1);

        int n = 123;
        String n1 = "" + n;
        System.out.println(n1);
        String n2 = String.valueOf(n);
        System.out.println(n2);
        String n3 = Integer.toString(n);
        System.out.println(n3);

        double d = 123.456;
        int inte = (int) d;
        System.out.println(inte);

        String[] numbers = {"one", "two", "three"};
        for(int i=0;i< numbers.length;i++){
            System.out.println(numbers[i]);
        }
        for(String number: numbers){
            System.out.println(number);
        }

        ArrayList<String> numbersArrayList = new ArrayList<>(Arrays.asList("one", "two"));
        for(String number: numbersArrayList){
            System.out.print(number+" ");
        }
        System.out.println("");

        Animal cat = new Animal();
        System.out.println(cat.name);
        cat.setName("Tom");
        System.out.println(cat.name);

        Animal dog = new Animal();
        dog.setName("Happy");
        System.out.println(dog.name);

        Animal sumNum = new Animal();
        sumNum.sumNum(1,3);
        System.out.println(sumNum.sumNum(1,3));

        int a=2;
        int b=4;
        Sample sum = new Sample();
        int c=sum.sum(a,b);
        System.out.println(c);
    }

    int sum(int a, int b){
        return a+b;
    }
}

class Animal {
    String name;

    public void setName(String name){
        this.name=name;
    }

    public Integer sumNum(Integer a, Integer b){
        return a+b;
    }
}