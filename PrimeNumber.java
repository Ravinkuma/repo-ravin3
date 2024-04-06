package com.primeN;
import java.util.*;
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n==1) {
			System.out.println("nait a prime number");
		} else {
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				System.out.println("not a prime number");
				return;
			}
		}
		
          System.out.println(n+" is a prime number");
	}

}
}
