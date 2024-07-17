import java.util.Scanner;

class AtomicMagicNumber {
    public static void main(String[] bastee) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (isAtomicMagicNumber(num)) {
            System.out.println(num + " is an atomic magic number.");
        } else {
            System.out.println(num + " is not an atomic magic number.");
        }
sc.close();
    }
 public static boolean isAtomicMagicNumber(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return isPrime(sum);
    }

    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}