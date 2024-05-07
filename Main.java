
import java.util.Scanner;

public class Main{
    
    Float Soma(float n1, float n2){
        
        float som = n1 + n2;
        
        return  som;
        
    }
    Float Subtracao(float n1, float n2){
        
        float sub = n1 - n2;
        
        return sub;
        
    }
    Float Multiplicacao(float n1, float n2){
        
        float mul = n1 * n2;
        
        return mul;
        
    }
    Float Divisao(float n1, float n2){
        
        float div = n1 / n2;
        
        return div;
        
    }
	public static void main(String[] args) {
	    
	    Scanner myScanner = new Scanner(System.in);
	    
	    System.out.println("Escolha a operação: 1-Soma|2-Subtração|3-Multiplicação|4-Divisão");
	    
	    int op = myScanner.nextInt();
	    
	    System.out.println("Digite o número 1:");
	    
	    float num1 = myScanner.nextFloat();
	    
	    System.out.println("Digite o número 2:");
	    
	    float num2 = myScanner.nextFloat();
	    
	    
	    
	    if (op == 1){
	        
    	    float soma = new Main().Soma(num1,num2);
    	    
    	    System.out.println("A soma de "+num1+ " e " +num2+ " é " +soma);
    	    
	    } else if (op == 2){
	        
	        float subtracao = new Main().Subtracao(num1,num2);
	        
	        System.out.println("A subtração de " +num1+ " e " +num2+ " é " +subtracao);
	        
	    } else if (op == 3){
	        
	        float multiplicacao = new Main().Multiplicacao(num1,num2);
	        
	        System.out.println("A multiplicação de " +num1+ " e " +num2+ " é " +multiplicacao);
	        
	    } else if (op == 4){
	        
	        float divisao = new Main().Divisao(num1,num2);
	        
	        System.out.println("A divisão de " +num1+ " e " +num2+ " é " + divisao);
	    }
	}
}
