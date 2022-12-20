package gestao_de_veiculos;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneLayout;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Elvir Moraes.
 */
/**
 * @author D88P
 *
 */
public class Janela implements ActionListener {

    static Janela j = new Janela();

    public Janela( ) {
        // default
    }
    
    // Objetos de sistema
    static Passeio passeio = new Passeio( );
    static Carga   carga   = new Carga  ( );
    
    
    /**
     * Método principal.
     * 
     * Configura frames na inici
     * 
     * @param args
     */
    public static void main( String[] args ) {
        
    	// Carrega configurações de Frames incial.
    	
    	// 1º Frame
        frameGestaoDeVeiculos       ( );
        // 2º's Frame
        frameVeiculosDePasseio      ( );
        frameVeiculosDeCarga        ( );
        //3º's Frame
        frameCadastroDePasseio      ( );
        frameCadastroDeCarga        ( );
        // 4º's Frame
        frameConsExcPelaPlacaPasseio( );
        frameConsExcPelaPlacaCarga  ( );
        // 5º's Frame
        frameImpExcTodosPasseio     ( );
        frameImpExcTodosCarga       ( );
        
    }
    
    /**
     * Alinha itens do frame da esquerda para direita. 
     */
    static FlowLayout flowLayoutPadrao = new FlowLayout();
    
    static JFrame     frameGestaoDeVeiculos = new JFrame( );
    static JButton    btGestaoPasseio       = new JButton( );
    static JButton    btGestaoCarga         = new JButton( );
    static int        largura      = 300,  
                      altura       = 500; 
    /**
     * 
     * @return Frame inicial do sistema.
     */
    public static void frameGestaoDeVeiculos( ) {
        
    	frameGestaoDeVeiculos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameGestaoDeVeiculos.setTitle( "Gestao de Veiculos" );
        frameGestaoDeVeiculos.setSize ( largura, altura      );
        flowLayoutPadrao.setAlignment( FlowLayout.CENTER );
        
        btGestaoPasseio.setText( "Passeio" );
        btGestaoCarga   .setText( "Carga"   );
        
        frameGestaoDeVeiculos.add( btGestaoPasseio );
        frameGestaoDeVeiculos.add(btGestaoCarga    );
        
        btGestaoPasseio.addActionListener( j );
        btGestaoCarga   .addActionListener( j );
        
        
        frameGestaoDeVeiculos.setLayout ( flowLayoutPadrao  );
        frameGestaoDeVeiculos.setVisible( true );
    }

    // Frame Veiculos de Passeio.
    static JFrame  frameVeiculosDePasseio        =  new JFrame( );
    static JButton btCadastrarVeiculoDePasseio   = new JButton( );
    static JButton btConsExcluirPelaPlacaPasseio = new JButton( );
    static JButton btImprExcluirTodosPasseio     = new JButton( );
    static JButton btSairVeiculosDePasseio       = new JButton( );
    // Frame Veiculos de Passeio.
    public static void frameVeiculosDePasseio( ) {
    	frameVeiculosDePasseio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frameVeiculosDePasseio.setTitle    ( "Veiculos de Passeio" );
        frameVeiculosDePasseio.setSize     ( largura, altura       );
        flowLayoutPadrao      .setAlignment( FlowLayout.LEADING    );
        
        // BotÃµes Frame Veiculos de Passeio.
        btCadastrarVeiculoDePasseio  .setText( "Cadastrar"                    );
        btConsExcluirPelaPlacaPasseio.setText( "Consultar/Excluir pela Placa" );
        btImprExcluirTodosPasseio    .setText( "Imprimir /Excluir todos."     );
        btSairVeiculosDePasseio      .setText( "Sair"                         );
        frameVeiculosDePasseio.add( btCadastrarVeiculoDePasseio   );
        frameVeiculosDePasseio.add( btConsExcluirPelaPlacaPasseio );
        frameVeiculosDePasseio.add( btImprExcluirTodosPasseio     );
        frameVeiculosDePasseio.add( btSairVeiculosDePasseio       );
        // Escutar os BotÃµes Frame Veiculos de Passeio.
        btCadastrarVeiculoDePasseio  .addActionListener( j );
        btConsExcluirPelaPlacaPasseio.addActionListener( j );
        btImprExcluirTodosPasseio    .addActionListener( j );
        btSairVeiculosDePasseio      .addActionListener( j );
        
        frameVeiculosDePasseio.setLayout (flowLayoutPadrao );
    }
    
    // Frame Veiculos de Carga.
    static JFrame  frameVeiculosDeCarga      = new JFrame( );
    static JButton btCadastrarVeiculoDeCarga = new JButton( );
    static JButton btConsExcluirPlacaCarga   = new JButton( );
    static JButton btImprExcluirTodosCarga   = new JButton( );
    static JButton btSairCarga               = new JButton( );
    // Frame Veiculos de Carga.
    public static void frameVeiculosDeCarga( ) {
    	frameVeiculosDeCarga.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameVeiculosDeCarga.setTitle    ( "Veiculos de Carga" );
        frameVeiculosDeCarga.setSize     ( largura, altura     );
        flowLayoutPadrao    .setAlignment( FlowLayout.LEADING  );
        // BotÃµes Frame Veiculos de Carga
        btCadastrarVeiculoDeCarga.setText( "Cadastrar"                    );
        btConsExcluirPlacaCarga  .setText( "Consultar/Excluir pela Placa" );
        btImprExcluirTodosCarga  .setText( "Imprimir /Excluir todos."     );
        btSairCarga              .setText( "Sair"                         );
        frameVeiculosDeCarga.add( btCadastrarVeiculoDeCarga );
        frameVeiculosDeCarga.add( btConsExcluirPlacaCarga   );
        frameVeiculosDeCarga.add( btImprExcluirTodosCarga   );
        frameVeiculosDeCarga.add( btSairCarga               );
        // Escuta os BotÃµes Frame Veiculos De Carga.
        btCadastrarVeiculoDeCarga.addActionListener( j );
        btConsExcluirPlacaCarga  .addActionListener( j );
        btImprExcluirTodosCarga  .addActionListener( j );
        btSairCarga              .addActionListener( j );
        
        frameVeiculosDeCarga.setLayout ( flowLayoutPadrao );
        
    }
    
    /**
     * Método escuta evento dos botões.
     * @param e
     */
    public void actionPerformed( ActionEvent e ) {
 ///////////////////////////////////////////////////////////////////////////////       
        // Frame Gestao de Veiculos.
        if( e.getSource().equals( btGestaoPasseio ) ){
            frameGestaoDeVeiculos .setVisible( false );
            frameVeiculosDePasseio.setVisible( true );
            
        }else if( e.getSource().equals(btGestaoCarga ) ){
            frameGestaoDeVeiculos.setVisible( false );
            frameVeiculosDeCarga .setVisible( true  );
        }
        
//////////////////////////////////////////////////////////////////////////////// 
        // Frame Veiculos de Passeio
        else if( e.getSource() .equals( btCadastrarVeiculoDePasseio   ) ){

        	frameVeiculosDePasseio.setVisible( false );
            frameCadastroDePasseio.setVisible( true  );
            
        }else if( e.getSource().equals( btConsExcluirPelaPlacaPasseio ) ){
        	
        	limparFrameConsExcPelaPlacaDadosVars( veiculoDePasseio );
            
        	frameVeiculosDePasseio      .setVisible( false );
            frameConsExcPelaPlacaPasseio.setVisible( true  );
        }else if( e.getSource().equals( btImprExcluirTodosPasseio     ) ){
            frameVeiculosDePasseio .setVisible( false );
            frameImpExcTodosPasseio.setVisible( true  );
        }else if( e.getSource().equals( btSairVeiculosDePasseio       ) ){
            frameVeiculosDePasseio.setVisible( false );
            frameGestaoDeVeiculos.setVisible( true  );
        }
        
////////////////////////////////////////////////////////////////////////////////        
        // Frame Veiculos de Carga
        else if( e.getSource( ) .equals( btCadastrarVeiculoDeCarga ) ){
            frameVeiculosDeCarga.setVisible( false  );
            frameCadastroDeCarga.setVisible( true   );
        }else if( e.getSource( ).equals( btConsExcluirPlacaCarga   ) ){
           
        	limparFrameConsExcPelaPlacaDadosVars( veiculoDeCarga );
        	
        	frameVeiculosDeCarga      .setVisible( false );
            frameConsExcPelaPlacaCarga.setVisible( true  );
        }else if( e.getSource( ).equals( btImprExcluirTodosCarga   ) ){
            frameVeiculosDeCarga .setVisible( false );  
            frameImpExcTodosCarga.setVisible( true  );
        }else if( e.getSource( ).equals( btSairCarga               ) ){
            frameVeiculosDeCarga.setVisible( false );
            frameGestaoDeVeiculos.setVisible( true  );
        }
        
////////////////////////////////////////////////////////////////////////////////        
        // Frame Cadastro De Passeio
        else if( e.getSource( ).equals( btCadastrarCadastroDePasseio ) ){

        	cadastroDePasseio( );
        	
            
        }else if( e.getSource( ).equals( btLimparCadastroPasseio ) ){
            
            limparDadosCadastro( veiculoDePasseio );
            
        }else if( e.getSource( ).equals( btNovoCadastroPasseio    ) ){
            
            limparDadosCadastro( veiculoDePasseio );
            
        }else if( e.getSource( ).equals( btSairCadastroDePasseio ) ){
            //limparDadosCadastro( veiculoDePasseio );
            frameCadastroDePasseio.setVisible( false );
            limparDadosCadastro( veiculoDePasseio );
            frameVeiculosDePasseio.setVisible( true  );
        }
////////////////////////////////////////////////////////////////////////////////        
        // Frame Cadastro de Carga.
        else if( e.getSource( ).equals( btCadastrarCadastroDeCarga ) ){
            
        	cadastroDeCarga();
            
        	
        }else if( e.getSource( ).equals( btLimparCadastroDeCarga ) ){
            
            limparDadosCadastro( veiculoDeCarga );
            
        }else if( e.getSource( ).equals( btNovoCadastroDeCarga ) ){
            
            limparDadosCadastro( veiculoDeCarga );
            
        }else if( e.getSource( ).equals( btSairCadastroDeCarga ) ){
            
            frameCadastroDeCarga.setVisible( false );
            limparDadosCadastro( veiculoDeCarga );
            frameVeiculosDeCarga.setVisible( true  );
        }
        
///////////////////////////////////////////////////////////////////////////////
        
        // Frame Cosultar/Excluir pela Placa Passeio.
        else if ( e.getSource().equals( btConsultarConsExcPelaPlacaPasseio ) ){
        	
        	consultarPasseioPelaPlaca( );
                
                
            
            // BotÃ£o Excluir 
        }else if ( e.getSource().equals( btExcluirConsExcPelaPlacaPasseio  ) ){
            
        	excluirPasseioPelaPlaca( );
        	

            
        }else if( e.getSource().equals( btSairConsExcPelaPlacaPasseio     ) ){
            frameConsExcPelaPlacaPasseio.setVisible( false );
            frameVeiculosDePasseio      .setVisible( true  );
        }

        
//////////////////////////////////////////////////////////////////////////////////////////////////        
        // Frame Cosultar/Excluir pela Placa Carga.
        else if ( e.getSource().equals( btConsultarConsExcPelaPlacaCarga ) ){
        	
        	consultarCargaPelaPlaca();
            
        }else if ( e.getSource().equals( btExcluirConsExcPelaPlacaCarga  ) ){
           
        	excluirCargaPelaPlaca( );
            
        }else if( e.getSource().equals( btSairConsExcPelaPlacaCarga      ) ){
            frameConsExcPelaPlacaCarga.setVisible( false );
            frameVeiculosDeCarga      .setVisible( true  );
        }

        
////////////////////////////////////////////////////////////////////////////////////////////////////////////        
        // Frame Imprimir/Excluir todos Passeio.
        else if( e.getSource().equals( btImpTodosImpExcTodosPasseio ) ){
            
        	imprimirPasseio();
            
            
        }else if( e.getSource().equals( btExcTodosImpExcTodosPasseio ) ){
            
        	excluirTodosPasseio();
        	
        }else if( e.getSource().equals( btSairImpExcTodosPasseio    ) ){
        	//frameImpExcTodosPasseio.dispose();
        	frameImpExcTodosPasseio.setVisible( false );
            frameVeiculosDePasseio .setVisible( true  );
        }

        
///////////////////////////////////////////////////////////////////////////////////////////        
        // Frame Imprimir/Excluir todos Carga.
        else if( e.getSource().equals( btImpTodosImpExcTodosCarga ) ){
        	
            imprimirCarga();
            
            
        }else if( e.getSource().equals( btExcTodosImpExcTodosCarga ) ){
            
        	excluirTodosCarga();
        	
        }else if( e.getSource().equals( btSairImpExcTodosCarga    ) ){
            frameImpExcTodosCarga.setVisible( false );
            frameVeiculosDeCarga .setVisible( true  );
        }
        
    }
    // Fim ActionPerformed
    
//////////////////////////////////////////////////////////////////////////////////////
    
    
    public void excluirCargaPelaPlaca() {
		// TODO Auto-generated method stub

    	boolean preenchida = validaTextFieldsConsultaCarga( );
	
    	if ( preenchida ){
		
			System.out.println( "Entrou na variável preenchida ConsultarPasseioPelaPlaca" );
			
			carregaVariaveisConsultarVeiculoPelaPlaca( veiculoDeCarga );
	
			System.out.println( "Passou no carregarVariaveisConsultarVeiculosPelaPlacaPasseio" );
			
			
			removeObjConsultarVeiculoPelaPlaca( veiculoDeCarga );
			
			limparFrameConsExcPelaPlacaDadosVars( veiculoDeCarga );
			
		}
	}

