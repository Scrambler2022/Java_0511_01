public class _00_Class_03 {
    public static void main(String[] args) {
        int i =0, sum=0;
        //반복문에서 break문 // continue는 중간에서 그것만 빼고 실행하는 문
        for(i = 0;; i++) {
            if (sum>10) {
                break;
            }
            i++;
            sum = sum +i;
        }
        System.out.println("i의 결과값 :"+(i));
            System.out.println("sum의 결과값 :"+sum);
            
        }
        
//        while (true) {
//            if(sum>100) {
//                break; // while,for 종료 break문 사용한다.
//            }
//            i++; // i의 순서가 중요하다
//            sum = sum + i; // i가 13일때 sum은 91이 된다
//        }
//        System.out.println("i의 결과값 :"+i);
//        System.out.println("sum의 결과값 :"+sum);
//
//
//
//
//    }
}
