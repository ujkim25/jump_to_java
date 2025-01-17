/*interface Predator {
    String getFood();
}*/

class Animal1 {
    String name;

    void setName(String name) {
        this.name=name;
    }

    String getFood(){
        return "";
    }
}

class Lion extends Animal1 /*implements Predator*/{
    String getFood(){
      return "apple";
    }
}

class Tiger extends Animal1 /*implements Predator*/{
    String getFood(){
        return "banana";
    }
}

class ZooKeeper {
    void feed(Animal1 animal1){
        System.out.println("feed "+animal1.getFood());
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
