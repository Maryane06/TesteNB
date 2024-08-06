
package applicationinputdialoglista;

import javax.swing.JOptionPane;

/**
 *
 * @author maryane.squeiroz1
 */
public class ApplicationInputDialogLista {

    public static void main(String[] args) {
       Object []dias = {"Seg","Ter","Qua","Quin","Sex"};
       JOptionPane.showInputDialog(null, "Dias da semana", "semana", 1, null, dias, dias[1]);
    }
    
}
