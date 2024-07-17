class SumAndReverse{
void main() {
        int number = 12345, sum = sumDigits(number), reversedSum = reverse(sum, 0);
    System.out.println(reversedSum);
    }
    
    static int sumDigits(int n) { return n == 0 ? 0 : n % 10 + sumDigits(n / 10); }
    static int reverse(int n, int rev) { return n == 0 ? rev : reverse(n / 10, rev * 10 + n % 10); }
}
