
import java.util.Scanner; // Scanner클래스 사용을 위한 import문
public class MultiplicatoinTable {
    public static void main(String[] args) {
        // Scanner 객체, print문, 제어문, 논리 연산자
        // 1. 사용자의 입력값을 받는다 (2~9)
        // 2. 입력값이 2보다 작거나 9보다 크다면 경고 메시지 출력 및 프로그램 종료
        // 3. 입력값의 구구단 출력

        // 1
        Scanner scanner = new Scanner(System.in); // 값의 입력을 위한 Scanner 클래스 선언

        System.out.print("[안내]희망하는 구구단을 숫자로 입력해주세요 (2~9) : "); //입력 안내문
        int input = Integer.parseInt(scanner.nextLine()); // 입력값을 parseInt메서드로 int형으로 바꿔 input 변수에 입력값 저장

        System.out.printf("\n%d 단 이 입력되었습니다.\n", input );

        // 2
        int min = 2; // 하드코딩을 피하기 위해 입력의 최소값과 최대값 변수 선언
        int max = 9;
        if(input < min || input > max) { // 입력값이 2보다 작거나 9보다 클 경우 실행
            System.out.println("[경고]구구단은 2단 ~ 9단 까지만 선택할 수 있습니다.");
            System.out.println("프로그램을 종료합니다.");
            scanner.close(); // scanner 사용 종료
        }
        // 3
        else { // 입력값이 범위를 벗어나지 않으면 구구단 실행
            for(int i = 1 ;i <= max;i++){ // for 반복문으로 1~9까지 계산
                System.out.printf("%d * %d = %d\n", input, i, input * i);
            }
            scanner.close(); // scanner 사용 종료
        }





    }


}