	/**
     * Método para excluir Passeio pela Placa 
     */
    public void excluirPasseioPelaPlaca() {
		// TODO Auto-generated method stub
    	
    	boolean preenchida = validaTextFieldsConsultaPasseio( );
    	if ( preenchida ){
    		
    		System.out.println( "Entrou na variável preenchida ConsultarPasseioPelaPlaca: " + preenchida );
    		
    		carregaVariaveisConsultarVeiculoPelaPlaca( veiculoDePasseio );

    		System.out.println( "Passou no carregarVariaveisConsultarVeiculosPelaPlacaPasseio" );
    		
    		
    		removeObjConsultarVeiculoPelaPlaca( veiculoDePasseio );
    		
    		limparFrameConsExcPelaPlacaDadosVars( veiculoDePasseio );
    		
    	}
	}
    
    /**
     * Método para validar botão Excluir Passeio do Frame Consultar/Excluir pela Placa Passeio.
     * 
     * @return
     */
    public boolean validaTextFieldsExcluirPasseio( ){
        boolean txtPlacaPreenchida = false;
        	
        if( txtConsExcPlacPlacaPasseio.getText( ).isEmpty( ) ){
        	
           	System.out.println( "Entrou na Variável placaPasseio vazia = " + varConsPasseioPlacaPasseio );
           	JOptionPane.showMessageDialog( null, "Informe a Placa","Atenção", JOptionPane.OK_OPTION );
           	
        }else {
        	
        	varConsPasseioPlacaPasseio = txtConsExcPlacPlacaPasseio.getText( );
        	txtPlacaPreenchida = true;
        	System.out.println( "Entrou na Variável Preenchida placaPasseio = " + varConsPasseioPlacaPasseio );
        	System.out.println( "Alterar o valor pra true: " + txtPlacaPreenchida );
        	
        	for ( Passeio p1 : BDVeiculos.listaDePasseio ) {
        	 
        		if( p1.getPlaca().equals( varConsPasseioPlacaPasseio ) ) {
        	  
		        	varConsPasseioQtdPassageiros    = p1.getQtdPassageiros();
		        	varConsPasseioMarcaPasseio      = p1.getMarca();
		        	varConsPasseioModeloPasseio     = p1.getModelo();
		        	varConsPasseioCorPasseio        = p1.getCor();
		        	varConsPasseioVelocMaxPasseio   = p1.getVelocMax();
		        	varConsPasseioQtdRodasPasseio   = p1.getQtdRodas();
		        	varConsPasseioQtdPistoesPasseio = p1.getQtdPist();
		        	varConsPasseioPotenciaPasseio   = p1.getPotencia();
        	  
        		}
        	}
        }
        return txtPlacaPreenchida;
    }

	/**
	 * Exclusão
	 * @param veiculo
	 */
	public void removeObjConsultarVeiculoPelaPlaca( int passeio ) {
		// TODO Auto-generated method stub
		System.out.println("Entrou no removeObjConsultarVeiculoPelaPlaca: " + passeio );
		
		for (Iterator<Passeio> p = BDVeiculos.listaDePasseio.iterator(); p.hasNext();) {
			Passeio removeEsse = (Passeio) p.next();
			if ( removeEsse.getPlaca( ).equals( varConsPasseioPlacaPasseio ) ) {
				p.remove();
			}
		}
	}

	/**
     * Método Botão Consultar/Excluir pela Placa. 
     */
    public void consultarPasseioPelaPlaca( ) {
		// TODO 
    	
    	boolean preenchida = validaTextFieldsConsultaPasseio( );
    	if ( preenchida ){
    		
    		System.out.println( "Entrou na variável preenchida ConsultarPasseioPelaPlaca" );
    		
    		System.out.println( "Passou no carregarVariaveisConsultarVeiculosPelaPlacaPasseio" );
    		
    		if( 
    				varConsPasseioPlacaPasseio      .isEmpty() ||
    				varConsPasseioQtdPassageiros    == 0       ||
    				varConsPasseioMarcaPasseio      .isEmpty() ||
    				varConsPasseioModeloPasseio     .isEmpty() ||
    				varConsPasseioCorPasseio        .isEmpty() ||
    				varConsPasseioQtdRodasPasseio   == 0       ||
    				varConsPasseioVelocMaxPasseio   == 0       ||
    				varConsPasseioQtdPistoesPasseio == 0       ||
    				varConsPasseioPotenciaPasseio   == 0       ){
    			
    			
    		}else {
    			
    			txtConsExcPlacPlacaPasseio     .setText(                 varConsPasseioPlacaPasseio        );
    			txtConsExcPlacQtdPassageiros   .setText( String.valueOf( varConsPasseioQtdPassageiros    ) );
    			txtConsExcPlacMarcaPasseio     .setText(                 varConsPasseioMarcaPasseio        );
    			txtConsExcPlacModeloPasseio    .setText(                 varConsPasseioModeloPasseio       );
    			txtConsExcPlacCorPasseio       .setText(                 varConsPasseioCorPasseio          );
    			txtConsExcPlacQtdRodasPasseio  .setText( String.valueOf( varConsPasseioQtdRodasPasseio   ) );
    			txtConsExcPlacVelocMaxPasseio  .setText( String.valueOf( varConsPasseioVelocMaxPasseio   ) );
    			txtConsExcPlacQtdPistoesPasseio.setText( String.valueOf( varConsPasseioQtdPistoesPasseio ) );
    			txtConsExcPlacPotenciaPasseio  .setText( String.valueOf( varConsPasseioPotenciaPasseio   ) );
    			
    		}
    	}
	}

    public void consultarCargaPelaPlaca( ) {
 		// TODO Método consulta a placa e recarrega objeto Passeio do sistema
     	
     	boolean preenchida = validaTextFieldsConsultaCarga( );
     	if ( preenchida ){
     		System.out.println( "Entrou na variável preenchida ConsultarCargaPelaPlaca" );
     		
     		if( 
     				varConsCargaPlacaCarga       .isEmpty() ||
     				varConsCargaTaraCarga        == 0       ||
     				varConsCargaCargaMaximaCarga == 0       ||
     				varConsCargaMarcaCarga      .isEmpty()  ||
     				varConsCargaModeloCarga     .isEmpty()  ||
     				varConsCargaCorCarga        .isEmpty()  ||
     				varConsCargaQtdRodasCarga   == 0        ||
     				varConsCargaVelocMaxCarga   == 0        ||
     				varConsCargaQtdPistoesCarga == 0        ||
     				varConsCargaPotenciaCarga   == 0        ){
     			
     			// Não preencher
     			
     		}else {
     			
     			txtConsExcPlacPlacaCarga      .setText(                 varConsCargaPlacaCarga         );  
     			txtConsExcPlacTaraCarga       .setText( String.valueOf( varConsCargaTaraCarga        ) );  
     			txtConsExcPlacCargaMaximaCarga.setText( String.valueOf( varConsCargaCargaMaximaCarga ) );  
     			txtConsExcPlacMarcaCarga      .setText(                 varConsCargaMarcaCarga         );  
     			txtConsExcPlacModeloCarga     .setText(                 varConsCargaModeloCarga        );  
     			txtConsExcPlacCorCarga        .setText(                 varConsCargaCorCarga           );  
     			txtConsExcPlacQtdRodasCarga   .setText( String.valueOf( varConsCargaQtdRodasCarga    ) );  
     			txtConsExcPlacVelocMaxCarga   .setText( String.valueOf( varConsCargaVelocMaxCarga    ) );  
     			txtConsExcPlacQtdPistoesCarga .setText( String.valueOf( varConsCargaQtdPistoesCarga  ) );  
     			txtConsExcPlacPotenciaCarga   .setText( String.valueOf( varConsCargaPotenciaCarga    ) );  
     			
     		}
     	}
 	}
    
    
	/**
	 * Método recarrega variáveis TextFields dos Frames Consultar/Escluir pela Placa,
	 * à partir das variáveis.
	 * 
	 * @param veiculo indica o tipo de veículo a ser tratado.
	 */
	public void carregaFrameConsultarVeiculoPelaPlaca( int veiculo ) {
		// TODO Método recarrega variáveis TextFields dos Frames Consultar/Escluir pela Placa. 
		switch ( veiculo ) {
		case 1:
			
			txtConsExcPlacPlacaPasseio     .setText(                 varConsPasseioPlacaPasseio        );
			txtConsExcPlacQtdPassageiros   .setText( String.valueOf( varConsPasseioQtdPassageiros    ) );
			txtConsExcPlacMarcaPasseio     .setText(                 varConsPasseioMarcaPasseio        );
			txtConsExcPlacModeloPasseio    .setText(                 varConsPasseioModeloPasseio       );
			txtConsExcPlacCorPasseio       .setText(                 varConsPasseioCorPasseio          );
			txtConsExcPlacQtdRodasPasseio  .setText( String.valueOf( varConsPasseioQtdRodasPasseio   ) );
			txtConsExcPlacVelocMaxPasseio  .setText( String.valueOf( varConsPasseioVelocMaxPasseio   ) );
			txtConsExcPlacQtdPistoesPasseio.setText( String.valueOf( varConsPasseioQtdPistoesPasseio ) );
			txtConsExcPlacPotenciaPasseio  .setText( String.valueOf( varConsPasseioPotenciaPasseio   ) );
			
			break;

		case 2:
			
			txtConsExcPlacPlacaCarga      .setText(                 varConsCargaPlacaCarga         );    
			txtConsExcPlacTaraCarga       .setText( String.valueOf( varConsCargaTaraCarga        ) );
			txtConsExcPlacCargaMaximaCarga.setText( String.valueOf( varConsCargaCargaMaximaCarga ) );
			txtConsExcPlacMarcaCarga      .setText(                 varConsCargaMarcaCarga         );
			txtConsExcPlacModeloCarga     .setText(                 varConsCargaModeloCarga        );
			txtConsExcPlacCorCarga        .setText(                 varConsCargaCorCarga           );
			txtConsExcPlacQtdRodasCarga   .setText( String.valueOf( varConsCargaQtdRodasCarga    ) );
			txtConsExcPlacVelocMaxCarga   .setText( String.valueOf( varConsCargaVelocMaxCarga    ) );
			txtConsExcPlacQtdPistoesCarga .setText( String.valueOf( varConsCargaQtdPistoesCarga  ) );
			txtConsExcPlacPotenciaCarga   .setText( String.valueOf( varConsCargaPotenciaCarga    ) );
			
			break;
		}
	}

