import java.util.Scanner ;
class Main{
public static void main(String[] args) {
Scanner cal = new Scanner(System.in);
System.out.print("Enter first digit: ");
int num1 = cal.nextInt();
System.out.print("Enter second digit: ");
int num2 = cal.nextInt();
System.out.println("Addition: "+ (num1+num2));
System.out.println("Subtraction: "+ (num1-num2));
System.out.println("Multiplication: "+ (num1*num2));
System.out.println("Division: "+ (num1/num2));
cal.close();
}
}
