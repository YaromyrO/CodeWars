package task4;

//You are going to be given a word. Your job is to return the middle character of the word.
// If the word's length is odd, return the middle character. If the word's length is even, return the middle 2 characters.

public class Middle {

    public static void main(String[] args) {

        System.out.println(getMiddle("middle"));
    }

    private static String getMiddle(String word) {

        StringBuilder builder = new StringBuilder(word);
        String result;
        if(word.length() == 1){
            return word;
        }
        if(word.length() % 2 ==0){
            int index = Math.round(word.length()/2);
            result = builder.substring(index-1, index+1);
        }else {
            result = builder.substring(word.length()/2, (word.length()/2)+1);
        }
        return result;
    }
}
