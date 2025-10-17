package even_number;

public class even_number_project {
  public static void main(String[] args) {

    int num = 1;

    do{
      if(0 == num % 2) {
        System.out.println(num);
      }
      num = num + 1;
    } while(num <= 10);
    System.out.println("--------------------------------------");

    for (int i = 1; i <= 10; i++) {
      if (i % 2 == 0) {
        System.out.println(i);
      }
    }
  }
}
