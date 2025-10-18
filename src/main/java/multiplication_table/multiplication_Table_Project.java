package multiplication_table;

public class multiplication_Table_Project {
  public static void main(String[] args) {
    //구구단 만들기 (for)
    for (int i = 2; i < 10 ; i++) {
      for (int j = 1; j <10; j++) {
        System.out.printf("%d * %d = %d\n", i,j,i*j);
      }
    }
    System.out.println("------------------------");
    //구구단 만들기 (while)
    int bigSeqNum = 2;
    int SeqNum= 1;

    while(true){
      if(9 == bigSeqNum && 9 < SeqNum){
        break;
      } else if (9 < SeqNum) {
        bigSeqNum++;
        SeqNum = 1;
      }

      System.out.printf("%d * %d = %d\n", bigSeqNum,SeqNum,bigSeqNum*SeqNum);
      SeqNum++;
    }
    System.out.println("------------------------------------------------------");

    int bigSeqNum2 = 2;
    int SeqNum2 = 0;

    while(9 >= bigSeqNum2 && 9 >= (SeqNum2++)){
      if(9 < SeqNum2) {
        bigSeqNum2++;
        SeqNum2 = 0;
      } else {
        System.out.printf("%d * %d = %d\n", bigSeqNum2,SeqNum2,bigSeqNum2*SeqNum2);
      }
    }


  }




}
