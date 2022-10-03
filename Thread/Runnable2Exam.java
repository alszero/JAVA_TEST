package Thread;

class RTop2 implements Runnable{
    public void run(){
        for (int i = 0; i < 30; i++) {
            System.out.println((Thread.currentThread()).getName() + i + "\t");
        }
    }
}
public class Runnable2Exam {
    public static void main(String[] args) {
        System.out.println("프로그램 시작");
        Thread thd1 = new Thread(new RTop2(), "a");
        Thread thd2 = new Thread(new RTop2(), "b");
        System.out.println(thd1.getPriority()); //스레드 우선순위리턴
        System.out.println(thd2.getPriority()); //스레드 우선순위리턴
        thd1.setName("new_a");//스레드 이름 변경
        thd2.setName("new_b");
        thd1.setPriority(9); //스레드 우선순위 지정
        thd2.setPriority(Thread.MIN_PRIORITY); //스레드 우선순위 지정(1~10까지)
        System.out.println(thd1.getPriority());//스레드 우선순위리턴
        System.out.println(thd2.getPriority());//스레드 우선순위리턴
        thd1.start();
        thd2.start();
        System.out.println("프로그램 종료");
    }
}
