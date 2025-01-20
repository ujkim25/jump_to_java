import java.util.ArrayList;

public class SumOf3And5 {
    static int doSum(Integer num) {
        //ArrayList<Integer> sum35 = new ArrayList<>();
        int sum35=0;

        for (int i=1;i<num;i++){
            if(i%3==0||i%5==0){
                sum35=sum35+i;
            }
        }
        return sum35;
    }

    public static void main(String[] args) {
        int sum35 = doSum(1000);
        System.out.println(sum35);
    }
}
