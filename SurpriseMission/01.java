import java.util.Scanner;

public class SurpriseMission {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("나의 좌표값을 입력하세요 (x y): ");
        int myX = sc.nextInt();
        int myY = sc.nextInt();

        int[][] XandY = new int[10][2];
        int count = 0;

        while (count < 10) {
            System.out.print("임의의 좌표를 입력하세요 (x y): ");
            int x = sc.nextInt();
            int y = sc.nextInt();

            boolean duplicate = false;
            for (int i = 0; i < count; i++) {
                if (XandY[i][0] == x && XandY[i][1] == y) {
                    duplicate = true;
                    System.out.println("중복된 좌표입니다. 다시 입력하세요.");
                    break;
                }
            }

            if (!duplicate) {
                XandY[count][0] = x;
                XandY[count][1] = y;
                count++;
            }
        }

        int closestX = XandY[0][0];
        int closestY = XandY[0][1];
        double shortestDistance = distance(myX, myY, closestX, closestY);

        for (int i = 1; i < 10; i++) {
            double dist = distance(myX, myY, XandY[i][0], XandY[i][1]);
            if (dist < shortestDistance) {
                shortestDistance = dist;
                closestX = XandY[i][0];
                closestY = XandY[i][1];
            }
        }

        System.out.println("가장 가까운 좌표는: (" + closestX + ", " + closestY + ")");
    }

    private static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }

}


