
package locadoracarros;

/**
 *
 * @author edunativa
 */
public class LocadoraCarros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaLogin().setVisible(true); //Instanciando a classe e dando visivilidade a janela;
            }
        });
    }
    
}
