import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        int a= 0;
        Scanner scan = new Scanner(System.in);
        
        for (int i = 1; i <10; i++) {
            System.out.println();
            for (int j = 2; j<10; j++) {
                System.out.printf("[%d * %d =%d] \t",j,i,i*i); // /t 입력으로 배열 줄 바꿈
            }
            System.out.println();
        }
    }
}