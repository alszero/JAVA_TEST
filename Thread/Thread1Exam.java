package Thread;
// main 스레드와 d 스레드가 실행되는 프로그램
class top extends Thread{
    public void run(){
        for (int i=0; i<50; i++){
            System.out.println(i+"\t");
        }
    }
}
public class Thread1Exam {
    public static void main(String[] args) {
        System.out.println("프로그램 시작");
        top d = new top();
        d.start();
        System.out.println("프로그램 종료");
    }
}
// 실행 순서가 순차적이지 않음을 확인할 수 있다.
