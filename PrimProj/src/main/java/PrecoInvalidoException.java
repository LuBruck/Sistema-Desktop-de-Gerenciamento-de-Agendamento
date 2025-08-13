// Nome:Lucas Bruck; RA:2612259

import javax.swing.JOptionPane;


public class PrecoInvalidoException extends Exception{

    public void impPrecoInvalido(){
        JOptionPane.showMessageDialog(
                    null,
                    "O cpf deve ser um numero real",
                    "Exclusão de Pessoa",
                    JOptionPane.ERROR_MESSAGE
            );
    }

//    public Agendamento corPreco(Agendamento agend){
//        try{
//            impPrecoInvalido();
//            agend.setPreco(l.entDadosFLot());
//        }
//        catch(PrecoInvalidoException pie){
//            agend = corPreco(agend);
//        }
//        finally{
//            System.gc();
//        }
//        return agend;
//    }
}
