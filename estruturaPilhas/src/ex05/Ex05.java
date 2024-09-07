package ex05;

import pilha.integer.PilhaInt;

public class Ex05 {

	public static void main(String[] args) {
		PilhaInt p = new PilhaInt();
		
		for(int i=0; i<=10; i++) {
			p.push((int) (Math.random()*50));
		}
		
		try {
			System.out.println("O maior valor na pilha e " + p.max());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		while(!p.isEmpty()) {
			try {
				System.out.print(p.pop() + "   ");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}