	/**
	 * Método recarrega variáveis de Objetos Passeio e Carga do Sistema.
	 * à partir de objeto passeio já cadastrado na listaDePasseio.
	 * @param veiculo
	 */
	public void carregaVariaveisConsultarVeiculoPelaPlaca( int veiculo ) {
		// TODO Método carrega variáveis de Sistema.
		
		System.out.println( "Entrou carregaVariveisConsultarVeiculoPelaPlaca: " + veiculo );
		
		if( veiculo == 1 ) {
			System.out.println( "Entrou no igual a 1 == " + veiculo );
			
			// Tá cheio ou vazio.
			if( BDVeiculos.listaDePasseio.size() != 0 ) {
				for ( Passeio p1 : BDVeiculos.listaDePasseio ) {
					
					System.out.println("Entrou no Iterator carregaVariaveisConsultarVeiculoPelaPlaca: " + p1.getPlaca());
					
					if( varConsPasseioPlacaPasseio.equals( p1.getPlaca() ) ) {
						
						System.out.println( "Entrou no if placa armazenada: "+ p1.getPlaca() + " == " + varConsPasseioPlacaPasseio + " Preenchida");
						
						
						varConsPasseioQtdPassageiros    = p1.getQtdPassageiros();
						varConsPasseioMarcaPasseio      = p1.getMarca();
						varConsPasseioModeloPasseio     = p1.getModelo();
						varConsPasseioCorPasseio        = p1.getCor();
						varConsPasseioVelocMaxPasseio   = p1.getVelocMax();
						varConsPasseioQtdRodasPasseio   = p1.getQtdRodas();
						varConsPasseioQtdPistoesPasseio = p1.getQtdPist();
						varConsPasseioPotenciaPasseio   = p1.getPotencia();
						
					}
				}
			}else {
				
				System.out.println( "Sem veículos cadastrado " + BDVeiculos.listaDePasseio.size() );
			}
		}
			
		else if( veiculo == 2 ) {
			
			System.out.println( "Entrou no igual a 2 == " + veiculo );
			
			// Tá cheio ou vazio.
			if( BDVeiculos.listaDeCarga.size() != 0 ) {
				for ( Carga c1 : BDVeiculos.listaDeCarga ) {
					
					System.out.println("Entrou no Iterator carregaVariaveisConsultarVeiculoPelaPlaca: " + varConsCargaPlacaCarga);
					if( varConsCargaPlacaCarga.equals( c1.getPlaca() ) ) {
						
						varConsCargaTaraCarga        = c1.getTara();
						varConsCargaCargaMaximaCarga = c1.getCargaMax();
						varConsCargaMarcaCarga       = c1.getMarca();
						varConsCargaModeloCarga      = c1.getModelo();
						varConsCargaCorCarga         = c1.getCor();
						varConsCargaVelocMaxCarga    = c1.getVelocMax();
						varConsCargaQtdRodasCarga    = c1.getQtdRodas();
						varConsCargaQtdPistoesCarga  = c1.getQtdPist();
						varConsCargaPotenciaCarga    = c1.getPotencia();
					}
				}
			} else {
				
				System.out.println( "Sem veículos cadastrado " + BDVeiculos.listaDeCarga.size() );
			}
		}
	}

	// Frame Cadastro de Passeio.
    static JFrame     frameCadastroDePasseio  = new JFrame( "Cadastro de Passeio" );
    //
    static JLabel     labelPlacaPasseio       = new JLabel( "Placa: "             );
    static JLabel     labelQtdPassageiros     = new JLabel( "Qtd.Passageiros: "   );
    static JLabel     labelMarcaPasseio       = new JLabel( "Marca: "             );
    static JLabel     labelModeloPasseio      = new JLabel( "Modelo: "            );
    static JLabel     labelCorPasseio         = new JLabel( "Cor: "               );
    static JLabel     labelQtdRodasPasseio    = new JLabel( "Qtd. Rodas"          );
    static JLabel     labelVelocMaxPasseio    = new JLabel( "Velocidade Máx.: "   );
    static JLabel     labelQtdPistoesPasseio  = new JLabel( "Qtd. Pistões: "      );
    static JLabel     labelPotenciaPasseio    = new JLabel( "Potência: "          );
    // 
    static JTextField txtCadPasseioPlacaPasseio         = new JTextField( 20 );
    static JTextField txtCadPasseioQtdPassageiros       = new JTextField( 20 );
    static JTextField txtCadPasseioMarcaPasseio         = new JTextField( 20 );
    static JTextField txtCadPasseioModeloPasseio        = new JTextField( 20 );
    static JTextField txtCadPasseioCorPasseio           = new JTextField( 20 );
    static JTextField txtCadPasseioQtdRodasPasseio      = new JTextField( 20 );
    static JTextField txtCadPasseioVelocMaxPasseio      = new JTextField( 20 );
    static JTextField txtCadPasseioQtdPistoesPasseio    = new JTextField( 20 );
    static JTextField txtCadPasseioPotenciaPasseio      = new JTextField( 20 );
    // BotÃ´es FormulÃ¡rio de Cadastro Veiculo de Passeio.
    static JButton    btCadastrarCadastroDePasseio = new JButton( "Cadastrar" );
    static JButton    btLimparCadastroPasseio      = new JButton( "Limpar"    );
    static JButton    btNovoCadastroPasseio        = new JButton( "Novo"      );        
    static JButton    btSairCadastroDePasseio      = new JButton( "Sair"      );
    
    /**
     * Var's cadPasseio usadas nos botões/métodos cadastrarPasseio,
     * limparPasseio, novoPasseio, sairPasseio                     
     * Frame Cadastro de Passeio.
     */
    static String varCadPasseioPlacaPasseio      = "";
    static int    varCadPasseioQtdPassageiros    = 0;
    static String varCadPasseioMarcaPasseio      = "";
    static String varCadPasseioModeloPasseio     = "";
    static String varCadPasseioCorPasseio        = "";
    static float  varCadPasseioVelocMaxPasseio   = 0.0f;
    static int    varCadPasseioQtdRodasPasseio   = 0;
    static int    varCadPasseioQtdPistoesPasseio = 0;
    static int    varCadPasseioPotenciaPasseio   = 0;
    
    /**
     * Cada frame deve ter suas próprias variáveis como prevenção à perca de 
     * referências por variáveis compartilhadas. 
     */
    public static void frameCadastroDePasseio( ) {
        //configFormularioCadastroVeiculos( veiculoDePasseio );
    	frameCadastroDePasseio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameCadastroDePasseio.setSize ( largura, altura       );
        
        txtCadPasseioPlacaPasseio     .setEditable( true  );
        txtCadPasseioQtdPassageiros   .setEditable( true );
        txtCadPasseioMarcaPasseio     .setEditable( true );
        txtCadPasseioModeloPasseio    .setEditable( true );
        txtCadPasseioCorPasseio       .setEditable( true );
        txtCadPasseioQtdRodasPasseio  .setEditable( true );
        txtCadPasseioVelocMaxPasseio  .setEditable( true );
        txtCadPasseioQtdPistoesPasseio.setEditable( true );
        txtCadPasseioPotenciaPasseio  .setEditable( true );
        
        // Itens do Frame Cadastro de Passeio. Labels e TextFields.
        
        frameCadastroDePasseio.add( labelPlacaPasseio              );
        frameCadastroDePasseio.add( txtCadPasseioPlacaPasseio      );
        frameCadastroDePasseio.add( labelQtdPassageiros            );
        frameCadastroDePasseio.add( txtCadPasseioQtdPassageiros    );
        frameCadastroDePasseio.add( labelMarcaPasseio              );
        frameCadastroDePasseio.add( txtCadPasseioMarcaPasseio      );
        frameCadastroDePasseio.add( labelModeloPasseio             );
        frameCadastroDePasseio.add( txtCadPasseioModeloPasseio     );
        frameCadastroDePasseio.add( labelCorPasseio                );
        frameCadastroDePasseio.add( txtCadPasseioCorPasseio        );
        frameCadastroDePasseio.add( labelQtdRodasPasseio           );
        frameCadastroDePasseio.add( txtCadPasseioQtdRodasPasseio   );
        frameCadastroDePasseio.add( labelVelocMaxPasseio           );
        frameCadastroDePasseio.add( txtCadPasseioVelocMaxPasseio   );
        frameCadastroDePasseio.add( labelQtdPistoesPasseio         );
        frameCadastroDePasseio.add( txtCadPasseioQtdPistoesPasseio );
        frameCadastroDePasseio.add( labelPotenciaPasseio           );
        frameCadastroDePasseio.add( txtCadPasseioPotenciaPasseio   );
        
        
        // BotÃµes FormulÃ¡rio Cadastro Veiculos de Passeio.
        frameCadastroDePasseio.add( btCadastrarCadastroDePasseio );
        frameCadastroDePasseio.add( btLimparCadastroPasseio      );
        frameCadastroDePasseio.add( btNovoCadastroPasseio        );
        frameCadastroDePasseio.add( btSairCadastroDePasseio      );

        // Na escuta
        btCadastrarCadastroDePasseio.addActionListener( j );
        btLimparCadastroPasseio     .addActionListener( j );
        btNovoCadastroPasseio       .addActionListener( j );
        btSairCadastroDePasseio     .addActionListener( j );
        
        frameCadastroDePasseio.setLayout ( flowLayoutPadrao );
        
    }// Fim MÃ©todo JFrame Cadastro de passeio.

////////////////////////////////////////////////////////////////////////////////
    
