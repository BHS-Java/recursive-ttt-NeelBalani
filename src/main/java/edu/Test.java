package main.java.edu;

public class Test {

  private int sum = 0;
  public Test(int n){
    countDown(n);
  }

  public void countDown(int n) {
    System.out.println(n);
    if(n !=0 ){
      countDown(n-1);
    }
  }

  public void printDashes(int n) {
    
    if(n != 1){
      printDashes(n-1);
    }
    System.out.println("-");
  }

  public int sumToN(int n) {
    sum += n;
    if(n != 0){
      sumToN(n-1);
    }
    return sum;
  }


}
