package gestao_de_veiculos;

import java.util.Iterator;

import javax.swing.JOptionPane;

public class VeicExistException extends Exception {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public VeicExistException( ) {
        // TODO Auto-generated constructor stub
        JOptionPane.showMessageDialog( null, "Veículo já cadastrado.", "VeicExistException1", JOptionPane.ERROR_MESSAGE );
    }

	// Tem que retornar false para validar checadores e disparar a exceção
    static boolean verifica( String placa ) throws VeicExistException {//throws NullPointerException
        boolean existe = true;
        System.out.println( "Entrou no método VeicExistException, Placa: " + placa );
        
        // Aparemente depois de muitas tentativas que as vezes algumas deram certo de alguma forma.
        
        for (Iterator<Passeio> itPasseio = BDVeiculos.listaDePasseio.iterator(); itPasseio.hasNext();) {
        	Passeio p = (Passeio) itPasseio.next( );
        	
        	System.out.println( "Entrou no Iterator Passeio VeicExistException: " );
        	
        	if( p.getPlaca( ).equals( placa ) ) {
        		System.out.println( "Entrou for/if VeicExistException placas iguais Passeio: " + p.getPlaca() + " == " + placa + " Parâmetro");
        		
        		existe = true;
        		throw new VeicExistException( );
        	}
        }	
        
        for ( Iterator<Carga> itCarga = BDVeiculos.listaDeCarga.iterator(); itCarga.hasNext(); ) {
        	Carga c = ( Carga )itCarga.next();
        	
        	System.out.println( "Entrou no Iterator Carga VeicExistException: " );
        	
        	if( c.getPlaca( ).equals( placa ) ) {
        		System.out.println( "Entrou for/if VeicExistException placas iguais Carga: " + c.getPlaca() + " == " + placa + " Parâmetro" );
        		
        		existe = true;
        		throw new VeicExistException( );
        	}
        }
        
        return existe;
    }
}
