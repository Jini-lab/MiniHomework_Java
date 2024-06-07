/*
놀이공원 입장료 할인은 일반 할인과 특별 할인이 있습니다.
조건은 아래와 같습니다.
입장료 할인은 중복할인 되지 않으며, 중복될 경우 가장 할인을 많이 받은 금액으로 정해집니다.
- 3세미만이면 무료 입장
- 복지카드와 국가유공자의 경우 일반 할인 적용 - 13세미만이면 특별 할인 적용
- 17시이후에 입장하면 특별 할인 적용
기본 입장료 : 10,000원 특별 할인의 경우 : 4,000원 일반 할인의 경우 : 8,000원
 */
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 10000;
        System.out.print("나이를 입력해주세요.(숫자)");

        int age = sc.nextInt();

        System.out.print("입장시간을 입력해주세요. (숫자입력)");
        int time = sc.nextInt();

        System.out.println("국가유공자 여부를 입력해 주세요. (y/n)");
        String nation_yn = sc.next();

        System.out.println("복지카드 여부를 입력해 주세요. (y/n)");
        String card_yn = sc.next();

        if (nation_yn.equals("y") || card_yn.equals("y")) {
            total = 8000;
        }

        if (time>17){
            total=4000;
        }

        if( 3< age && age <13){
            total=4000;
        } if(age<3){
            total=0;
        }

        System.out.println("입장료: "+ total);
    }
}
