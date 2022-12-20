package gestao_de_veiculos;


/**
 * @author Elvir Moraes
 * Ra: 02398150
 * Rio de Janeiro, 21/07/2022
 * UTFPR - Universidade Tecnolï¿½gica Federal do Paranï¿½
 * 
 * Classe Abstrata para qualquer tipo de Veï¿½culo.
 * Classes abstratas não podem ser instanciadas nem pra foeach
 * Na list tem que fazer cast
 */
public abstract class Veiculo {
	
	// Dados em comum com qualquer tipo de veï¿½culo.
	private   String placa   = "";
	private   String marca   = "";
	private   String modelo  = "";
	private   String cor     = "";
	private   float velocMax = 0.0f;
	private   int   qtdRodas = 0;
	// protected Motor motor; // Nï¿½o pode declarar assim
	// Tem que passar por parï¿½metro as configuraï¿½ï¿½es do motor
	private   int qtdPist  = 0;
	private   int potencia = 0;
	// Construtor vazio
	public Veiculo() {}
	// com parametros
	public Veiculo( String placa, 
					String marca, 
					String modelo, 
					String cor, 
					float  velocMax, 
					int    qtdRodas, 
					// configuraï¿½ï¿½o do motor
					int    qtdPist, 
					int    potencia
					) {
		// TODO Construtor sobrecarregado de Veiculo.
		this.placa     =             placa;
		this.marca     =             marca;
		this.modelo    =             modelo;
		this.cor       =             cor;
		this.velocMax  =             velocMax;
		this.qtdRodas  =             qtdRodas;
		// O certo ï¿½ receber os valores do Motor pelo parï¿½metro 
		// e fazer o new Motor dentro do construtor
		Motor motor    = new Motor (          );
		motor          .setQtdPist ( qtdPist  );
		motor          .setPotencia( potencia );
		// motor = new Motor( qtdPis, potencia );
		
	}
	
	// Mï¿½todo para calcuar velocidade de veï¿½culos.
	public abstract float calcVel(float velocMax);
	
	public String getPlaca() {
		return ( placa == null )? "" : placa;
	}
	public String getMarca() {
		return marca;
	}
	public String getModelo() {
		return modelo;
	}
	public String getCor() {
		return cor;
	}
	public float getVelocMax() {
		return velocMax;
	}
	public int getQtdRodas() {
		return qtdRodas;
	}
	
	/**
	 * 4) RESTRIï¿½ï¿½ES -> a. Nï¿½O PERMITA QUE:
	 * ii. Sobrescrevam os mï¿½todos setters da classe Veiculo;
	 */
	public final void setPlaca( String placa ) {
		this.placa = placa;
	}
	public final void setMarca(String marca) {
		this.marca = marca;
	}
	public final void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public final void setCor(String cor) {
		this.cor = cor;
	}
        
        /**
         * 
         * @param velocMax
         * @throws VelocException 
         */
	public final void setVelocMax( int veiculo, float velocMax ) throws VelocException {
            
            if( veiculo == 1 ){
                try {
                    boolean veloc = VelocException.verifica( velocMax );
                    /** ii. Neste caso (apï¿½s disparar a exceï¿½ï¿½o), se estiver ï¿½tentandoï¿½ atribuir 
                     * velocidade para um carro de passeio, este deverï¿½ assumir 100 (Km/h 
                     * para velocidade mï¿½xima) se for um veï¿½culo de carga assumirï¿½ 90 Km/h;
                     */
                    this.velocMax = velocMax;
                } catch ( Exception e ) {
                    //System.out.println("Velocidade padrÃ£o Passeio.");
                    this.velocMax = 100.0f;
                }
            }else if( veiculo == 2 ){
                try {
                    boolean veloc = VelocException.verifica( velocMax );
                    /** ii. Neste caso (apï¿½s disparar a exceï¿½ï¿½o), se estiver ï¿½tentandoï¿½ atribuir 
                     * velocidade para um carro de passeio, este deverï¿½ assumir 100 (Km/h 
                     * para velocidade mï¿½xima) se for um veï¿½culo de carga assumirï¿½ 90 Km/h;
                     */
                    this.velocMax = velocMax;
                } catch ( Exception e ) {
                    //System.out.println("Velocidade padrï¿½o Carga.");
                    this.velocMax = 90.0f;
                }
            }
	}
	
        public final void setQtdRodas(int qtdRodas) {
		this.qtdRodas = qtdRodas;
	}
	
	// Motor
	public int getQtdPist() {
		return qtdPist;
	}
	public int getPotencia() {
		return potencia;
	}
	public final void setQtdPist(int qtdPist) {
		this.qtdPist = qtdPist;
	}
	public final void setPotencia(int potencia) {
		this.potencia = potencia;
	}
}
