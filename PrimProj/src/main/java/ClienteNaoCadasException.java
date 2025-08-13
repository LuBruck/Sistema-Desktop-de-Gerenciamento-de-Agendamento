// Nome:Lucas Bruck; RA:2612259

import javax.swing.JOptionPane;

public class ClienteNaoCadasException extends Exception{
    public void impClienteNaoCadasException(){
        JOptionPane.showMessageDialog(
                    null,
                    "Cliente nao cadastrado",
                    "Cliente não encontrado",
                    JOptionPane.ERROR_MESSAGE
            );
    }
}
