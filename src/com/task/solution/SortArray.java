package com.task.solution;

public class SortArray {

    int arr[];
    int k;

    public SortArray(int[] arr, int k) {
        this.arr = arr;
        this.k = k;
    }

    public void sort() {
        int[] cnt = new int[k];
        for (int i = 0; i < arr.length; i++) {
            cnt[arr[i]]++;
        }

        int j  = 0;
        for(int  i = 0; i  < cnt.length; i++) {
            while(cnt[i] != 0) {
                arr[j++] = i;
                cnt[i] --;
            }
        }
    }
}
