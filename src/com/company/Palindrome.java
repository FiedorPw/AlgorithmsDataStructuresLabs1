package com.company;

public class Palindrome {



        public static void main (String[] arguments) {
            String word = "abccba";
            String longestPalindrome = findLongestPalindrome(word);
            System.out.println(longestPalindrome);
        }

        public static String findLongestPalindrome(String word) {
            String longestPalindrome = "";
            for (int i = 0; i < word.length(); i++) {
                String current = "";
                String subword = word.substring(i);
                current = analyzeSubstring(subword);
                if(current.length()>longestPalindrome.length()){
                    longestPalindrome = current;
                }
            }
            return longestPalindrome;
        }
        public static String analyzeSubstring(String word) {
            int index = word.length();
            String substring = "";
            while(index>0){
                substring = word.substring(0,index);
                boolean ifPalindrome = isPalindrome(substring);
                if(!ifPalindrome) {
                    index--;
                    continue;
                } else {
                    return substring;
                }
            }
            return substring;
        }
        public static boolean isPalindrome(String word) {
            int start = 0;
            int end = word.length() - 1;
            while(end > start){
                if(word.charAt(end)!=word.charAt(start)){
                    return false;
                }
                start++;
                end--;
            }
            return true;
        }
    }

