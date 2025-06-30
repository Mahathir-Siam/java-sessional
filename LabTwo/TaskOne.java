import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner grade = new Scanner(System.in);
        System.out.print("Enter your mark: ");
        int mark = grade.nextInt();
        if (mark >=80) {
            System.out.printf("Your grade is A+");
        }
        else if(mark>=70){
            System.out.printf("Your grade is A ");
        }
        else if(mark>=60){
            System.out.printf("Your grade is A-");
        }
        else if(mark>=50){
            System.out.printf("Your grade is B");
        }
        else if(mark>=40){
            System.out.printf("Your grade is C");
        }
        else if(mark>=33){
            System.out.printf("Your grade is D");
        }
        else{
            System.out.printf("Your grade is F");
        }
        grade.close();
    }
}
