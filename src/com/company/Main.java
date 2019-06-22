package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {324,43543,32,125,665,234,6560};
        int n=arr.length;
        boolean swap;
        do{
            swap=false;
            for(int i=0;i<n-1;i++){
                if(arr[i]>arr[i+1]){
                    int aux=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=aux;
                    swap=true;
                }
            }
            n--;
        }while(swap);
        System.out.println(Arrays.toString(arr));
    }
}
