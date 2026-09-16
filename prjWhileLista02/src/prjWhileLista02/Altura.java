package prjWhileLista02;

public class Altura {

	public static void main(String[] args) {
	double j = 134;
	double p = 145;
	
	int i = 0;
		while (p>j) {
			j = j + 2.5;
			p = p + 2.0;
			
			i++;
		}
		System.out.println("João alcançará a altura de Pedro em: " +i+ " anos");
	}

}
