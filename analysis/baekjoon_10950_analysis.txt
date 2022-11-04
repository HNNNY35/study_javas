package Baekjoon;
import java.util.Scanner;

// 문제 파악
// 두 정수 A와 B를 입력받은 다음 A+B를 출력
// 첫줄에 테스트 케이스의 개수 T
// 각 테스트 케이스는 한 줄. 각 줄에 A와 B가 주어짐
// (0 < A, B <10)

// 유추 파악
// 테스트 케이스 개수 입력받고
        // 그 수만큼 A,B 입력받아서 출력
        
        // 주요 단어 영문 이름 선정
        // 입력(input), 정수(demical), 출력(output), 합(plus)
        
        public class Main {
        // 두 정수 합 구하기
        public int plus(int input_first, int input_second) {
            int output_plus = input_first + input_second;
            return output_plus;
        }

        public static void main(String[] args) {
        // 테스트 케이스
        // 5
        // 1 + 1 = 2
        // 2 + 3 = 5
        // -1 + 4 = error
        
        // 프로그래밍 순서
        
        // 입력
        Scanner scanner = new Scanner(System.in);
        int input_t = scanner.nextInt();
        int input_first;
        int input_second;
        int output_plus;
        for(int i = 0; i < input_t; i++){
            input_first = scanner.nextInt();
            input_second = scanner.nextInt();
            
            // 처리
            Main main = new Main();
            output_plus = main.plus(input_first, input_second);

            // 출력
            System.out.println(output_plus);
        }

        // try-on
        // 실패 시 원인 기록
        
    
}
}