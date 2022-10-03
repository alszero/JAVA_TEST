package Exception;
import java.io.FileReader;
import java.io.FileWriter;

public class FlleExam {
    public static void main(String[] args) {
        try{
            FileReader fr = new FileReader("datar.txt");
            FileWriter fw = new FileWriter("dataw.txt");
            int c;
            while((c= fr.read()) != -1){
                fw.write(c);
            }
        }catch (Exception e){   // IOException과 FileNotFoundException을 모두 처리할 수 있는 Exception 클래스 넣어줌
            System.out.println(e.toString()); // to String() 예외 클래스와 해당 객체에 포함된 에러 메세지 얻음
        }
    }
}
