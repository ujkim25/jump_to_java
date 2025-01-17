class Updater {
    void update(Counter counter){
        counter.i++;
    }
}

class Counter {
    int i=0;
}

public class Sample2 {
    public static void main(String[] args){
        Updater updater = new Updater();
        Counter count = new Counter();
        System.out.println("Before"+count.i);
        updater.update(count);
        System.out.println("After"+count.i);
    }
}