    // Frame Consultar / Excluir pela Placa Passeio.
    static JFrame  frameConsExcPelaPlacaPasseio     = new JFrame( "Consultar/Excluir pela Placa Passeio" );
    //
    static JLabel labelConsExcPlacPlacaPasseio      = new JLabel( "Informe a Placa: " );
    static JLabel labelConsExcPlacQtdPass           = new JLabel( "Qtd.Passageiros: " );
    static JLabel labelConsExcPlacMarcaPasseio      = new JLabel( "Marca: "           );
    static JLabel labelConsExcPlacModeloPasseio     = new JLabel( "Modelo: "          );
    static JLabel labelConsExcPlacCorPasseio        = new JLabel( "Cor: "             );
    static JLabel labelConsExcPlacQtdRodasPasseio   = new JLabel( "Qtd. Rodas"        );
    static JLabel labelConsExcPlacVelocMaxPasseio   = new JLabel( "Velocidade Máx.: " );
    static JLabel labelConsExcPlacQtdPistoesPasseio = new JLabel( "Qtd. Pistões: "    );
    static JLabel labelConsExcPlacPotenciaPasseio   = new JLabel( "Potência: "        );
    // 
    static JButton btConsultarConsExcPelaPlacaPasseio = new JButton( "Consultar" );
    static JButton btExcluirConsExcPelaPlacaPasseio   = new JButton( "Excluir"   );
    static JButton btSairConsExcPelaPlacaPasseio      = new JButton( "Sair"      );
    
    static JTextField txtConsExcPlacPlacaPasseio      = new JTextField( 20 );
    static JTextField txtConsExcPlacQtdPassageiros    = new JTextField( 20 );
    static JTextField txtConsExcPlacMarcaPasseio      = new JTextField( 20 );
    static JTextField txtConsExcPlacModeloPasseio     = new JTextField( 20 );
    static JTextField txtConsExcPlacCorPasseio        = new JTextField( 20 );
    static JTextField txtConsExcPlacQtdRodasPasseio   = new JTextField( 20 );
    static JTextField txtConsExcPlacVelocMaxPasseio   = new JTextField( 20 );
    static JTextField txtConsExcPlacQtdPistoesPasseio = new JTextField( 20 );
    static JTextField txtConsExcPlacPotenciaPasseio   = new JTextField( 20 );
    

    // Variáveis dos objetos Passeio e Carga do Sistema.
    // Passeio
    static String varConsPasseioPlacaPasseio      = "";
    static int    varConsPasseioQtdPassageiros    = 0;
    static String varConsPasseioMarcaPasseio      = "";
    static String varConsPasseioModeloPasseio     = "";
    static String varConsPasseioCorPasseio        = "";
    static float  varConsPasseioVelocMaxPasseio   = 0.0f;
    static int    varConsPasseioQtdRodasPasseio   = 0;
    static int    varConsPasseioQtdPistoesPasseio = 0;
    static int    varConsPasseioPotenciaPasseio   = 0;

    
    /**
     * Método adiciona itens ao Frame Consultar/Excluir pela Placa Passeio. 
     */
    public static void  frameConsExcPelaPlacaPasseio( ) {
    	frameConsExcPelaPlacaPasseio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frameConsExcPelaPlacaPasseio.setSize ( largura, altura                );

        txtConsExcPlacPlacaPasseio     .setEditable( true  );
        txtConsExcPlacQtdPassageiros   .setEditable( false );
        txtConsExcPlacMarcaPasseio     .setEditable( false );
        txtConsExcPlacModeloPasseio    .setEditable( false );
        txtConsExcPlacCorPasseio       .setEditable( false );
        txtConsExcPlacQtdRodasPasseio  .setEditable( false );
        txtConsExcPlacVelocMaxPasseio  .setEditable( false );
        txtConsExcPlacQtdPistoesPasseio.setEditable( false );
        txtConsExcPlacPotenciaPasseio  .setEditable( false );
        
        frameConsExcPelaPlacaPasseio.add(   labelConsExcPlacPlacaPasseio      );
        frameConsExcPelaPlacaPasseio.add(   txtConsExcPlacPlacaPasseio        );
        frameConsExcPelaPlacaPasseio.add(   labelConsExcPlacQtdPass           );
        frameConsExcPelaPlacaPasseio.add(   txtConsExcPlacQtdPassageiros      );
        frameConsExcPelaPlacaPasseio.add(   labelConsExcPlacMarcaPasseio      );
        frameConsExcPelaPlacaPasseio.add(   txtConsExcPlacMarcaPasseio        );
        frameConsExcPelaPlacaPasseio.add(   labelConsExcPlacModeloPasseio     );
        frameConsExcPelaPlacaPasseio.add(   txtConsExcPlacModeloPasseio       );
        frameConsExcPelaPlacaPasseio.add(   labelConsExcPlacCorPasseio        );
        frameConsExcPelaPlacaPasseio.add(   txtConsExcPlacCorPasseio          );
        frameConsExcPelaPlacaPasseio.add(   labelConsExcPlacQtdRodasPasseio   );
        frameConsExcPelaPlacaPasseio.add(   txtConsExcPlacQtdRodasPasseio     );
        frameConsExcPelaPlacaPasseio.add(   labelConsExcPlacVelocMaxPasseio   );
        frameConsExcPelaPlacaPasseio.add(   txtConsExcPlacVelocMaxPasseio     );
        frameConsExcPelaPlacaPasseio.add(   labelConsExcPlacQtdPistoesPasseio );
        frameConsExcPelaPlacaPasseio.add(   txtConsExcPlacQtdPistoesPasseio   );
        frameConsExcPelaPlacaPasseio.add(   labelConsExcPlacPotenciaPasseio   );
        frameConsExcPelaPlacaPasseio.add(   txtConsExcPlacPotenciaPasseio     );
        
        // Botões
        frameConsExcPelaPlacaPasseio.add( btConsultarConsExcPelaPlacaPasseio );
        frameConsExcPelaPlacaPasseio.add( btExcluirConsExcPelaPlacaPasseio   );
        frameConsExcPelaPlacaPasseio.add( btSairConsExcPelaPlacaPasseio      );
        
        btConsultarConsExcPelaPlacaPasseio.addActionListener( j );
        btExcluirConsExcPelaPlacaPasseio  .addActionListener( j );
        btSairConsExcPelaPlacaPasseio     .addActionListener( j );
        
        frameConsExcPelaPlacaPasseio.setLayout (flowLayoutPadrao );
    }

    
    // Variáveis dos objetos Passeio e Carga do Sistema.
    // Passeio
    static String varImpExcPasseioPlacaPasseio      =   "";
    static int    varImpExcPasseioQtdPassageiros    =   0;
    static String varImpExcPasseioMarcaPasseio      =   "";
    static String varImpExcPasseioModeloPasseio     =   "";
    static String varImpExcPasseioCorPasseio        =   "";
    static float  varImpExcPasseioVelocMaxPasseio   =   0.0f;
    static int    varImpExcPasseioQtdRodasPasseio   =   0;
    static int    varImpExcPasseioQtdPistoesPasseio =   0;
    static int    varImpExcPasseioPotenciaPasseio   =   0;
    
    static String[] colunasPasseio = { "Placa: "          ,
                                       "Qtd.Passageiros: ",
                                       "Marca: "          ,
                                       "Modelo: "         ,
                                       "Cor: "            ,
                                       "Qtd. Rodas"       ,
                                       "Velocidade Máx.: ",
                                       "Qtd. Pistões: "   ,
                                       "Potência: "       };
    
    static String[] colunasCarga   = { "Placa: "          ,
                                       "Tara: "           ,
                                       "Carga Máxima"     ,
                                       "Marca: "          ,
                                       "Modelo: "         ,
                                       "Cor: "            ,
                                       "Qtd. Rodas"       ,
                                       "Velocidade Máx.: ",
                                       "Qtd. Pistões: "   ,
                                       "Potência: "       };
    // Verificar se isso vai funcionar.
    static DefaultTableModel modeloTabelaPasseio             = new DefaultTableModel( colunasPasseio, 0 );
    static DefaultTableModel modeloTabelaCarga               = new DefaultTableModel( colunasCarga  , 0 );
    
    // Tabela Passeio
    static JTable            tableDadosPassseio        = new JTable           ( modeloTabelaPasseio     );
    static JScrollPane       barraRolagemListaPasseio  = new JScrollPane      ( tableDadosPassseio      );
    // Tabela Carga
    static JTable            tableDadosCarga         = new JTable           ( modeloTabelaCarga     );
    static JScrollPane       barraRolagemListaCarga  = new JScrollPane      ( tableDadosCarga       );
    

    // Imprimir/Excluir Todos
    static JFrame  frameImpExcTodosPasseio     = new JFrame( "Imprimir/Excluir Todos" );
    // Botões
    static JButton btImpTodosImpExcTodosPasseio = new JButton( "Imprimir Todos" );
    static JButton btExcTodosImpExcTodosPasseio = new JButton( "Excluir Todos"  );
    static JButton btSairImpExcTodosPasseio     = new JButton( "Sair"           );
    
    public static void frameImpExcTodosPasseio( ) {
    	frameImpExcTodosPasseio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	//frameImpExcTodosPasseio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameImpExcTodosPasseio.setLayout(new GridLayout(4,1,10,10));
        frameImpExcTodosPasseio.setSize( 800,600);
        frameImpExcTodosPasseio.getContentPane().setBackground( Color.WHITE );

        // Tabela.
        barraRolagemListaPasseio.setLayout( new ScrollPaneLayout( ) );
        barraRolagemListaPasseio.setPreferredSize( new Dimension( 700, 500 ) );
        frameImpExcTodosPasseio.add( barraRolagemListaPasseio );
        
        // Botões
        frameImpExcTodosPasseio.add( btImpTodosImpExcTodosPasseio );
        frameImpExcTodosPasseio.add( btExcTodosImpExcTodosPasseio );
        frameImpExcTodosPasseio.add( btSairImpExcTodosPasseio     );
        // na escuta
        btImpTodosImpExcTodosPasseio.addActionListener( j );
        btExcTodosImpExcTodosPasseio.addActionListener( j );
        btSairImpExcTodosPasseio    .addActionListener( j );
        
        frameImpExcTodosPasseio .setLayout( new FlowLayout( ) );
        
    }
    
    // Frame Cadastro de Carga.
    static JFrame     frameCadastroDeCarga  = new JFrame( "Cadastro de Carga" );
    // Rótulos para campos de texto.
    static JLabel     labelPlacaCarga       = new JLabel( "Placa: "           );
    static JLabel     labelTaraCarga        = new JLabel( "Tara: "            );
    static JLabel     labelCargaMaximaCarga = new JLabel( "Carga Máxima.: "   );
    static JLabel     labelMarcaCarga       = new JLabel( "Marca: "           );
    static JLabel     labelModeloCarga      = new JLabel( "Modelo: "          );
    static JLabel     labelCorCarga         = new JLabel( "Cor: "             );
    static JLabel     labelQtdRodasCarga    = new JLabel( "Qtd. Rodas"        );
    static JLabel     labelVelocMaxCarga    = new JLabel( "Velocidade Máx.: " );
    static JLabel     labelQtdPistoesCarga  = new JLabel( "Qtd. Pistões: "    );
    static JLabel     labelPotenciaCarga    = new JLabel( "Potência: "        );
    // Campos de entrada de texto.
    static JTextField txtCadCargaPlacaCarga         = new JTextField( 20 );
    static JTextField txtCadCargaTaraCarga          = new JTextField( 20 );
    static JTextField txtCadCargaCargaMaximaCarga   = new JTextField( 20 );
    static JTextField txtCadCargaMarcaCarga         = new JTextField( 20 );
    static JTextField txtCadCargaModeloCarga        = new JTextField( 20 );
    static JTextField txtCadCargaCorCarga           = new JTextField( 20 );
    static JTextField txtCadCargaQtdRodasCarga      = new JTextField( 20 );
    static JTextField txtCadCargaVelocMaxCarga      = new JTextField( 20 );
    static JTextField txtCadCargaQtdPistoesCarga    = new JTextField( 20 );
    static JTextField txtCadCargaPotenciaCarga      = new JTextField( 20 );
    // Botões Frame de Cadastro de Carga.
    static JButton    btCadastrarCadastroDeCarga = new JButton( "Cadastrar" );
    static JButton    btLimparCadastroDeCarga    = new JButton( "Limpar"    );
    static JButton    btNovoCadastroDeCarga      = new JButton( "Novo"      );        
    static JButton    btSairCadastroDeCarga      = new JButton( "Sair"      ); 
    
