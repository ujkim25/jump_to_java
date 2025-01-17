class Animals {
    String name;

    void setName(String name){
        this.name = name;
    }
}

class Dog extends Animals {
    void sleep(){
        System.out.println("Sleep");
    }
}

class HouseDog extends Dog {
    HouseDog(String name){
        this.setName(name);
    }
    void sleep(){
        System.out.println("Sleep zzz");
    }
    void sleep(int a){
        System.out.println(this.name+"Sleep"+a+"hours");
    }
}

public class Inherit {
    public static void main(String[] args){
        HouseDog housedog = new HouseDog("ujin");
        System.out.println(housedog.name);
        housedog.sleep();
        housedog.sleep(5);
    }
}
