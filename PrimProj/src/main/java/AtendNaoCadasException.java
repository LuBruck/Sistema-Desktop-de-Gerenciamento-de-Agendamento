// Nome:Lucas Bruck; RA:2612259

import javax.swing.JOptionPane;

public class AtendNaoCadasException extends Exception{
    public void impAtendNaoCadasException(){
        JOptionPane.showMessageDialog(
                    null,
                    "Atendente nao cadastrado",
                    "Atendente não encontrado",
                    JOptionPane.ERROR_MESSAGE
            );
    }
}
