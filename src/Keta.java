import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Keta {
    static int getKeta(int num){
      int keta=0;

      while(true){
          if(num==0) break;
          num=num/10;
          keta=keta+1;
      }
      return keta;
    }; // 1st method

    static int getKetaString(String str){
        return str.length();
    } // 2nd easier method

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String numString = bufferedReader.readLine();
        System.out.println(getKetaString(numString));
        int numInt = Integer.parseInt(numString);

        System.out.println(getKeta(numInt));
    }
}
