public class GreatestCommonDivisor {
    public static void main(String[] args) {
        // gcd(4, 8);
        // gcd_reverse(4, 8);

        int euclid = euclid(4, 8);
        System.out.println("euclid = " + euclid);
    }

    /**
     * Time complexity: O(log min(a,b))
     */
    private static int euclid(int a, int b) {
        if (b == 0) {
            return a;
        }
        return euclid(b, a % b);
    }

    /**
     * Time complexity: O(min(a,b))
     */
    private static void gcd_reverse(int a, int b) {
        int min = Math.min(a, b);
        System.out.println("a,b's min = " + min);

        while (min > 1) {
            if (a % min == 0 && b % min == 0) {
                System.out.println("O : " + min);
            } else {
                System.out.println("X : " + min);
            }
            min = min - 1;
        }
    }

    private static void gcd(int a, int b) {
        int gcd = 1;
        while (true) {
            for (int i = 2; i <= Math.min(a, b); i++) {
                if (a % i == 0 && b % i == 0) {
                    if (gcd < i) {
                        System.out.println("a:" + a + ",b:" + b + ",i:" + i);
                        gcd = i;
                    }
                }
            }

            if (gcd == 1) {
                break;
            }

            System.out.println(a + "," + b + "\'s gcd:" + gcd);

            a /= gcd;
            b /= gcd;
            gcd = 1;
        }

        System.out.println("result a:" + a + ", b:" + b);
    }
}