    // Carga
    static String varCadCargaPlacaCarga       = "";
    static int    varCadCargaTaraCarga        = 0;
    static int    varCadCargaCargaMaximaCarga = 0;
    static String varCadCargaMarcaCarga       = "";
    static String varCadCargaModeloCarga      = "";
    static String varCadCargaCorCarga         = "";
    static int    varCadCargaQtdRodasCarga    = 0;
    static float  varCadCargaVelocMaxCarga    = 0.0f;
    static int    varCadCargaQtdPistoesCarga  = 0;
    static int    varCadCargaPotenciaCarga    = 0;
    
    /**
     * Método para carregar configurações do Frame Cadastro de Carga.
     */
    public static void frameCadastroDeCarga( ) {
    	frameCadastroDeCarga.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frameCadastroDeCarga.setSize ( largura, altura     );
        
        // Itens do Frame Cadastro de Carga.
        frameCadastroDeCarga.add( labelTaraCarga        );
        frameCadastroDeCarga.add( txtCadCargaTaraCarga          );
        frameCadastroDeCarga.add( labelCargaMaximaCarga );
        frameCadastroDeCarga.add( txtCadCargaCargaMaximaCarga   );
        frameCadastroDeCarga.add( labelPlacaCarga       );
        frameCadastroDeCarga.add( txtCadCargaPlacaCarga         );
        frameCadastroDeCarga.add( labelMarcaCarga       );
        frameCadastroDeCarga.add( txtCadCargaMarcaCarga         );
        frameCadastroDeCarga.add( labelModeloCarga      );
        frameCadastroDeCarga.add( txtCadCargaModeloCarga        );
        frameCadastroDeCarga.add( labelCorCarga         );
        frameCadastroDeCarga.add( txtCadCargaCorCarga           );
        frameCadastroDeCarga.add( labelQtdRodasCarga    );
        frameCadastroDeCarga.add( txtCadCargaQtdRodasCarga      );
        frameCadastroDeCarga.add( labelVelocMaxCarga    );
        frameCadastroDeCarga.add( txtCadCargaVelocMaxCarga      );
        frameCadastroDeCarga.add( labelQtdPistoesCarga  );
        frameCadastroDeCarga.add( txtCadCargaQtdPistoesCarga    );
        frameCadastroDeCarga.add( labelPotenciaCarga    );
        frameCadastroDeCarga.add( txtCadCargaPotenciaCarga      );
        
        // Botões Frame Cadastro de Carga.
        frameCadastroDeCarga.add( btCadastrarCadastroDeCarga );
        frameCadastroDeCarga.add( btLimparCadastroDeCarga    );
        frameCadastroDeCarga.add( btNovoCadastroDeCarga      );
        frameCadastroDeCarga.add( btSairCadastroDeCarga      );
        // Escutar BotÃµes Frame Cadastro de Carga.
        btCadastrarCadastroDeCarga.addActionListener( j );
        btLimparCadastroDeCarga   .addActionListener( j );
        btNovoCadastroDeCarga     .addActionListener( j );
        btSairCadastroDeCarga     .addActionListener( j );
        
        frameCadastroDeCarga.setLayout ( flowLayoutPadrao );
    }

    // Frame Consultar/Excluir pela placa Carga.
    static JFrame  frameConsExcPelaPlacaCarga       = new JFrame( "Consultar/Excluir pela Placa Carga" );
    // Labels para os rótulos de caixa de entrada de texto.
    static JLabel labelConsExcPlacPlacaCarga       = new JLabel( "Placa: "           );
    static JLabel labelConsExcPlacTaraCarga        = new JLabel( "Tara: "            );
    static JLabel labelConsExcPlacCargaMaximaCarga = new JLabel( "Carga Máxima.: "   );
    static JLabel labelConsExcPlacMarcaCarga       = new JLabel( "Marca: "           );
    static JLabel labelConsExcPlacModeloCarga      = new JLabel( "Modelo: "          );
    static JLabel labelConsExcPlacCorCarga         = new JLabel( "Cor: "             );
    static JLabel labelConsExcPlacQtdRodasCarga    = new JLabel( "Qtd. Rodas"        );
    static JLabel labelConsExcPlacVelocMaxCarga    = new JLabel( "Velocidade Máx.: " );
    static JLabel labelConsExcPlacQtdPistoesCarga  = new JLabel( "Qtd. Pistões: "    );
    static JLabel labelConsExcPlacPotenciaCarga    = new JLabel( "Potência: "        );
    // Botões
    static JButton btConsultarConsExcPelaPlacaCarga = new JButton( "Consultar" );
    static JButton btExcluirConsExcPelaPlacaCarga   = new JButton( "Excluir"   );
    static JButton btSairConsExcPelaPlacaCarga      = new JButton( "Sair"      );
    // Largura de Campos de Entrada 
    static JTextField txtConsExcPlacPlacaCarga        = new JTextField( 20 );
    static JTextField txtConsExcPlacTaraCarga         = new JTextField( 20 );
    static JTextField txtConsExcPlacCargaMaximaCarga  = new JTextField( 20 );
    static JTextField txtConsExcPlacMarcaCarga        = new JTextField( 20 );
    static JTextField txtConsExcPlacModeloCarga       = new JTextField( 20 );
    static JTextField txtConsExcPlacCorCarga          = new JTextField( 20 );
    static JTextField txtConsExcPlacQtdRodasCarga     = new JTextField( 20 );
    static JTextField txtConsExcPlacVelocMaxCarga     = new JTextField( 20 );
    static JTextField txtConsExcPlacQtdPistoesCarga   = new JTextField( 20 );
    static JTextField txtConsExcPlacPotenciaCarga     = new JTextField( 20 );
    
    // Carga          ons
    static String varConsCargaPlacaCarga       = "";
    static int    varConsCargaTaraCarga        = 0;
    static int    varConsCargaCargaMaximaCarga = 0;
    static String varConsCargaMarcaCarga       = "";
    static String varConsCargaModeloCarga      = "";
    static String varConsCargaCorCarga         = "";
    static int    varConsCargaQtdRodasCarga    = 0;
    static float  varConsCargaVelocMaxCarga    = 0.0f;
    static int    varConsCargaQtdPistoesCarga  = 0;
    static int    varConsCargaPotenciaCarga    = 0;
    
    public static void frameConsExcPelaPlacaCarga( ) {
    	frameConsExcPelaPlacaCarga.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameConsExcPelaPlacaCarga.setSize ( largura, altura                );
        
        txtConsExcPlacPlacaCarga      .setEditable( true  );
        txtConsExcPlacTaraCarga       .setEditable( false );
        txtConsExcPlacCargaMaximaCarga.setEditable( false );
        txtConsExcPlacMarcaCarga      .setEditable( false );
        txtConsExcPlacModeloCarga     .setEditable( false );
        txtConsExcPlacCorCarga        .setEditable( false );
        txtConsExcPlacQtdRodasCarga   .setEditable( false );
        txtConsExcPlacVelocMaxCarga   .setEditable( false );
        txtConsExcPlacQtdPistoesCarga .setEditable( false );
        txtConsExcPlacPotenciaCarga   .setEditable( false );
        
        frameConsExcPelaPlacaCarga.add( labelConsExcPlacPlacaCarga       );
        frameConsExcPelaPlacaCarga.add( txtConsExcPlacPlacaCarga         );
        frameConsExcPelaPlacaCarga.add( labelConsExcPlacTaraCarga        );
        frameConsExcPelaPlacaCarga.add( txtConsExcPlacTaraCarga          );
        frameConsExcPelaPlacaCarga.add( labelConsExcPlacCargaMaximaCarga );
        frameConsExcPelaPlacaCarga.add( txtConsExcPlacCargaMaximaCarga   );
        frameConsExcPelaPlacaCarga.add( labelConsExcPlacMarcaCarga       );
        frameConsExcPelaPlacaCarga.add( txtConsExcPlacMarcaCarga         );
        frameConsExcPelaPlacaCarga.add( labelConsExcPlacModeloCarga      );
        frameConsExcPelaPlacaCarga.add( txtConsExcPlacModeloCarga        );
        frameConsExcPelaPlacaCarga.add( labelConsExcPlacCorCarga         );
        frameConsExcPelaPlacaCarga.add( txtConsExcPlacCorCarga           );
        frameConsExcPelaPlacaCarga.add( labelConsExcPlacQtdRodasCarga    );
        frameConsExcPelaPlacaCarga.add( txtConsExcPlacQtdRodasCarga      );
        frameConsExcPelaPlacaCarga.add( labelConsExcPlacVelocMaxCarga    );
        frameConsExcPelaPlacaCarga.add( txtConsExcPlacVelocMaxCarga      );
        frameConsExcPelaPlacaCarga.add( labelConsExcPlacQtdPistoesCarga  );
        frameConsExcPelaPlacaCarga.add( txtConsExcPlacQtdPistoesCarga    );
        frameConsExcPelaPlacaCarga.add( labelConsExcPlacPotenciaCarga    );
        frameConsExcPelaPlacaCarga.add( txtConsExcPlacPotenciaCarga      );
        
        // Botões.
        frameConsExcPelaPlacaCarga.add( btConsultarConsExcPelaPlacaCarga );
        frameConsExcPelaPlacaCarga.add( btExcluirConsExcPelaPlacaCarga   );
        frameConsExcPelaPlacaCarga.add( btSairConsExcPelaPlacaCarga      );
        // Na escuta
        btConsultarConsExcPelaPlacaCarga.addActionListener( j );
        btExcluirConsExcPelaPlacaCarga  .addActionListener( j );
        btSairConsExcPelaPlacaCarga     .addActionListener( j );
        
        frameConsExcPelaPlacaCarga.setLayout ( flowLayoutPadrao );
    }

    // Frame Imprimir/Excluir Carga
    static JFrame  frameImpExcTodosCarga      = new JFrame( "Imprimir/Excluir Todos" );
    static JButton btImpTodosImpExcTodosCarga = new JButton( "Imprimir Todos" );
    static JButton btExcTodosImpExcTodosCarga = new JButton( "Excluir Todos"  );
    static JButton btSairImpExcTodosCarga     = new JButton( "Sair"           );
    
    // Carga         ImpExc
    static String varImpExcCargaPlacaCarga       = "";
    static int    varImpExcCargaTaraCarga        = 0;
    static int    varImpExcCargaCargaMaximaCarga = 0;
    static String varImpExcCargaMarcaCarga       = "";
    static String varImpExcCargaModeloCarga      = "";
    static String varImpExcCargaCorCarga         = "";
    static int    varImpExcCargaQtdRodasCarga    = 0;
    static float  varImpExcCargaVelocMaxCarga    = 0.0f;
    static int    varImpExcCargaQtdPistoesCarga  = 0;
    static int    varImpExcCargaPotenciaCarga    = 0;
    
