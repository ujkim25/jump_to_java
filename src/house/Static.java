package house;

class Counter {
    static int count = 0; // 값을 공유
    Counter(){
        count++;
        System.out.println(count);
    }

    public static int getCount(){
        return count;
    }
}

class Singleton {
    private static Singleton one;
    private Singleton(){

    }

    public static Singleton singleton(){
        if(one == null){
            one = new Singleton();
        }
        return one;
    }
}

public class Static {
    public static void main(String[] args) {
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();

        System.out.println(Counter.getCount()); //Counter.getCount()와 같이 객체 생성 없이도 클래스를 통해 메서드를 직접 호출할 수 있다.
        //counter1.getCount()는 안 된다

        Singleton singleton1 = Singleton.singleton();
        Singleton singleton2 = Singleton.singleton();
        System.out.println(singleton1 == singleton2);
    }
}
