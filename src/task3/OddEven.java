package task3;

//You are given an array (which will have a length of at least 3, but could be very large) containing integers.
// The array is either entirely comprised of odd integers or entirely comprised of even integers except for a single integer N.
// Write a method that takes the array as an argument and returns this "outlier" N.

public class OddEven {

    public static void main(String[] args) {

        System.out.println(find(new int[]{206847684, 1056521, 7, 17, 1901, 21104421, 7, 1, 35521, 1, 7781}));
    }

    private static int find(int[] integers){

        int result = 0;
        int odd = 0;
        int index = 0;

        for (int i = 0; i < integers.length; i++) {
            if(integers[i] % 2 == 0) {
                odd++;
                index = i;
            }
        }
        if(odd == 1){
            return integers[index];
        }else {
            for (int integer : integers) {
                if (integer % 2 != 0) {
                    result = integer;
                    break;
                }
            }
        }
        return result;
    }
}
