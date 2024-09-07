package ex04;

import java.util.Scanner;
import pilha.integer.PilhaInt;

public class Ex04 {
	
	public static void main(String args[]) {
		
		Scanner s = new Scanner(System.in);
		PilhaInt p = new PilhaInt();
		System.out.println("Digite um numero pra conversao em binario");
		int num = s.nextInt();
		s.close();
		
		while(num >= 1) {
			p.push(num%2);
			num = num / 2;
		}
		
		while(!p.isEmpty()) {
			try {
				System.out.print(p.pop());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
