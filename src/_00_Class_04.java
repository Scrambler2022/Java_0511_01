import java.util.Scanner;

public class _00_Class_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int input =0,num1 = 0, num2 =0, sum =0;
        
        loop:while (true) { // 무한반복 loop안에 대소문자 및 숫자도 가능하다 같은 단어는 불가능
            System.out.println("1. 더하기");
            System.out.println("2. 곱하기");
            System.out.println("0.  종료");
            System.out.println("---------");
            System.out.println("원하는 번호를 입력하세요");
            input = scan.nextInt();
            if (input==0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            switch (input) {
                case 1:
                    while (true) {
                        System.out.println("첫 번째 숫자를 입력하세요.(0.이전페이지, 1.종료)");
                        num1 = scan.nextInt();
                        if (num1 ==0) break;
                        if (num1 ==1) break loop;
                        System.out.println("두 번째 숫자를 입력하세요");
                        num2 = scan.nextInt();
                        System.out.printf("결과값 : %d + %d = %d \n :",num1,num2, (num1 + num2));
                        break;
                    }
                    
            }
            
        }
        
//        loop:for (int i = 2; i < 10; i++) {
//            for (int j = 1; j < 10; j++) {
//                if (j == 6) break loop; // 제일가까운 문을 빠져나온다
//                System.out.printf("%d * %d =%d \t", i, j, i * j);
//            }
//            System.out.println();
//        }
    }
}
        //        for(int i=0; i<=10; i++) {
//
//            if( i== 5) {
//                continue; //결과값이 5번만 빼고 전부 실행 되어짐
//
//            }// continue 중간을 빼고 포문을 나와서 다시 실행한다.
//
//
//            System.out.println(i);
//        }