    public static void frameImpExcTodosCarga( ) {
    	frameImpExcTodosCarga.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frameImpExcTodosCarga.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameImpExcTodosCarga.setLayout(new GridLayout(4,1,10,10));
        frameImpExcTodosCarga.setSize( 800,600);
        frameImpExcTodosCarga.getContentPane( ).setBackground( Color.WHITE );

    	// Tabela.
        barraRolagemListaCarga.setLayout( new ScrollPaneLayout( ) );
        barraRolagemListaCarga.setPreferredSize( new Dimension( 700, 500 ) );

        frameImpExcTodosCarga.add( barraRolagemListaCarga );
    																
        // Botões
        frameImpExcTodosCarga.add( btImpTodosImpExcTodosCarga );
        frameImpExcTodosCarga.add( btExcTodosImpExcTodosCarga );
        frameImpExcTodosCarga.add( btSairImpExcTodosCarga     );
        // Na escuta.
        btImpTodosImpExcTodosCarga.addActionListener( j );
        btExcTodosImpExcTodosCarga.addActionListener( j );
        btSairImpExcTodosCarga    .addActionListener( j );
        
        frameImpExcTodosCarga .setLayout( new FlowLayout( ) );

    }


    // Indicadores de tipo de Veículo.
    static int veiculoDePasseio = 1;
    static int veiculoDeCarga   = 2;

    
    public static void limparDadosCadastro( int veiculo ) {
        
        switch ( veiculo ) {
            case 1 : {
            	resetaVarsCadastroVeiculo( veiculoDePasseio );
            	txtCadPasseioPlacaPasseio     .setText( "" );
                txtCadPasseioQtdPassageiros   .setText( "" );
                txtCadPasseioMarcaPasseio     .setText( "" );
                txtCadPasseioModeloPasseio    .setText( "" );
                txtCadPasseioCorPasseio       .setText( "" );
                txtCadPasseioQtdRodasPasseio  .setText( "" );
                txtCadPasseioVelocMaxPasseio  .setText( "" );
                txtCadPasseioQtdPistoesPasseio.setText( "" );
                txtCadPasseioPotenciaPasseio  .setText( "" );
            }
            case 2 : {
            	resetaVarsCadastroVeiculo( veiculoDeCarga );
            	txtCadCargaPlacaCarga       .setText( "" );
                txtCadCargaTaraCarga        .setText( "" );
                txtCadCargaCargaMaximaCarga .setText( "" );
                txtCadCargaMarcaCarga       .setText( "" );
                txtCadCargaModeloCarga      .setText( "" );
                txtCadCargaCorCarga         .setText( "" );
                txtCadCargaQtdRodasCarga    .setText( "" );
                txtCadCargaVelocMaxCarga    .setText( "" );
                txtCadCargaQtdPistoesCarga  .setText( "" );
                txtCadCargaPotenciaCarga    .setText( "" );
            }
        }
    }
    
    
   public static void limparFrameConsExcPelaPlacaDadosVars( int veiculo ) {
        
        switch ( veiculo ) {
            case 1 : {
            	txtConsExcPlacPlacaPasseio     .setText( "" );
                txtConsExcPlacQtdPassageiros   .setText( "" );
                txtConsExcPlacMarcaPasseio     .setText( "" );
                txtConsExcPlacModeloPasseio    .setText( "" );
                txtConsExcPlacCorPasseio       .setText( "" );
                txtConsExcPlacQtdRodasPasseio  .setText( "" );
                txtConsExcPlacVelocMaxPasseio  .setText( "" );
                txtConsExcPlacQtdPistoesPasseio.setText( "" );
                txtConsExcPlacPotenciaPasseio  .setText( "" );
                
                varConsPasseioPlacaPasseio         = "";  
                varConsPasseioQtdPassageiros       = 0;   
                varConsPasseioMarcaPasseio         = "";  
                varConsPasseioModeloPasseio        = "";  
                varConsPasseioCorPasseio           = "";  
                varConsPasseioVelocMaxPasseio      = 0.0f;
                varConsPasseioQtdRodasPasseio      = 0;   
                varConsPasseioQtdPistoesPasseio    = 0;   
                varConsPasseioPotenciaPasseio      = 0;   
                
            }
            case 2 : {
            	txtConsExcPlacPlacaCarga       .setText( "" );
                txtConsExcPlacTaraCarga        .setText( "" );
                txtConsExcPlacCargaMaximaCarga .setText( "" );
                txtConsExcPlacMarcaCarga       .setText( "" );
                txtConsExcPlacModeloCarga      .setText( "" );
                txtConsExcPlacCorCarga         .setText( "" );
                txtConsExcPlacQtdRodasCarga    .setText( "" );
                txtConsExcPlacVelocMaxCarga    .setText( "" );
                txtConsExcPlacQtdPistoesCarga  .setText( "" );
                txtConsExcPlacPotenciaCarga    .setText( "" );
                
                varConsCargaPlacaCarga       = "";  
                varConsCargaTaraCarga        = 0;   
                varConsCargaCargaMaximaCarga = 0;   
                varConsCargaMarcaCarga       = "";  
                varConsCargaModeloCarga      = "";  
                varConsCargaCorCarga         = "";  
                varConsCargaQtdRodasCarga    = 0;   
                varConsCargaVelocMaxCarga    = 0.0f;
                varConsCargaQtdPistoesCarga  = 0;   
                varConsCargaPotenciaCarga    = 0;   
                
            }
        }
    }

    public static void resetaVarsCadastroVeiculo( int veiculo ){
    
        switch ( veiculo ) {
            case 1 : {
            	varCadPasseioPlacaPasseio      = "";
                varCadPasseioQtdPassageiros    = 0;
                varCadPasseioMarcaPasseio      = "";
                varCadPasseioModeloPasseio     = "";
                varCadPasseioCorPasseio        = "";
                varCadPasseioVelocMaxPasseio   = 0.0f;
                varCadPasseioQtdRodasPasseio   = 0;
                varCadPasseioQtdPistoesPasseio = 0;
                varCadPasseioPotenciaPasseio   = 0;
            }
            case 2 : {
            	varCadCargaPlacaCarga       = "";
                varCadCargaTaraCarga        = 0;
                varCadCargaCargaMaximaCarga = 0;
                varCadCargaMarcaCarga       = "";
                varCadCargaModeloCarga      = "";
                varCadCargaCorCarga         = "";
                varCadCargaQtdRodasCarga    = 0;
                varCadCargaVelocMaxCarga    = 0.0f;
                varCadCargaQtdPistoesCarga  = 0;
                varCadCargaPotenciaCarga    = 0;
            }
        }
    }

    /**
     * Método para Cadastro de Passeio
     */
    public void cadastroDePasseio( ) {
    	boolean preenchido = validaTextFieldsCadastroPasseio      (  );
    	if ( preenchido ) {
			
    		try {
    			VeicExistException.verifica( varCadPasseioPlacaPasseio );
    			System.out.println( "Veículo existe? : " + VeicExistException.verifica( varCadPasseioPlacaPasseio ) );
    			System.out.println( "Placa passeio: "  + varCadPasseioPlacaPasseio );
    			
    			// Cuidado com erro de compreensão lógica de uso das variáveis.
    			Passeio passeio = new Passeio();
    			
    			passeio.setPlaca         ( varCadPasseioPlacaPasseio    );  
    			passeio.setQtdPassageiros( varCadPasseioQtdPassageiros  );
    			passeio.setMarca         ( varCadPasseioMarcaPasseio    );
    			passeio.setModelo        ( varCadPasseioModeloPasseio   );
    			passeio.setCor           ( varCadPasseioCorPasseio      );
    			passeio.setQtdRodas      ( varCadPasseioQtdRodasPasseio );
    			try {                                            
    				passeio.setVelocMax  ( veiculoDePasseio, varCadPasseioVelocMaxPasseio );
    			} catch ( VelocException e ) {
    				// TODO Auto-generated catch block
    				e.printStackTrace();
    			}
    			passeio.setQtdPist       ( varCadPasseioQtdPistoesPasseio );
    			passeio.setPotencia      ( varCadPasseioPotenciaPasseio   );
    			
    			BDVeiculos.listaDePasseio.add( passeio    );
    			System.out.println( "Entrou no cadastro" );
    			limparDadosCadastro           ( veiculoDePasseio );
    			
    		} catch (VeicExistException e) {
    			// TODO Auto-generated catch block
    		
    		} 
		}
    }
    
    /**
     * Método para Cadastro de Carga.
     */
    public void cadastroDeCarga( ) {
    	boolean preenchido = validaTextFieldsCadastroCarga( );
     	if( preenchido ){
    			
    		try {
    			VeicExistException.verifica( varCadCargaPlacaCarga );
    			System.out.println( "Veículo existe? : " + VeicExistException.verifica( varCadCargaPlacaCarga ) );
    			System.out.println( "Placa carga: "  + varCadCargaPlacaCarga );
    			
    			// Cuidado com erro de compreensão lógica de uso das variáveis.
    			Carga carga = new Carga( );
    			carga.setPlaca         ( varCadCargaPlacaCarga       );
    			carga.setTara          ( varCadCargaTaraCarga        );
    			carga.setCargaMax      ( varCadCargaCargaMaximaCarga );
    			carga.setMarca         ( varCadCargaMarcaCarga       );
    			carga.setModelo        ( varCadCargaModeloCarga      );
    			carga.setCor           ( varCadCargaCorCarga         );
    			carga.setQtdRodas      ( varCadCargaQtdRodasCarga    );
    			try {                                            
    				carga.setVelocMax  ( veiculoDeCarga, varCadCargaVelocMaxCarga  );
    			} catch ( VelocException e ) {
    				// TODO Auto-generated catch block
    				e.printStackTrace();
    			}
    			carga.setQtdPist       ( varCadCargaQtdPistoesCarga   );
    			carga.setPotencia      ( varCadCargaPotenciaCarga     );
    			
    			BDVeiculos.listaDeCarga.add( carga          );
    			System.out.println( "Entrou no cadastro" );
    			limparDadosCadastro( veiculoDeCarga );
    	
    			} catch (VeicExistException e) {
    				// TODO Auto-generated catch block
    	
    		}
    		
    	}
    }
    
