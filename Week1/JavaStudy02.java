/*
[캐시백 계산 조건]
- 결재 금액의 10%를 적립한다.
- 캐시백포인트 단위는 백원단위이다.(100원, 200원, 300원 등) - 한건의 캐시백 포인트는 최대 300원을 넘을 수 없습니다.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cash = sc.nextInt();
        int x;
        System.out.println("[캐시백 계산]");
        System.out.println("결제 금액을 입력해주세요. (금액):"+ cash);
        x = (cash/100*10)/100*100;
        if (x>300) {
            x=300;
        }
        System.out.println("결제 금액은 "+cash+"원이고, 캐시백은 "+x+"원 입니다.");
    }
}
