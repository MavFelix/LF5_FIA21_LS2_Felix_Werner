
public class SectionSort {
	public static void main (String args[]) {
		
		int[] liste = { 4, 2, 10, 3, -5, 0, 17 };
		
			for (int i = 0; i<liste.length; i++) {
				int big = i;
				
				for(int t = i+1; t<liste.length; t++) {
					if (liste[t]<liste[big]) {
						big = t;
					}
				}
				int small = liste[big];
				liste[big] = liste[i];
				liste[i] = small;
				System.out.print(liste[i] + ", ");
			}
			
	}
}
