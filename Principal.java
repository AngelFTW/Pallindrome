import java.util.*; 
import java.io.*;

public class Principal {

  public static String Palindrome(String palavra) {
    
	int comp = palavra.length(); // essa variável pega o tamanho da palavra que digitamos
	
	boolean palindromo = true; // Aqui vai ser sempre true, o if abaixo é pra verificar que se der diferente, vira falso e o codigo encerra(break)
	
	for (int i=0; i<comp;i++) { // Variavel i de iteração, enquanto for menor que a variavel comp, iterar o for
		
		if(palavra.charAt(i) != palavra.charAt(comp-1-i)) { // Nesta parte o if compara cada caractere(char) à sua reversa (comp-1-i)
			System.out.println("A palavra "+palavra+" não é um palíndromo");
			palindromo=false;
			break;
		}
		
	}
	
	if (palindromo) {
		System.out.println("A palavra "+palavra+" é um palíndromo");
	}
	  
    return palavra;
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner teclado = new Scanner(System.in);
    System.out.println("Digite o palíndromo(letras minúsculas): ");
    Palindrome(teclado.nextLine());
  }

}