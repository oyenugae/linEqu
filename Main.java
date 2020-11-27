import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    float first, second;
    System.out.println("Input the value of a");
    Scanner scan = new Scanner(System.in);
    first = scan.nextFloat();
    System.out.println("Input the value of b");
    second = scan.nextFloat();
    //checks for division by zero before calculation
    if (first == 0)
       System.out.println("Do not make me have a division by zero errror by your zero input");
    else
       System.out.println("The answer to your linear equation is" + linEqu(first, second));
  }

  public static float linEqu(float a, float b){
    return -b/a;
  }
}