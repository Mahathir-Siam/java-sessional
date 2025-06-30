import java.util.Scanner; import
java.util.ArrayList;
class Main{ public static void main(String[] args) {
Scanner chkPrime = new Scanner(System.in);
System.out.print("Enter the starting number: "); int start
= chkPrime.nextInt();
System.out.print("Enter the ending number: "); int end
= chkPrime.nextInt();
ArrayList<Integer> primeNumbers = new ArrayList<>(); for
(int i = start; i <= end; i++) { if
(isPrime(i)) {
primeNumbers.add(i);
}
}
Integer[] primeArray = primeNumbers.toArray(new Integer[0]);
System.out.println("Prime numbers between " + start + " and " + end + ":"); for
(int num : primeArray) { System.out.print(num + " ");
}
chkPrime.close();
} public static boolean isPrime(int num) { if (num <= 1) { return false; } for (int i = 2; i <= Math.sqrt(num); i++)
{ if (num % i == 0) { return false;
} } return true;
}
}
