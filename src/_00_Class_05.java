import java.util.Scanner;

public class _00_Class_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int random = 0, input = 0, count = 0;
        // 1. 랜덤숫자 생성// 2. 숫자맞추기// 0. 종료// 숫자 맞추기 프로그램
        while (true) {
            System.out.println("[넘버를 맞춰봐! 프로그램]");
            System.out.println("1. 랜덤숫자 생성");
            System.out.println("2. 넘버딩동댕 게임");
            System.out.println("----------------");
            System.out.println("원하는 번호를 입력해주세요");
            input = scan.nextInt();
            
            switch (input) {
                case 1:
                    random =  (int)(Math.random()*100)+1; //1~100까지 랜덤숫자 생성
                    System.out.println("넘버링딩동 :" +random);
                    System.out.println("랜덤숫자가 생성되었습니다");
                    break;
                case 2:
                    
                    while (true) {
                        //count
                        if(count>3) {
                            System.out.println("3번의 시도가 아쉽습니다. 빵!");
                            System.out.println("정답 :"+ random);
                            break;
                        }
                        System.out.printf("1~100까지의 숫자를 입력하세요.(%d 번째 도전) \n" ,count);
                        input =scan.nextInt();
                        if(input == random) {
                            System.out.println("축하드려요! 넘버를 맞췄쒀염!!");
                        } else {
                            System.out.println("땡 아쉽네염!");
                        }
                        
                        break;
                    }
            } // switch
            count++;
        } // while
    } // main
} // class
