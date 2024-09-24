package com.demo.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test {
    public static void main(String[] args) {
        bai2("oneplusoneplustwo");
    }

    private static void bai2(String a) {
        List<String> list = new ArrayList<>();
        int count = 0;
        for(int i =0; i< a.length(); i++){
            if(a.startsWith("one",count)){
                list.add("1");
                count += 3;
            }else if(a.startsWith("two",count)){
                list.add("2");
                count+=3;
            }
            else if(a.startsWith("three",count)){
                list.add("3");
                count+=4;
            }
            else if(a.startsWith("four",count)){
                list.add("4");
                count+=4;
            }
            else if(a.startsWith("five",count)){
                list.add("5");
                count+=4;
            }
            else if(a.startsWith("six",count)){
                list.add("6");
                count+=3;
            }
            else if(a.startsWith("seven",count)){
                list.add("7");
                count+=5;
            }
            else if(a.startsWith("eight",count)){
                list.add("8");
                count+=5;
            }
            else if(a.startsWith("nine",count)){
                list.add("9");
                count+=4;
            }else if(a.startsWith("plus",count)){
                list.add("+");
                count+=4;
            }
        }
        int size = list.size();

        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0; i<size; i++){
            stringBuilder.append(list.get(i));

            if(!list.get(i).equals("+")){

            }
        }

        System.out.println(list);
    }

    private void bai1(){
        String x = null;
        String a = "xyzabbcxdazzdyk";
        for(int i=0; i< a.length();i++){
            int count = 0;
            char v = a.charAt(i);
            for(int j=i+1; j< a.length();j++){
                char z = a.charAt(j);
                if(v == z){
                    count++;
                    break;
                }
            }
            if(count == 0){
                x = String.valueOf(v);
                break;
            }
        }
        System.out.println(x);
    }


}
