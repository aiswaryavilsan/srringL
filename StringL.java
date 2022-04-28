package com.learn;
import java.util.*;
import static java.lang.Math.*;

class StringL {
    static int longestS(String s) {
        HashMap<Character, Integer> i = new HashMap<>();
        int maxL = 0;
        int start = 0;
        for(int end = 0; end < s.length(); end++)
        {
            if(i.containsKey(s.charAt(end)))
            {
                start = max(start, i.get(s.charAt(end)) + 1);
            }
            i.put(s.charAt(end), end);
            maxL = max(maxL, end-start + 1);
        }
        return maxL;
    }
    public static void main(String []args)
    {
        String s = "string without repeating characters";
        System.out.println("The input String : " + s);
        int length = longestS(s);
        System.out.println("Length of longest non-repeating character substring :" + length);
    }
}
