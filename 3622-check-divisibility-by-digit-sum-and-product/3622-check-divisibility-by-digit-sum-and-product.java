class Solution {
    public boolean checkDivisibility(int n) {
        int og = n;
        int data = 0;
        int product = 1;

        while(n > 0){
            int d = n % 10;
            data += d;
            product *= d;
            n /= 10;
        }
        int div = data + product;
        return og % div == 0;
    }
}