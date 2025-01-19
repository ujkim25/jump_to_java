class KimException extends Exception{

}

public class Error {
    public void sayNick(String s) throws KimException{ //메서드 선언부에서 사용되며, 해당 메서드가 처리하지 않은 예외를 호출자에게 전달함을 나타낸다.
        /*if(s.equals("kim")){
            throw new KimException();
        }
        System.out.println(s);*/
        /*try {*/
            if(s.equals("kim")){
                throw new KimException(); //메서드 내에서 예외를 발생시키는 데 사용된다.
            }
            System.out.println(s);
        /*}catch(KimException e){
            System.err.println("KimException이 발생했습니다.");
        }*/
    }

    public static void main(String[] args) {
        Error error = new Error();
        try {
            error.sayNick("kim");
            error.sayNick("ujin");
        } catch (KimException e){
            System.err.println("KimException이 발생했습니다.");
        }

    }
}
