package org.practice.com;

public class FibonocciSeries {

	public static void main(String[] args) {
	int n=0,n1=1,n2=2,n3;
	for(int i=0;i<100;i++) {
		n2=n+n1;
		n3=n2+n1;
		System.out.println(n3);
	}

	}

}
