import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Paging {
    static int doPaging(int m, int n){
        int num = 0;
        if(m%n == 0){
            num=m/n;
        }else{
            num=(m/n)+1;
        }
        return num;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String mArray = bufferedReader.readLine();
        String nArray = bufferedReader.readLine();

        int mInt = Integer.parseInt(mArray);
        int nInt = Integer.parseInt(nArray);

        System.out.println(doPaging(mInt, nInt));
    }
}
