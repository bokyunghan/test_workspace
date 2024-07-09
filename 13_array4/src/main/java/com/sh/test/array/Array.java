package com.sh.test.array;

import java.util.Random;
import java.util.Scanner;

public class Array {
	Scanner sc = new Scanner(System.in);
	public void test1() {
		// 요구사항 : 1 ~ 100사이의 중복없는 난수 10개를 생성해 배열에 대입하고, 내림차순 정렬하세요.
		Random rd = new Random();
	        final int NUM_MIN = 1;
	        final int NUM_MAX = 100;
	        final int NUM_LEN = 10;
	        int[] num = new int[NUM_LEN];
	        
	        // 1. 중복 없이 10개 뽑기
	        outer:
	        for(int i = 0;;) {
	            int n = (int) (Math.random() * NUM_MAX) + NUM_MIN;
	            System.out.println(n);
	            // 중복 검사
	            for(int j = 0; j < i; j++) {
	                if(num[j] == n)
	                    continue outer; // 중복된 값이면 다시 난수 생성
	            }
	            num[i++] = n; // 중복되지 않은 값 배열에 추가
	            if(i == NUM_LEN)
	                break;
	        }
	        
	        // 2. 버블 정렬을 사용하여 오름차순 정렬
	        for(int i = 0; i < num.length - 1; i++) {
	            for(int j = 0; j < num.length - i - 1; j++) {
	                if(num[j] > num[j + 1]) {
	                    swap(num, j, j + 1); // j와 j+1 위치의 값 교환
	                    print(j, j + 1, num); // 정렬 과정 출력
	                }
	            }
	        }
	        
	        System.out.println("==========정렬 완료 값==========");
	        print(num); // 정렬된 배열 출력
	    }
	    
	    // 배열의 두 요소 위치를 바꾸는 메서드
	    public void swap(int[] arr, int i, int j) {
	        int temp = arr[i];
	        arr[i] = arr[j];
	        arr[j] = temp;
	    }
	    
	    // 배열 전체를 출력하는 메서드
	    public void print(int[] arr) {
	        System.out.print("[");
	        for(int i = 0; i < arr.length; i++) {
	            if(i > 0) {
	                System.out.print(", ");
	            }
	            System.out.print(arr[i]);
	        }
	        System.out.println("]");
	    }
	    
	    // 정렬 과정에서의 배열 상태를 출력하는 메서드
	    public void print(int i, int j, int[] num) {
	        System.out.printf("%d - %d ", i, j);
	        print(num);
	    }
}




