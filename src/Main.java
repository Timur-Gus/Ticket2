public class Main {
    public static void main(String[] args) {
        String palindrome = "А роза упала на лапу Азора";
        String string = "Пример не палиндрома";
        isPalindrome(palindrome);
        isPalindrome(string);
    }
    public static void isPalindrome(String str) {
        if (new StringBuilder(str).reverse().toString().
                replace(" ", "").
                compareToIgnoreCase(str.replace(" ", "")) == 0) {
            System.out.println("Строка является палиндромом");
        }
        else {
            System.out.println("Строка не является палиндромом");
        }
    }
}