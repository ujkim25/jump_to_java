interface Predator {

}

class Animal1 {
    String name;

    void setName(String name) {
        this.name=name;
    }
}

class Lion extends Animal1 implements Predator{

}

class Tiger extends Animal1 implements Predator{

}

class ZooKeeper {
    void feed(Tiger tiger){
        System.out.println("feed apple");
    }
    void feed(Lion lion){
        System.out.println("feed banana");
    }
}

public class Interface {
    public static void main(String[] args){
        Lion lion = new Lion();
        Tiger tiger = new Tiger();
        ZooKeeper zookeeper = new ZooKeeper();
        zookeeper.feed(lion);
        zookeeper.feed(tiger);
    }
}
