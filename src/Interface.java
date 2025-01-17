interface Predator {
    String getFood();

    default void printFood(){
        System.out.println("my food is "+getFood());
    }
}

class Animal1 {
    String name;

    void setName(String name) {
        this.name=name;
    }
}

class Lion extends Animal1 implements Predator{
    public String getFood(){
      return "apple";
    }
}

class Tiger extends Animal1 implements Predator{
    public String getFood(){
        return "banana";
    }
}

class ZooKeeper {
    void feed(Predator predator){
        System.out.println("feed "+predator.getFood());
        predator.printFood();
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
