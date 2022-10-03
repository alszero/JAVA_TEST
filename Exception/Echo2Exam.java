package Exception;

import java.io.IOException;
import java.io.InputStream;

//public class Echo2Exam {
//    public static void main(String[] args) {
//        InputStream is = System.in;
//        while(true){
//            int i = is.read();
//            if (i==-1) break;
//            System.out.println((char)i);
//        }
//    }
//}

//에러메세지
//D:\JAVA_TEST\Exception\Echo2Exam.java:9:28
//java: unreported exception java.io.IOException; must be caught or declared to be thrown

// 위에 내용 수정

public class Echo2Exam {
    public static void main(String[] args) {
        InputStream is = System.in;
        try {
            while (true) {
                int i = is.read();
                if (i == -1) break;
                System.out.print((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
