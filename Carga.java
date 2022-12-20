package gestao_de_veiculos;

/**
 * @author Elvir Moraes
 * Ra: 02398150
 * Rio de Janeiro, 21/07/2022
 * UTFPR - Universidade Tecnol�gica Federal do Paran�
 * 
 * Escopo de Ve�culos de Carga.
 * 4) RESTRI��ES
 * a. N�O PERMITA QUE:
 * iv. Que as classes filhas (Passeio e Carga) sejam herdadas; 
 */
public final class Carga extends Veiculo implements Calcular {
	
	private int cargaMax = 0;
	private int tara     = 0;
	
	public Carga() {}

	public Carga( String placa, 
			      String marca, 
			      String modelo, 
			      String cor, 
			      float velocMax, 
			      int   qtdRodas, 
			      int   cargaMax, 
			      int   tara,      
			      int    qtdPist, 
			      int    potencia
			) throws VelocException {
		// TODO Construtor sobrecarregado de Carga
		
		this .setPlaca   ( placa    );
		this .setMarca   ( marca    );
		this .setModelo  ( modelo   );
		this .setCor     ( cor      );
		this .setVelocMax( 2, velocMax );
		this .setQtdRodas( qtdRodas );
		this .setCargaMax( cargaMax );
		this .setTara    ( tara     );
		this.setQtdPist  ( qtdPist  );
		this.setPotencia ( potencia );
	}

	public int getCargaMax() {
		return cargaMax;
	}

	public final void setCargaMax(int cargaMax) {
		this.cargaMax = cargaMax;
	}

	public int getTara() {
		return tara;
	}

	public final void setTara(int tara) {
		this.tara = tara;
	}

	/**
	 * Aten��o:
	 * O m�todo calcVel(float velocMax) N�O deve alterar o valor do atributo velocMax, apenas 
	 * convert�-lo e retornar o valor convertido para que seja exibido na tela por meio da classe Teste;
	 */
	@Override
	public final float calcVel( float velocMax ) {
		// TODO M�todo para calcular velocidade de ve�culo de carga.
		// A velocidade do ve�culo de carga dever� ser calculada em cm/h;
		// 1 kilometer/hour = 100000 centimeter/hour
		
		return velocMax * 100000f ;
	}

	/**
	 * 	/**
	 * O m�todo �calcular� da interface �Calc�, quando sobrescrito:
	 * 
	 * ii. Na classe Carga: retornar� a soma de todos os valores contidos nos
	 * atributos num�ricos.
	 * 
	 * 	 * 4) RESTRI��ES -> a. N�O PERMITA QUE:
	 * iii. Sobrescrevam os m�todos das classes filhas (Passeio e Carga);
	 */

	@Override
	public final int calcular( Veiculo veiculo ) {
		// TODO M�todo para calcular soma de quantidade de letras em todos atributos String.
		
		Carga  carga          = ( Carga ) veiculo;
		// ii. Na classe Carga: retornar� a soma de todos os valores contidos nos 
		// atributos num�ricos.
		int    somaCaracteres = carga.getCargaMax( ) + 
	                            carga.getTara    ( ) + 
	                            carga.getQtdRodas( ) + 
	                            carga.getQtdPist ( ) + 
                                carga.getPotencia( ) ;
		return somaCaracteres;
	}
}
