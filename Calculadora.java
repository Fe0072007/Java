
import java.util.Scanner;

public class Calculadora{
    
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
	    
	    
	    
	    switch (op){
	        
	        case 1:
	           float soma = new Calculadora().Soma(num1,num2);
	           System.out.println(soma);
	        case 2:
	            float subtracao = new Calculadora().Subtracao(num1,num2);
	            System.out.println(subtracao);
	        case 3:
	            float multiplicacao = new Calculadora().Multiplicacao(num1,num2);
	            System.out.println(multiplicacao);
	        case 4:
	            float divisao = new Calculadora().Divisao(num1,num2);
	            System.out.println(divisao);
	        
	    }
}
}
