abstract class Predator extends Animal1 {
    abstract String getFood();

    void printFood(){
        System.out.println("my food is "+getFood());
    }
}

interface Barkable {
    void bark();
}

/*interface BarkablePredator extends Predator, Barkable {

}*/

class Animal1 {
    String name;

    void setName(String name) {
        this.name=name;
    }
}

class Lion extends Predator implements Barkable{
    public String getFood(){
      return "apple";
    }

    public void bark(){
        System.out.println("으르렁");
    }
}

class Tiger extends Predator implements Barkable{
    public String getFood(){
        return "banana";
    }

    public void bark(){
        System.out.println("어흥");
    }
}

class ZooKeeper {
    void feed(Predator predator){
        System.out.println("feed "+predator.getFood());
    }
}

class Bouncer {
    void barkAnimal(Barkable animal){//어차피 barkable한 animal이 인수로 들어오기 때문에 if 필요없다
        animal.bark();
    }
}

public class Interface {
    public static void main(String[] args){
        Lion lion = new Lion();
        Tiger tiger = new Tiger();
        ZooKeeper zookeeper = new ZooKeeper();
        zookeeper.feed(lion);
        zookeeper.feed(tiger);

        Bouncer bouncer = new Bouncer();
        bouncer.barkAnimal(lion);
        bouncer.barkAnimal(tiger);
    }
}
