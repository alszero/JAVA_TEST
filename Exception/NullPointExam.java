package Exception;

public class NullPointExam {
    public static void main(String[] args) {
//        참조할 메모리가 없어서 에러가 남
//        String str = null;
//        System.out.println("문자열: " + str.length());
        try {
            String str = null;
            System.out.println("문자열: " + str.length());
        }catch (NullPointerException npe){
            System.out.println("npe.toString() : " + npe.toString());
        }finally {
            System.out.println("무조건 실행");
        }
    }
}
