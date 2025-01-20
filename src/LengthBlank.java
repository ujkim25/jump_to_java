import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LengthBlank {
    static int checkBlank(String str){
        int num=0;

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' '){
                num++;
            }
        }
        return num;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String str = bufferedReader.readLine();
        System.out.println(checkBlank(str));
    }
}
