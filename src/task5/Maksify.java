package task5;

public class Maksify {

    public static void main(String[] args) {

        System.out.println(maskify("4556364607935616"));
    }

    public static String maskify(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        for(int i = 0; i < str.length()-4; i++){
            stringBuilder.replace(i, i+1, "#");
        }
        return stringBuilder.toString();
    }
}
