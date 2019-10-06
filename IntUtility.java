package com.luvina.intutility;

public class IntUtility {
	private int n;
	private int sum = 0;

	public IntUtility(int n) {
		this.n = n;
	}
	
	public int getN() {
		return n;
	}

	public void sumOfOdd() {
		int soLe = n - 1;
		while (0 < soLe && soLe < n) {
			if (soLe % 2 != 0) {
				sum = sum + soLe;
			}
			soLe--;
		}
		System.out.print("Tong cac so le nho hon " + n + " la : " + sum);
	}

	public void printDivisor() {
		if (n == 0) {
			System.out.print("So " + n + " co vo so uoc");
		} else {
			System.out.print("Cac uoc cua " + n + " la : ");
			for (int i = 1; i <= n; i++) {
				if (n % i == 0) {
					System.out.print(i + ", ");
				}
			}
		}
	}

	public boolean checkPrime() {
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public void thongBao() {
		if (n == 0) {
			System.out.println("0 khong phai la so nguyen to");
		} else {
			if (checkPrime() == true) {
				System.out.println(n + " la so nguyen to");
			} else {
				System.out.println(n + " khong phai la so nguyen to");
			}
		}
	}
}
