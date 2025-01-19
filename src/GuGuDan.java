import java.util.List;

public class GuGuDan {
    int[] guGu(int num){ //gugu 메서드는 static 메서드로 작성했다. 만약 일반 메서드로 작성한다면 Sample 클래스의 객체를 만들어 사용해야 한다.
        int[] a = new int[9];

        for(int i=1;i<10;i++){
            a[i-1]=i*num;
        }
        return a;
    }

    public static void main(String[] args) {
        GuGuDan guGuDan = new GuGuDan();
        int[] result = guGuDan.guGu(2);

        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }
    }
}
