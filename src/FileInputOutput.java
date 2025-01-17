import java.io.*;

public class FileInputOutput {
    public static void main(String[] args) throws IOException{
        //FileOutputStream fileOutputStream = new FileOutputStream("out.txt");
        //FileWriter fileWriter = new FileWriter("out1.txt");
        PrintWriter printWriter = new PrintWriter("out2.txt");

        /*for(int i=1;i<11;i++){
            String data=i+"번째 줄입니다.\r\n";
            fileOutputStream.write(data.getBytes()); //FileOutputStream에 값을 쓸 때는 byte 단위로 써야 하므로 String을 byte 배열로 바꾸어 주는 getBytes() 메서드를 이용했다.
        }*/
        /*for(int i=1;i<11;i++){
            String data=i+"번째 줄입니다.\r\n";
            fileWriter.write(data); //FileOutputStream 대신에 FileWriter를 이용하면 byte 배열 대신 문자열을 사용할 수 있어 편리하다.
        }*/
        for(int i=1;i<11;i++){
            String data=i+"번째 줄입니다.";
            printWriter.println(data); //\r\n을 덧붙이는 대신 println이라는 메서드를 사용할 수 있다.
        }

        //fileOutputStream.close();
        //fileWriter.close();
        printWriter.close();

        /*FileWriter fileWriter1 = new FileWriter("out1.txt", true);
        for(int i=11;i<21;i++){
            String data=i+"번째 줄입니다.\r\n";
            fileWriter1.write(data);
        }
        fileWriter1.close();*/

        PrintWriter printWriter1 = new PrintWriter(new FileWriter("out2.txt", true));
        //PrintWriter를 사용할 경우에는 생성자의 파라미터로 파일명 대신 추가 모드로 열린 FileWriter의 객체를 전달해야 한다.
        for(int i=11;i<21;i++){
            String data=i+"번째 줄입니다.";
            printWriter1.println(data);
        }
        printWriter1.close();

        byte[] a = new byte[1024];
        FileInputStream fileInputStream = new FileInputStream("out.txt"); //byte 배열을 문자열로 변경하여 출력
        fileInputStream.read(a);
        System.out.println(new String(a));
        fileInputStream.close();

        BufferedReader bufferedReader = new BufferedReader(new FileReader("out1.txt"));
        while(true){
            String line = bufferedReader.readLine();
            if (line==null) break; //BufferedReader의 readLine 메서드는 더 이상 읽을 라인이 없을 경우 null을 리턴한다.
            System.out.println(line);
        }
        bufferedReader.close();
    }
}
