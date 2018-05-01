package taks2;

public class Triangle {

    public static void main(String[] args) {

        System.out.println(isTriangle(7, 2, 2));
    }

    public static boolean isTriangle(int a, int b, int c){
        if(a == b && a == c){
            return true;
        }
        return (a * 2 >= c && b * 2 >= c) || (b * 2 >= a && c * 2 >= a) || (c * 2 >= b && a * 2 >= b);
    }
}
