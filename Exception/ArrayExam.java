package Exception;

public class ArrayExam {
    public static void main(String[] args) {
        int data[] = new int[]{10,20,30,40,50};
        for (int i = 0; i <= data.length; i++) { //첨자 0부터 시작해서 4까지 사용가능     배열의 원소는 5개!!
            //컴파일 시 에러 발생 X, 실행 시 에러가 발생한 경우 이므로
            //근본적인 에러 수정 필요함
            //for(int i=0; i<data.length; i++)
            System.out.println("data["+i+"]="+data[i]);
        }
    }
}
