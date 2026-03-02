class ArmstrongNumbers {

    boolean isArmstrongNumber(int n) {

        int temp = n, res = 0;
        int numOfDigits = 0;

        while(temp > 0) {
            numOfDigits++;
            temp /= 10;
        }

        temp = n;

        while(temp > 0) {
            res += Math.pow((temp % 10), numOfDigits);
            temp /= 10;
        }

        return res == n;
    }
}
