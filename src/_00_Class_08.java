import java.util.Scanner;

public class _00_Class_08 {
    public static void main(String[] args) {
        
        //랜덤 숫자 맞추기
        // 10 번 기회를 주어지고 정답확인시 입력한 번호 출력
        Scanner scan = new Scanner(System.in);
        
        int  input = 0,random = 0;
        int count = 0; // 도전횟수
        int [] num = new int[10]; //입력한 숫자를 저장
    
        random = (int)(Math.random()*100)+1;
        System.out.println("랜덤숫자 :" + random);
        
        while (true) {
            // 몇번 도전했는지 확인
            count++;
            if (count>9) {
                System.out.println("10번 도전했습니다. 프로그램을 종료합니다.");
                break;
            }
            //도전 번호 입력
            System.out.println((count+1)+ "번째 숫자를 입력하세요.>>");
            num[count] = scan.nextInt();
            if (num[count]==random) {
                System.out.println("정답입니다. 축하합니다\n");
                break;
            }else {
                System.out.println("땡 안녕히가세요 빵빵빵!");
            }
        }
        // 입력한 숫자 출력
        System.out.println("정답 : "+ random);
        System.out.println("입력한 숫자 : ");
        for (int i = 0;i<count+1; i++) {
            if(i==0) {
                System.out.println(num[i]);
            } else {
                System.out.println(num[i]+" , ");
            }
        }
    }
}
