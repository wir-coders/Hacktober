import java.util.Scanner;
class Reverse{
  Scanner sc = new Scanner(System.in);
  String s = sc.next();
  StringBuilder str = new StringBuilder(s);
  System.out.println("String = "+ str.toString());
  StringBuilder reverseStr = str.reverse();
  System.out.println("Reverse String = "+ reverseStr.toString());
}
