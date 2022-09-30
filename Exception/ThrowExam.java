//package Exception;
////throws 키워드 쓰는방법
////    접근제한자 메소드 이름() throws 예외 클래스 이름들{
////        //메소드가 수행할 작업들;
////            }
//public class ThrowExam {
//    public static void arrayMethod() throws ArrayIndexOutOfBoundsException{
//        String [] irum = new String[3];
//        irum[3] = "홍길동";    //ㄱ
//    }
//
//    public static void main(String[] args) {
//        ThrowExam ts = new ThrowExam();
//        try{
//            arrayMethod();
//        }catch (ArrayIndexOutOfBoundsException ae){
//            System.out.println("배열 예외 발생");     //ㄴ
//        }
//    }
//    // ㄱ에서 ArrayIndexOutOfBoundsException 에러가 발생하여 예외 처리를 arrayMethod() 메소드를 호출한 ㄴ부분으로 넘겨준다.
//    //  try~catch 문에 의해 "배열 예외 발생"이 출력된다.
//}
package Exception;

public class ThrowExam {
    public static void  arrayMethod() throws ArrayIndexOutOfBoundsException{
        String[] irum = new String[3];
        irum[3] = "홍길동"; //에러 발생
    }

    public static void main(String[] args) {
        ThrowExam ts = new ThrowExam();
        try{
            arrayMethod();
        }catch(ArrayIndexOutOfBoundsException ae){
            System.out.println("배열 예외 발생");
        }
    }
}
