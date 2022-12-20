package gestao_de_veiculos;

import java.util.ArrayList;
import java.util.List;


/**
 * @author Elvir Moraes
 * Ra: 02398150
 * Rio de Janeiro, 21/07/2022
 * UTFPR - Universidade Tecnol�gica Federal do Paran� 
 * 
 * Escopo de Ve�culos de Passeio.
 * 
 * 4) RESTRI��ES
 * a. N�O PERMITA QUE:
 * iv. Que as classes filhas (Passeio e Carga) sejam herdadas;
 */
public final class Passeio extends Veiculo implements Calcular{
	
	private int qtdPassageiros = 0;

	public Passeio() {}

	/**
	 * @param placa
	 * @param marca
	 * @param modelo
	 * @param cor
	 * @param velocMax
	 * @param qtdRodas
	 * @param qtdPassageiros
	 * @param qtdPist
	 * @param potencia
	 */
	public Passeio( // Veiculo
				String placa          , 
			        String marca          , 
			        String modelo         , 
			        String cor            , 
			        float  velocMax       , 
			        int    qtdRodas       ,
			        // Passeio = ""
			        int    qtdPassageiros ,
			        // Configura��es do Motor
			        int    qtdPist, 
			        int    potencia
			) throws VelocException {
		// TODO Construtor de Passeio sobrecarregado.
		this .setPlaca         ( placa          );
		this .setMarca         ( marca          );
		this .setModelo        ( modelo         );
		this .setCor           ( cor            );
		this .setVelocMax      ( 1, velocMax    );
		this .setQtdRodas      ( qtdRodas       );
		this .setQtdPassageiros( qtdPassageiros );
		this.setQtdPist        ( qtdPist        );
		this.setPotencia       ( potencia       );
	}
	
        public static List<Passeio> criaLista(){
            
            List<Passeio> listaPasseios = new ArrayList<>();
            
            listaPasseios.add( new Passeio( ) );
            
            return listaPasseios;
        }
        
        
	/**
	 * Use o m�todo calcVel(float velocMax), da classe-m�e, para fazer este c�lculo.
	 * Aten��o:
	 * O m�todo calcVel(float velocMax) N�O deve alterar o valor do atributo velocMax, apenas 
	 * convert�-lo e retornar o valor convertido para que seja exibido na tela por meio da classe Teste;
	 * 
	 */
// =============================================================================        
	@Override
	public final float calcVel( float velocMax ) {
		// TODO A velocidade do ve�culo de passeio dever� ser calculada em m/h;
		/// 1 kilometer/hour = 1000 meter/hour
		// retorna a velocidade do ve�culo de passeio calculada em m/h;
		return velocMax * 1000f;
	}
// =============================================================================        
	// recuperar a vari�vel de quantidade de passageiros.
	public int getQtdPassageiros() {
		return qtdPassageiros;
	}
// =============================================================================        
	// configura vari�vel de quantidade de passageiros.
	public final void setQtdPassageiros(int qtdPassageiros) {
		this.qtdPassageiros = qtdPassageiros;
	}
// =============================================================================
	/**
	 * O m�todo �calcular� da interface �Calc�, quando sobrescrito:
	 * 
	 * i. Na classe Passeio: retornar� a soma das quantidades de letras
	 *  existentes em todos os atributos do tipo String;
	 *  
	 * 4) RESTRI��ES -> a. N�O PERMITA QUE:
	 * iii. Sobrescrevam os m�todos das classes filhas (Passeio e Carga);
	 */
// =============================================================================        
	@Override
	public final int calcular( Veiculo veiculo ) {
		// TODO M�todo para calcular soma de quantidade de letras em todos atributos String.
		
		Passeio passeio = ( Passeio ) veiculo;
		
		int    somaPlaca      = passeio.getPlaca ( ).length( );
		int    somaMarca      = passeio.getMarca ( ).length( );
		int    somaModelo     = passeio.getModelo( ).length( );
		int    somaCor        = passeio.getCor   ( ).length( );
		// i. Na classe Passeio: retornar� a soma das quantidades de letras
		//    existentes em todos os atributos do tipo String;
		int    somaCaracteres = somaPlaca + somaMarca + somaModelo + somaCor;
		return somaCaracteres;
	}
        
        
}
