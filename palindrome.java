import java.util.Scanner;
public class Palindrome {
    static Scanner in = new Scanner(System.in);
    static boolean isPalindrome(String str){
        int pos1=0;
        int pos2=str.length()-1;
        while(pos2>pos1) {
            if (str.charAt(pos1) != str.charAt(pos2)) {
                System.out.println("False: "+str+" isn't a Palindrome");
                return false;
            }
            ++pos1;
            --pos2;
        }
        System.out.println("True: "+str+" is a Palindrome");
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Enter a word:");
        String s = in.nextLine();
        System.out.println(isPalindrome(s));
    }
}
