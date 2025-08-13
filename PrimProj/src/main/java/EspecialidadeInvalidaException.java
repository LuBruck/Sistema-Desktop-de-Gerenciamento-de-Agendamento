// Nome:Lucas Bruck; RA:2612259

import javax.swing.JOptionPane;

public class EspecialidadeInvalidaException extends Exception{

    public void impEspecialidadeInvalida(){
        JOptionPane.showMessageDialog(
                    null,
                    "A especialidade deve existir",
                    "Exclusão de Pessoa",
                    JOptionPane.ERROR_MESSAGE
            );
    }

//    public Atendente corEspecialidade(Atendente atende){
//        try{
//            impEspecialidadeInvalida();
//            atende.setEspecialidade();
//        }
//        catch(EspecialidadeInvalidaException eie){
//            atende = corEspecialidade(atende);
//        }
//        finally{
//            System.gc();
//        }
//        return atende;
//    }
}

