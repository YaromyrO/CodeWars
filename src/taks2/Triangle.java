package taks2;

//Implement a method that accepts 3 integer values a, b, c.
// The method should return true if a triangle can be built with the sides of given length and false in any other case.

public class Triangle {

    public static void main(String[] args) {

        System.out.println(isTriangle(7, 2, 2));
    }

    public static boolean isTriangle(int a, int b, int c){
        if(a == b && a == c){
            return true;
        }
        return (a + b > c) && (a + c > b) && (c + b > a);
    }
}
