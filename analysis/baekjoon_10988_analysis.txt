import java.util.Scanner;

// 문제 파악
// 두 정수 A, B 입력받은 후 AxB 출력(0 < A, B < 10)

// 유추 파악
// A,B 입력받아서 AxB출력
        
// 주요 단어 영문 이름 선정
// 입력(input), 정수(demical), 출력(output), 곱하기(multiplied)
        
        public class Main {

        public static void main(String[] args) {
        // 테스트 케이스
        // 1 x 2 = 2
        
        // 프로그래밍 순서
        // 입력
       Scanner scanner = new Scanner(System.in);
       int input_first = scanner.nextInt();
       int input_second = scanner.nextInt();

        // 처리
        int multiplied = input_first * input_second;

        // 출력
        System.out.println(multiplied);
        }

        // try-on
        // 실패 시 원인 기록
}
