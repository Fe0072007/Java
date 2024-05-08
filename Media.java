import java.util.Scanner;
public class Media{
    
    float Media(float n1, float n2, float n3, float n4){
        
        float media = (n1 + n2 + n3 + n4) / 4;
        return media;
    }
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("");
		float nota1 = scnr.nextFloat();
		float nota2 = scnr.nextFloat();
		float nota3 = scnr.nextFloat();
		float nota4 = scnr.nextFloat();
		float m = new Media().Media(nota1,nota2,nota3,nota4);
		System.out.println(m);
	}
}
