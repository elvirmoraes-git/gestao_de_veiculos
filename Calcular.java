package gestao_de_veiculos;

/**
 * @author Elvir Moraes
 * Ra: 02398150
 * Rio de Janeiro, 21/07/2022
 * UTFPR - Universidade Tecnol�gica Federal do Paran�
 *  
 * Interface para calcular quantidade de strings e inteiros. 
 *
 */
public interface Calcular {
	
	/**
	 * O m�todo �calcular� da interface �Calc�, quando sobrescrito:
	 * 
	 * i. Na classe Passeio: retornar� a soma das quantidades de letras
	 *  existentes em todos os atributos do tipo String;
	 * 
	 * 
	 */
	int calcular( Veiculo veiculo );
	
}