    /**
     * Método para validar campos de texto da Placa, nulos, nos Frames Consultar/Excluir pela Placa
     * 
     * @param veiculo Variável para indicar o tipo de Veículo.
     * @return Retorna true  se a Placa     for Preenchida
     * @return Retorna false se a Placa não for Preenchida.
     */
    public boolean validaTextFieldsConsultaPasseio( ){
        boolean txtPlacaPreenchida = false;

        	
        if( txtConsExcPlacPlacaPasseio.getText( ).isEmpty( ) ){
        	
           	System.out.println( "Entrou na Variável placaPasseio vazia = " + varConsPasseioPlacaPasseio );
           	JOptionPane.showMessageDialog( null, "Informe a Placa","Atenção", JOptionPane.OK_OPTION );
           	
           }else {
        	   
        	   varConsPasseioPlacaPasseio = txtConsExcPlacPlacaPasseio.getText( );
        	   txtPlacaPreenchida = true;
        	   System.out.println( "Entrou na Variável Preenchida placaPasseio = " + varConsPasseioPlacaPasseio );
        	   System.out.println( "Alterar o valor pra true: " + txtPlacaPreenchida );
        	   
        	   for ( Passeio p1 : BDVeiculos.listaDePasseio ) {
        		   
        		   if( p1.getPlaca().equals( varConsPasseioPlacaPasseio ) ) {
        			   
        			   System.out.println( "Entrou no for/if validaTextFieldsConsultaPasseio placas iguais p1.getPlaca(): " + p1.getPlaca( ) + " == " + varConsPasseioPlacaPasseio + " Parâmetro" );
        			   
        			   varConsPasseioQtdPassageiros    = p1.getQtdPassageiros();
        			   varConsPasseioMarcaPasseio      = p1.getMarca();
        			   varConsPasseioModeloPasseio     = p1.getModelo();
        			   varConsPasseioCorPasseio        = p1.getCor();
        			   varConsPasseioVelocMaxPasseio   = p1.getVelocMax();
        			   varConsPasseioQtdRodasPasseio   = p1.getQtdRodas();
        			   varConsPasseioQtdPistoesPasseio = p1.getQtdPist();
        			   varConsPasseioPotenciaPasseio   = p1.getPotencia();
        			   
        		   }
        		   
        	   }
        	   
           	
           }
        
        return txtPlacaPreenchida;
    }
    
    /**
     * Método para validar campos de texto da Placa, nulos, nos Frames Consultar/Excluir pela Placa
     * 
     * @param veiculo Variável para indicar o tipo de Veículo.
     * @return Retorna true  se a Placa     for Preenchida
     * @return Retorna false se a Placa não for Preenchida.
     */
    public boolean validaTextFieldsConsultaCarga( ){
        boolean txtPlacaPreenchida = false;
        
        
        if( txtConsExcPlacPlacaCarga.getText( ).isEmpty() ){
        	
        	System.out.println( "Variável placaCarga vazia = " + varConsCargaPlacaCarga );
        	JOptionPane.showMessageDialog(null, "Informe a Placa","Atenção", JOptionPane.OK_OPTION);
            
        }else {
        	varConsCargaPlacaCarga = txtConsExcPlacPlacaCarga.getText( );
        	
        	System.out.println( "Entrou na Variável Preenchida placaCarga = " + varConsCargaPlacaCarga );
        	txtPlacaPreenchida = true;
        	System.out.println( "Alterar o valor pra true: " + txtPlacaPreenchida );

        	for (Carga c1 : BDVeiculos.listaDeCarga) {
				
        		if( c1.getPlaca( ).equals( varConsCargaPlacaCarga ) ) {
				
        			System.out.println( "Entrou no for/if validaTextFieldsConsultaCarga placas iguais c1.getPlaca( ): " + c1.getPlaca() + " == " + varConsCargaPlacaCarga + " Parâmetro" );
        			
        			varConsCargaTaraCarga        = c1.getTara();
        			varConsCargaCargaMaximaCarga = c1.getCargaMax();
        			varConsCargaMarcaCarga       = c1.getMarca();
        			varConsCargaModeloCarga      = c1.getModelo();
        			varConsCargaCorCarga         = c1.getCor();
        			varConsCargaQtdRodasCarga    = c1.getQtdRodas();
        			varConsCargaVelocMaxCarga    = c1.getVelocMax();
        			varConsCargaQtdPistoesCarga  = c1.getQtdPist();
        			varConsCargaPotenciaCarga    = c1.getPotencia();
        			
				}
			}
        	
        	
        }
        
        return txtPlacaPreenchida;
    }
    
    
    /**
     * Método para indicar se os campos dos formulários de cadastro foram Preenchidos.
     * 
     * @param veiculo Variável para indicar o tipo de veículo.
     * @return true  se os campos de texto foram preenchidos. 
     * @return false se algum campo de texto estiver vazio.
     */
    public boolean validaTextFieldsCadastroPasseio( ) {
        boolean preenchido = false;
		
		System.out.println( "Capturados da tela txtCadPasseioPlacaPasseio     .getText( )" + txtCadPasseioPlacaPasseio     .getText( ) );
		System.out.println( "Capturados da tela txtCadPasseioQtdPassageiros   .getText( )" + txtCadPasseioQtdPassageiros   .getText( ) );
		System.out.println( "Capturados da tela txtCadPasseioMarcaPasseio     .getText( )" + txtCadPasseioMarcaPasseio     .getText( ) );
		System.out.println( "Capturados da tela txtCadPasseioModeloPasseio    .getText( )" + txtCadPasseioModeloPasseio    .getText( ) );
		System.out.println( "Capturados da tela txtCadPasseioCorPasseio       .getText( )" + txtCadPasseioCorPasseio       .getText( ) );
		System.out.println( "Capturados da tela txtCadPasseioVelocMaxPasseio  .getText( )" + txtCadPasseioVelocMaxPasseio  .getText( ) );
		System.out.println( "Capturados da tela txtCadPasseioQtdRodasPasseio  .getText( )" + txtCadPasseioQtdRodasPasseio  .getText( ) );
		System.out.println( "Capturados da tela txtCadPasseioQtdPistoesPasseio.getText( )" + txtCadPasseioQtdPistoesPasseio.getText( ) );
		System.out.println( "Capturados da tela txtCadPasseioPotenciaPasseio  .getText( )" + txtCadPasseioPotenciaPasseio  .getText( ) );
		
		if( txtCadPasseioPlacaPasseio     .getText( ).isEmpty( ) ||     
			txtCadPasseioQtdPassageiros   .getText( ).isEmpty( ) ||
			txtCadPasseioMarcaPasseio     .getText( ).isEmpty( ) ||
			txtCadPasseioModeloPasseio    .getText( ).isEmpty( ) ||
			txtCadPasseioCorPasseio       .getText( ).isEmpty( ) ||
			txtCadPasseioVelocMaxPasseio  .getText( ).isEmpty( ) ||
			txtCadPasseioQtdRodasPasseio  .getText( ).isEmpty( ) ||
			txtCadPasseioQtdPistoesPasseio.getText( ).isEmpty( ) ||
			txtCadPasseioPotenciaPasseio  .getText( ).isEmpty( ) ){
			
			JOptionPane.showMessageDialog( null, "Preencha o formulário corretamente", "Atenção", JOptionPane.OK_OPTION);
			
		}
		else {
			
			preenchido = true;
			
			try {
				
				varCadPasseioPlacaPasseio      =                   txtCadPasseioPlacaPasseio     .getText( );
				varCadPasseioQtdPassageiros    = Integer.parseInt( txtCadPasseioQtdPassageiros   .getText( ) );
				varCadPasseioMarcaPasseio      =                   txtCadPasseioMarcaPasseio     .getText( );
				varCadPasseioModeloPasseio     =                   txtCadPasseioModeloPasseio    .getText( );
				varCadPasseioCorPasseio        =                   txtCadPasseioCorPasseio       .getText( );
				varCadPasseioVelocMaxPasseio   = Float.parseFloat( txtCadPasseioVelocMaxPasseio  .getText( ) );
				varCadPasseioQtdRodasPasseio   = Integer.parseInt( txtCadPasseioQtdRodasPasseio  .getText( ) );
				varCadPasseioQtdPistoesPasseio = Integer.parseInt( txtCadPasseioQtdPistoesPasseio.getText( ) );
				varCadPasseioPotenciaPasseio   = Integer.parseInt( txtCadPasseioPotenciaPasseio  .getText( ) );
				
			} catch (NumberFormatException e) {
				// TODO: handle exception
				preenchido = false;
				limparFrameCadastro( veiculoDePasseio );
				JOptionPane.showMessageDialog(null, "Atenção aos campos numériocos", "Atenção", JOptionPane.OK_OPTION );
			}
			
			System.out.println( "Vazio? Capturados da tela placaPasseio     " + varCadPasseioPlacaPasseio      );
			System.out.println( "Vazio? Capturados da tela qtdPassageiros   " + varCadPasseioQtdPassageiros    );
			System.out.println( "Vazio? Capturados da tela marcaPasseio     " + varCadPasseioMarcaPasseio      );
			System.out.println( "Vazio? Capturados da tela modeloPasseio    " + varCadPasseioModeloPasseio     );
			System.out.println( "Vazio? Capturados da tela corPasseio       " + varCadPasseioCorPasseio        );
			System.out.println( "Vazio? Capturados da tela velocMaxPasseio  " + varCadPasseioVelocMaxPasseio   );
			System.out.println( "Vazio? Capturados da tela qtdRodasPasseio  " + varCadPasseioQtdRodasPasseio   );
			System.out.println( "Vazio? Capturados da tela qtdPistoesPasseio" + varCadPasseioQtdPistoesPasseio );
			System.out.println( "Vazio? Capturados da tela potenciaPasseio  " + varCadPasseioPotenciaPasseio   );
		}
        
        
        return preenchido;
    }// Fim ValidaTextFields

    
    public void limparFrameCadastro( int veiculo ) {
		// TODO Auto-generated method stub
    	
    	switch (veiculo) {
		case 1:
			resetaVarsCadastroVeiculo( veiculoDePasseio );
			txtCadPasseioPlacaPasseio     .setText( "" );
			txtCadPasseioQtdPassageiros   .setText( "" );
			txtCadPasseioMarcaPasseio     .setText( "" );
			txtCadPasseioModeloPasseio    .setText( "" );
			txtCadPasseioCorPasseio       .setText( "" );
			txtCadPasseioQtdRodasPasseio  .setText( "" );
			txtCadPasseioVelocMaxPasseio  .setText( "" );
			txtCadPasseioQtdPistoesPasseio.setText( "" );
			txtCadPasseioPotenciaPasseio  .setText( "" );   
			
			break;

		case 2:
			
			resetaVarsCadastroVeiculo( veiculoDeCarga );
			txtCadCargaPlacaCarga      .setText( "" );
			txtCadCargaTaraCarga       .setText( "" );
			txtCadCargaCargaMaximaCarga.setText( "" );
			txtCadCargaMarcaCarga      .setText( "" );
			txtCadCargaModeloCarga     .setText( "" );
			txtCadCargaCorCarga        .setText( "" );
			txtCadCargaQtdRodasCarga   .setText( "" );
			txtCadCargaVelocMaxCarga   .setText( "" );
			txtCadCargaQtdPistoesCarga .setText( "" );
			txtCadCargaPotenciaCarga   .setText( "" );
			
			break;
		}
	}
    
