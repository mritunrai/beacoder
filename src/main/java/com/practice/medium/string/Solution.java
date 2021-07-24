package com.practice.medium.string;

import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

public class Solution {

    //Input: s = "abcabcbb"
    //Output: 3
    //Explanation: The answer is "abc", with the length of 3.

    /*
    The first solution is like the problem of "determine if a string has all
    unique characters" in CC 150. We can use a flag array to track the existing characters
    for the longest substring without repeating characters.
     */
    public static int lengthOfLongestSubstring(String s) {
        if (s == null)
            return 0;
        boolean[] flag = new boolean[256];

        int result = 0;
        int start = 0;
        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            char current = arr[i];
            if (flag[current]) {
                result = Math.max(result, i - start);
                // the loop update the new start point
                // and reset flag array
                // for example, abccab, when it comes to 2nd c,
                // it update start from 0 to 3, reset flag for a,b
                for (int k = start; k < i; k++) {
                    if (arr[k] == current) {
                        start = k + 1;
                        break;
                    }
                    flag[arr[k]] = false;
                }
            } else {
                flag[current] = true;
            }
        }

        result = Math.max(arr.length - start, result);

        return result;
    }

    public static int lengthOfLongestSubstringWithHashSet(String s) {
        char[] str = s.toCharArray();
        Set<Character> hashSet = new HashSet<>();

        for (Character ch :
                str) {

            if (!hashSet.contains(ch)) {
                hashSet.add(ch);
            }

        }

        return
                hashSet.size();
    }

    public static int lengthOfLongestSubstringWithBruteForce(String s) {

        int length = 0;

        char[] str = s.toCharArray();

        int max = 0;

        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str.length; j++) {
                boolean uni = checkRepetition(str.toString(), i, j);

                if (uni) {
                    max = Math.max(max, str.toString().length());
                }
            }
        }
        return max;
    }

    private static boolean checkRepetition(String s, int start, int end) {
        int[] chars = new int[128];

        for (int i = start; i <= end; i++) {
            char c = s.charAt(i);
            chars[c]++;
            if (chars[c] > 1) {
                return false;
            }
        }

        return true;
    }
//    public static Boolean checkRepitition(String s , int start , int end)
//    {
//       char [] str = s.toCharArray();
//
//       for(int i=start;i<end;i++)
//       {
//           for (int j=start;j<end;j++) {
//               if (str[start] == str[end]) {
//                   return false;
//
//               }
//           }
//       }
//     return true;
//       //throw new IllegalArgumentException("Exception thrown by Programme...");
//
//    }

    /*
    //Given a string s, return the longest palindromic substring in s.
//
//
// Example 1:
//
//
//Input: s = "babad"
//Output: "bab"
//Note: "aba" is also a valid answer.

https://www.geeksforgeeks.org/longest-palindrome-substring-set-1/
https://www.programcreek.com/2013/02/leetcode-longest-substring-without-repeating-characters-java/
     */


    public static String longestPalindrome(String s) {

        char[] str = s.toCharArray();

        String maxSuvString = "";

        for (int i = 0; i < str.length; i++) {
            for (int j = i; j < str.length; j++) {
                if (i != j || (j - i) > 1) {
                    if (isPalindrome(s, i, j)) {
                        System.out.println("s.substring(i,j).length() :" + s.substring(i, j).length());
                        System.out.println("maxSuvString.length() :" + maxSuvString.length());

                        if (maxSuvString.length() <= s.substring(i, j + 1).length()) {
                            maxSuvString = s.substring(i, j + 1);

                        }
                    }
                }
            }
        }
        return maxSuvString;
    }

    public static boolean isPalindrome(String str, int start, int end) {
        char[] ch = str.toCharArray();
        boolean flag = true;
        for (int i = start; i <= end / 2; i++) {
            if (ch[i] != ch[end - i]) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    /*
    Below are the permutations of string ABC.
    ABC ACB BAC BCA CBA CAB
    https://www.geeksforgeeks.org/write-a-c-program-to-print-all-permutations-of-a-given-string/?ref=leftbar-rightbar
     */
    public static void stringPermutation(String str, int l, int r) {
        if (l == r)
            System.out.println(str);

        else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);   // do
                stringPermutation(str, l + 1, r);   // recur
                str = swap(str, l, i);  // undo
            }
        }

    }

    private static String swap(String str, int l, int i) {
        char temp;
        char[] charArray = str.toCharArray();
        temp = charArray[l];
        charArray[l] = charArray[i];
        charArray[i] = temp;
        return String.valueOf(charArray);
    }

    /*
    A valid IPv4 address is an IP in the form "x1.x2.x3.x4" where 0 <= xi <= 255 and xi cannot contain leading zeros.
    For example, "192.168.1.1" and "192.168.1.0"
    are valid IPv4 addresses but "192.168.01.1", while "192.168.1.00" and "192.168@1.1" are invalid IPv4 addresses.
     */

    // CTR+ALT+T for try catch  short cut.

    public static String validIPAddress(String IP) {

        try {
            return (InetAddress.getByName(IP) instanceof Inet6Address) ? "IPv6" : "IPv4";

        } catch (Exception e) {
            return "Neither";
        }


    }

    public static String validIPAddressUsingRegex(String IP) {
        String chunkIPv4 = "([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])";
        Pattern pattenIPv4 =
                Pattern.compile("^(" + chunkIPv4 + "\\.){3}" + chunkIPv4 + "$");

        String chunkIPv6 = "([0-9a-fA-F]{1,4})";
        Pattern pattenIPv6 =
                Pattern.compile("^(" + chunkIPv6 + "\\:){7}" + chunkIPv6 + "$");


        if (pattenIPv4.matcher(IP).matches()) return "IPv4";
        return (pattenIPv6.matcher(IP).matches()) ? "IPv6" : "Neither";

    }

    public static void main(String[] args) {
        // System.out.println(lengthOfLongestSubstring("Mritunjairai"));

        //System.out.println(lengthOfLongestSubstringWithHashSet("mikrai"));

        //System.out.println(lengthOfLongestSubstringWithBruteForce("mritunjairai"));

        // System.out.println(longestPalindrome("madamtsoooos"));
        //System.out.println(longestPalindrome("madamada"));
        // System.out.println(isPalindrome("madam1",0,5));

        //  System.out.println("Checking length between 0 -2 for mkrai :"+"mkrai".substring(0,3));

        // Calling IPAddress validation test cases.
        // System.out.println(validIPAddress("192.123.145.01.98"));

        // Using Regex

        //System.out.println(validIPAddressUsingRegex("123.345.23.23"));

        // String Permutation.

        String str = "ABC";
        int n = str.length();
        stringPermutation(str, 0, n - 1);
    }
}