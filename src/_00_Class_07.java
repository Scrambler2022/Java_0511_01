public class _00_Class_07 {
    public static void main(String[] args) {
        // int 배열
        // 10개의 배열을 만들고 랜덤숫자 1-10까지 숫자를 입력해서 출력하시오.
        
        int [] num = new int[10]; // 저장할 수 있는 공간
        int [] input = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i <10; i++) {
            num[i] = (int)(Math.random()*10)+1;
            System.out.println(num[i]);
        }
        
        
//        int [] num = new  int[100];
//        for (int i= 0; i<100; i++) {
//            num[i] = i+1;
//            System.out.println(num[i]);
//        }
        
        
        
        
        
//        int [] num = new int[5];
//        num[0]=1;
//        num[1]=2;
//        num[2]=3;
//        num[3]=4;
//        num[4]=5;
//
//        for (int i = 0; i< num.length; i++) {
//            System.out.println(num[i]);
//        }
    }
}