	/**
     * Método para indicar se os campos dos formulários de cadastro foram Preenchidos.
     * 
     * @param veiculo Variável para indicar o tipo de veículo.
     * @return true  se os campos de texto foram preenchidos. 
     * @return false se algum campo de texto estiver vazio.
     */
    public boolean validaTextFieldsCadastroCarga( ) {
        boolean preenchido = false;
 
        System.out.println( "Capturados da tela txtCadCargaPlacaCarga      .getText( ).isEmpty( ) = " + txtCadCargaPlacaCarga       .getText( ).isEmpty( ) );
        System.out.println( "Capturados da tela txtCadCargaTaraCarga       .getText( ).isEmpty( ) = " + txtCadCargaTaraCarga        .getText( ).isEmpty( ) );
        System.out.println( "Capturados da tela txtCadCargaCargaMaximaCarga.getText( ).isEmpty( ) = " + txtCadCargaCargaMaximaCarga .getText( ).isEmpty( ) );
		System.out.println( "Capturados da tela txtCadCargaMarcaCarga      .getText( ).isEmpty( ) = " + txtCadCargaMarcaCarga       .getText( ).isEmpty( ) );
		System.out.println( "Capturados da tela txtCadCargaModeloCarga     .getText( ).isEmpty( ) = " + txtCadCargaModeloCarga      .getText( ).isEmpty( ) );
		System.out.println( "Capturados da tela txtCadCargaCorCarga        .getText( ).isEmpty( ) = " + txtCadCargaCorCarga         .getText( ).isEmpty( ) );
		System.out.println( "Capturados da tela txtCadCargaVelocMaxCarga   .getText( ).isEmpty( ) = " + txtCadCargaVelocMaxCarga    .getText( ).isEmpty( ) );
		System.out.println( "Capturados da tela txtCadCargaQtdRodasCarga   .getText( ).isEmpty( ) = " + txtCadCargaQtdRodasCarga    .getText( ).isEmpty( ) );
		System.out.println( "Capturados da tela txtCadCargaQtdPistoesCarga .getText( ).isEmpty( ) = " + txtCadCargaQtdPistoesCarga  .getText( ).isEmpty( ) );
		System.out.println( "Capturados da tela txtCadCargaPotenciaCarga   .getText( ).isEmpty( ) = " + txtCadCargaPotenciaCarga    .getText( ).isEmpty( ) );
        // Cuidado com interpretações de lógicas ao contrário.
        // com variáveis e métodos booleanos
		if( txtCadCargaPlacaCarga       .getText( ).isEmpty( ) ||
			txtCadCargaTaraCarga        .getText( ).isEmpty( ) || 
			txtCadCargaCargaMaximaCarga .getText( ).isEmpty( ) || 
			txtCadCargaMarcaCarga       .getText( ).isEmpty( ) || 
			txtCadCargaModeloCarga      .getText( ).isEmpty( ) || 
			txtCadCargaCorCarga         .getText( ).isEmpty( ) || 
			txtCadCargaVelocMaxCarga    .getText( ).isEmpty( ) || 
			txtCadCargaQtdRodasCarga    .getText( ).isEmpty( ) || 
			txtCadCargaQtdPistoesCarga  .getText( ).isEmpty( ) || 
			txtCadCargaPotenciaCarga    .getText( ).isEmpty( ) ){

			JOptionPane.showMessageDialog( null, "Preencha o formulário corretamente", "Atenção", JOptionPane.OK_OPTION);
		}

		else {
			preenchido = true;
			
			try {
				
				varCadCargaPlacaCarga       =                   txtCadCargaPlacaCarga       .getText( );
				varCadCargaTaraCarga        = Integer.parseInt( txtCadCargaTaraCarga        .getText( ) );
				varCadCargaCargaMaximaCarga = Integer.parseInt( txtCadCargaCargaMaximaCarga .getText( ) );
				varCadCargaMarcaCarga       =                   txtCadCargaMarcaCarga       .getText( );                   
				varCadCargaModeloCarga      =                   txtCadCargaModeloCarga      .getText( );                   
				varCadCargaCorCarga         =                   txtCadCargaCorCarga         .getText( );                   
				varCadCargaVelocMaxCarga    = Float.parseFloat( txtCadCargaVelocMaxCarga    .getText( ) );
				varCadCargaQtdRodasCarga    = Integer.parseInt( txtCadCargaQtdRodasCarga    .getText( ) );
				varCadCargaQtdPistoesCarga  = Integer.parseInt( txtCadCargaQtdPistoesCarga  .getText( ) );
				varCadCargaPotenciaCarga    = Integer.parseInt( txtCadCargaPotenciaCarga    .getText( ) );
				
			} catch (NumberFormatException e) {
				// TODO: handle exception
				preenchido = false;
				limparFrameCadastro( veiculoDeCarga );
				JOptionPane.showMessageDialog(null, "Atenção aos campos numériocos", "Atenção", JOptionPane.OK_OPTION );
			}
			
			System.out.println( "Vazio? Capturados da tela varCadCargaPlacaCarga      " + varCadCargaPlacaCarga       );
			System.out.println( "Vazio? Capturados da tela varCadCargaTaraCarga       " + varCadCargaTaraCarga        );
			System.out.println( "Vazio? Capturados da tela varCadCargaCargaMaximaCarga" + varCadCargaCargaMaximaCarga );
			System.out.println( "Vazio? Capturados da tela varCadCargaMarcaCarga      " + varCadCargaMarcaCarga       );
			System.out.println( "Vazio? Capturados da tela varCadCargaModeloCarga     " + varCadCargaModeloCarga      );
			System.out.println( "Vazio? Capturados da tela varCadCargaCorCarga        " + varCadCargaCorCarga         );
			System.out.println( "Vazio? Capturados da tela varCadCargaVelocMaxCarga   " + varCadCargaVelocMaxCarga    );
			System.out.println( "Vazio? Capturados da tela varCadCargaQtdRodasCarga   " + varCadCargaQtdRodasCarga    );
			System.out.println( "Vazio? Capturados da tela varCadCargaQtdPistoesCarga " + varCadCargaQtdPistoesCarga  );
			System.out.println( "Vazio? Capturados da tela varCadCargaPotenciaCarga   " + varCadCargaPotenciaCarga    );
			
		}

        
        return preenchido;
    }// Fim ValidaTextFields
    
    
    
    /**
     * Método para resetar Campos de Texto dos Frames Consultar/Excluir pela Placa.
     * 
     * @param veiculo int para indicar o tipo de veículo.
     */
    public void resetaFrameConsultarExcluir( int veiculo ) {
        
        switch ( veiculo ) {
            case 1 : {

            	txtConsExcPlacPlacaPasseio     .setText( "" );
            	txtConsExcPlacQtdPassageiros   .setText( "" );
                txtConsExcPlacMarcaPasseio     .setText( "" );
                txtConsExcPlacModeloPasseio    .setText( "" );
                txtConsExcPlacCorPasseio       .setText( "" );
                txtConsExcPlacQtdRodasPasseio  .setText( "" );
                txtConsExcPlacVelocMaxPasseio  .setText( "" );
                txtConsExcPlacQtdPistoesPasseio.setText( "" );
                txtConsExcPlacPotenciaPasseio  .setText( "" );
                    
            }
            case 2 : {
	            txtConsExcPlacPlacaCarga      .setText( "" );
	            txtConsExcPlacTaraCarga       .setText( "" );
	            txtConsExcPlacCargaMaximaCarga.setText( "" );
	            txtConsExcPlacMarcaCarga      .setText( "" );
	            txtConsExcPlacModeloCarga     .setText( "" );
	            txtConsExcPlacCorCarga        .setText( "" );
	            txtConsExcPlacQtdRodasCarga   .setText( "" );
	            txtConsExcPlacVelocMaxCarga   .setText( "" );
	            txtConsExcPlacQtdPistoesCarga .setText( "" );
	            txtConsExcPlacPotenciaCarga   .setText( "" );
            }
        }
    }
    
    // Imprimir Passeio
    public void imprimirPasseio() {
    	
        if( BDVeiculos.listaDePasseio.isEmpty( ) ) {
            JOptionPane.showMessageDialog( null,"Não há Veículos cadastrados." , "ERRO",  JOptionPane.ERROR_MESSAGE);

        }else {
            modeloTabelaPasseio = new DefaultTableModel( colunasPasseio, 0 );

            for( Passeio p1 : BDVeiculos.listaDePasseio ) {

                String[] dados = { 
                		                varImpExcPasseioPlacaPasseio      = p1.getPlaca         ( ),     
                		String.valueOf( varImpExcPasseioQtdPassageiros    = p1.getQtdPassageiros( ) ),
    		                varImpExcPasseioMarcaPasseio      = p1.getMarca         ( ),
    		                varImpExcPasseioModeloPasseio     = p1.getModelo        ( ),
    		                varImpExcPasseioCorPasseio        = p1.getCor           ( ),
    		String.valueOf( varImpExcPasseioVelocMaxPasseio   = p1.getVelocMax      ( ) ),
    		String.valueOf( varImpExcPasseioQtdRodasPasseio   = p1.getQtdRodas      ( ) ),
    		String.valueOf( varImpExcPasseioQtdPistoesPasseio = p1.getQtdPist       ( ) ),
    		String.valueOf( varImpExcPasseioPotenciaPasseio   = p1.getPotencia      ( ) )                
              		                };
                modeloTabelaPasseio.addRow(dados);
                }
            tableDadosPassseio.setModel(modeloTabelaPasseio);
            }
    }
    // Imprimir Carga
    public void imprimirCarga() {
    	if( BDVeiculos.listaDeCarga.isEmpty( ) ) {
            JOptionPane.showMessageDialog( null,"Não há Veículos cadastrados." , "ERRO",  JOptionPane.ERROR_MESSAGE);

        }else {
            modeloTabelaPasseio = new DefaultTableModel( colunasCarga, 0 );

            for( Carga c1 : BDVeiculos.listaDeCarga ) {

                String[] dados = { 
                						
                						varImpExcCargaPlacaCarga        = c1.getPlaca         ( )  ,
                		String.valueOf( varImpExcCargaTaraCarga         = c1.getTara          ( ) ),     
                		String.valueOf( varImpExcCargaCargaMaximaCarga  = c1.getCargaMax      ( ) ),
			    		                varImpExcCargaMarcaCarga        = c1.getMarca         ( )  ,
			    		                varImpExcCargaModeloCarga       = c1.getModelo        ( )  ,
			    		                varImpExcCargaCorCarga          = c1.getCor           ( )  ,
			    		String.valueOf( varImpExcCargaQtdRodasCarga     = c1.getQtdRodas      ( ) ),
			    		String.valueOf( varImpExcCargaVelocMaxCarga     = c1.getVelocMax      ( ) ),
			    		String.valueOf( varImpExcCargaQtdPistoesCarga   = c1.getQtdPist       ( ) ),
			    		String.valueOf( varImpExcCargaPotenciaCarga     = c1.getPotencia      ( ) )                
              		                };
                modeloTabelaPasseio.addRow(dados);
                }
            tableDadosPassseio.setModel(modeloTabelaPasseio);
            }
    }
    // Excluir todos passeio.
    public void excluirTodosPasseio( ) {
    	
    	if( BDVeiculos.listaDePasseio.removeAll( BDVeiculos.listaDePasseio ) ) {
    		
    		JOptionPane.showMessageDialog(null,"Dados removidos" , "Sucesso",  JOptionPane.INFORMATION_MESSAGE);
    		DefaultTableModel modelo = new DefaultTableModel( colunasPasseio, 0 );
    		tableDadosPassseio.setModel(modelo);
    	}
    	
    }
    // Excluir todos carga
    public void excluirTodosCarga( ) {
    	
    	if( BDVeiculos.listaDeCarga.removeAll( BDVeiculos.listaDeCarga ) ) {
    		
    		JOptionPane.showMessageDialog(null,"Dados removidos" , "Sucesso",  JOptionPane.INFORMATION_MESSAGE);
    		DefaultTableModel modelo = new DefaultTableModel( colunasCarga, 0 );
    		tableDadosPassseio.setModel(modelo);
    	}
    }
}
