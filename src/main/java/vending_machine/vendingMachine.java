package vending_machine;

import java.util.Scanner;

public class vendingMachine {
  public static void main(String[] args) {
    final String[] beverageName = {"스프라이트","콜라","밀키스"};
    final int[] beverageCost = {1100,900,1400};
    final int[] beverageStack = {4,3,2};

    int money = 0;
    int selectedBeverage = 1;
    int isExit = 0;

    do{
      for (int index = 0; index < 3; index++) {
        System.out.printf("%d.%s (%s원)\n", index, beverageName[index], beverageCost[index]);
      }
      do{
        Scanner sc = new Scanner(System.in);
        System.out.println("돈을 투입해주세요: ");
        money = money + sc.nextInt();
        do{
          System.out.println("음료를 선택해주세요.");
          selectedBeverage = sc.nextInt();
          if(beverageStack[selectedBeverage] <= 0) {
            System.out.printf("%s 음료가 존재하지 않습니다.",beverageName[selectedBeverage]);
          }
        } while (beverageCost[selectedBeverage] <= 0);

        if(beverageCost[selectedBeverage] <= 0) {
          System.out.println("금액이 부족합니다.");
        }
      } while (beverageCost[selectedBeverage] > money);

      money = money - beverageCost[selectedBeverage];
      beverageStack[selectedBeverage] = beverageStack[selectedBeverage] - 1;

      System.out.printf("");

      System.out.printf("%s 음료를 구매했습니다.\n", beverageName[selectedBeverage]);

      System.out.printf("남은 금액은 %d원 입니다.\n", money);

      System.out.println("거스름 돈을 반환 받으시겠습니까?(yes는 1/ no는 0)");
      Scanner scanner = new Scanner(System.in);
      isExit = scanner.nextInt();
    } while(isExit == 0);

  }

}
