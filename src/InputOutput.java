import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Scanner;

/*InputStream: byte를 읽는다.
InputStreamReader: character(문자)를 읽는다.
BufferedReader: String(문자열)을 읽는다.*/

public class InputOutput {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in); //InputStreamReader는 객체를 생성할 때 생성자의 입력으로 InputStream 객체(여기서는 in)가 필요하다.
        BufferedReader br = new BufferedReader(reader); //BufferedReader는 객체를 생성할 때 생성자의 입력으로 InputStreamReader의 객체(여기서는 reader)가 필요하다.
        Scanner scanner = new Scanner(System.in); //생성자의 입력으로 System.in 객체가 필요한데, 이는 콘솔 입력인 InputStream이 필요하다는 의미이다.

        byte[] a = new byte[3];
        char[] b = new char[3];

        //in.read(a);
        //reader.read(b);
        //String c = br.readLine();

        //System.out.println(a[0]);
        //System.out.println(a[1]);
        //System.out.println(a[2]);

        System.out.println(scanner.next());
    }
}
