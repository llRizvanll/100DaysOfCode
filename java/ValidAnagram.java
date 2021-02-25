package java;

import java.util.Scanner;

class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        int[] counts = new int[26];
        for (int i = 0; i < s.length(); i++) {
            counts[s.charAt(i) - 'a']++;
            counts[t.charAt(i) - 'a']--;
        }

        for (int label : counts){
            if(label != 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = new String[2];
        for (int i = 0; i < 2; i++) {
            arr[i]= scanner.nextLine();
        }

        System.out.println("Given Two Strings are valid anagram? "+isAnagram(arr[0],arr[1]));
    }
}
