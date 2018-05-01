package task1;

import java.util.Arrays;

public class Tribonacci {

    public static void main(String[] args) {

        double[] test = tribonacci(new double[]{1,1,1}, 10);
        for (int i = 0; i < test.length; i++) {
            System.out.print(test[i] + " ");
        }
    }

    private static double[] tribonacci(double[] s, int n) {

        double[] result;
        if(n < 3){
            switch (n){
                case 0:
                    return result = new double[0];
                case 1:
                    result = Arrays.copyOf(s, 1);
                    return result;
                case 2:
                    result = Arrays.copyOf(s, 2);
                    return result;
            }

        }else {
            result = new double[n];
            double a = s[0];
            double b = s[1];
            double c = s[2];
            result[0] = a;
            result[1] = b;
            result[2] = c;

            for(int i = 3; i < result.length; i++){
                result[i] = a + b + c;
                a = b;
                b = c;
                c = result[i];
            }
            return result;
        }
        return null;
    }
}
