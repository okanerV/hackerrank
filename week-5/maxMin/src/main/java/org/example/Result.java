package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class Result {


    public static int maxMin(int k, List<Integer> arr) {
        List<Integer> res = new ArrayList<Integer>();
        Collections.sort(arr);
        for(int i=0; i<arr.size(); i++)
        {
            if(i+k<=arr.size()){
                int value = arr.get(i+k-1)-arr.get(i);
                res.add(value);
            }
        }
        return Collections.min(res);
    }
    public static void main(String[] args) throws IOException {
        int k = 3;  // Alt dizinin uzunluğu
        List<Integer> arr = Arrays.asList(3, 100, 200, 300, 350, 400, 401, 402);  // Örnek dizi
        int result = Result.maxMin(k, arr);
        System.out.println(result);
    }
}