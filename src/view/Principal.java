package view;

import br.mari.listaInt.Lista;

public class Principal {

	public static void main(String[] args) {
		int []v = {25,42,23,74,80,77,13,41,59,35,68,53,75,84,44,94,71,88};
			Lista l = new Lista();
			for(int valor: v) {
				if(l.isEmpty()) {
					l.addFirst(valor*2);
				}else if(l.size()<3) {
					l.addFirst(valor/2);
				}else if(l.size()>10) {
					try {
						l.add(valor*3, 5);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}else {
					try {
						l.add(valor,1);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			for(int i=0;i<l.size();i++) {
				try {
					System.out.print(" " + l.get(i)+ " ");
				} catch (Exception e) {
					
					e.printStackTrace();
				}
			}
			System.out.println (" ");
			while(l.isEmpty()!=true) {
				if(l.size()>10) {
					try {
						System.out.println(" removido: " + l.get(3));
						l.remova(3);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}else if(l.size()>5) {
					int t = l.size();
					try {
						System.out.println(" removido: " + l.get(t-1));
						l.remova(t-1);
					
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}else if( l.size()>3) {
					try {
						System.out.println(" removido: " + l.get(1));
						l.remova(1);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}else {
					try {
						System.out.println(" removido: " + l.get(0));
						l.removaFirst();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
			}


	}

}
