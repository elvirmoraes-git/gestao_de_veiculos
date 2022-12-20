package gestao_de_veiculos;

import javax.swing.JOptionPane;

public class VelocException extends Exception{

    /**
     * d. Sobre a Velocidade M�xima dos ve�culos:
     * i. Caso a velocidade m�xima de um ve�culo seja menor que 80 ou maior 
     * 110, dever� disparar a exce��o �VelocException� (que ser� do tipo 
     * verificada). Seu m�todo construtor dever� informar que: �A velocidade 
     * m�xima est� fora dos limites brasileiros�. 
     * ii. Neste caso (ap�s disparar a exce��o), se estiver �tentando� atribuir 
     * velocidade para um carro de passeio, este dever� assumir 100 (Km/h 
     * para velocidade m�xima) se for um ve�culo de carga assumir� 90 Km/h;
     */
    public VelocException() {
    // TODO Auto-generated constructor stub
        JOptionPane.showMessageDialog( null, "A velocidade maxima esta fora dos limites brasileiros", "VelocException", JOptionPane.ERROR_MESSAGE );
        //System.out.println("A velocidade máxima está fora dos limites brasileiros");
    }
    
    public static boolean verifica( float veloc ) throws VelocException {
        boolean limites = false;
        
        if( veloc < 80.0f || veloc > 100.0f ){
            limites = true;
            throw new VelocException();
        }
        
        return limites;
    }
        
}
