package com.sayan.jobprofile.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

interface Cal{
    int operate(int a, int b);
}
@Data
class CharCount{
    static class PairResult{
        char c;
        int count;

    }
}

public class SampleClass {

    public static void main(String[] args){
        Cal add = (a,b)-> a+b;


        String s = "aabbbccccd";
// parse string, print each character and its count

        int n = s.length();
        //  int i =1;
        int count =1;
        for(int i=1; i<n; i++){
            if(s.charAt(i) == s.charAt(i-1)){
                count++;
            }
            else{
                System.out.println((s.charAt(i-1)+"->"+ count));
                count =1;
            }
        }
        System.out.println((s.charAt(n-1)+"->"+ count));

    }
}
