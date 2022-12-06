public class Main {
    public Main() {
    }
    public static boolean isItPalidrome(String word,int i) { // i
        int length = word.length(); //counting the number of letters in a word
        int halfLength; //variable definition
            if (length % 2 == 0) halfLength = length / 2; // checking the parity condition and determining position of middle chars
            else halfLength = (length + 1) / 2; //else statement and determining position of middle char for odd numbers of letters input

            if(word.charAt(i) != word.charAt((length-1)-i)) return false; //comparing opposing chars to determinate if it is a palindrome and if is not return false
            else if((halfLength-1) == i)return true; //if every char is the same up to middle element return true

        i++; //iteration count
        isItPalidrome(word,i);  //recursion of function
        return true;
    }

    public static void main(String[] args) {
        int i=0;
        String first = "abba";
        String second = "ala";
        String third = "sedes";
        String fourth = "łukasz";
        System.out.println(isItPalidrome(first,i));
        System.out.println(isItPalidrome(second,i));
        System.out.println(isItPalidrome(third,i));
        System.out.println(isItPalidrome(fourth,i));
    }
}
