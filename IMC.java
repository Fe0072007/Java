import java.util.Scanner;
public class IMC{
    
    float IMC(float peso, float altura){
        
        float imc = peso/(altura*altura);
        return imc;
        
    }
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		float p = scnr.nextFloat();
		float a = scnr.nextFloat();
		float imc = new IMC().IMC(p,a);
		System.out.println(imc);
		if(imc <= 18.5){
		        System.out.println("Abaixo do peso");
		    }else if(imc <= 24.9){
		        System.out.println("Peso normal");
		    }else if(imc <= 29.9){
		        System.out.println("Sobrepeso");
		    }else if (imc <= 34.9){		        
		        System.out.println("Obesidade grau I");
		    }else if (imc <= 39.9){
		        System.out.println("Obesidade grau II");
		    }else{
		        System.out.println("Obesidade Mórbida");
		}
	}
}
