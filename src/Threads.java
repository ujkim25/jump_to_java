import java.util.ArrayList;

public class Threads /*extends Thread*/ implements Runnable { // Thread를 상속하면 다른 클래스를 상속할 수 없기 때문에, Runnable 인터페이스를 사용한다
    int i;

    public Threads(int i){
        this.i = i;
    }

    public void run(){ //Thread 를 상속하면 run 메서드를 구현해야 한다.
        System.out.println(this.i+"Thread run");
        try{
            Thread.sleep(1000); //시작과 종료 사이에 1초의 간격이 생기도록
        } catch (Exception e) {
        }
        System.out.println(this.i+"Thread end");
    }

    public static void main(String[] args) {
        ArrayList<Thread> threadArray = new ArrayList<>();

        for (int i=0;i<11;i++){
            Thread t = new Thread(new Threads(i));
            t.start(); //start 메서드를 실행하면 run 메서드가 수행된다.
            threadArray.add(t);
        }

        for (int i=0;i<threadArray.size();i++){
            Thread t = threadArray.get(i);
            try{
                t.join(); //t 쓰레드가 종료할 때까지 기다린다.
            }catch(Exception e){

            }
        }
        System.out.println("Main stop");
    }
}
