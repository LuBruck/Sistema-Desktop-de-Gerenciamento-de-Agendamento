// Nome:Lucas Bruck; RA:2612259
import java.util.List;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class GerAtend {
    private Atendente atend;
    private List<Atendente> bdAtend;
    
    private static GerAtend gaUnic;
    
    private GerAtend(){
        atend = new Atendente();
        bdAtend = new ArrayList<Atendente>();;
    }
    
    public static GerAtend geraAtend(){
        if (gaUnic == null){
            gaUnic = new GerAtend();
        }
        return gaUnic;
    }
    
    public List<Atendente> getBdAtend(){
        return bdAtend;
    }
    
    public Atendente consAtendente(Atendente atend){
		for(int i = 0; i < bdAtend.size(); i++){
			if(atend.getCpf() == bdAtend.get(i).getCpf()){//Reflexividade
				return bdAtend.get(i);
			}
                        if(atend.getCodAtendente() == bdAtend.get(i).getCodAtendente()){//Reflexividade
				return bdAtend.get(i);
			}
		}
		return null;
	}	
        
    
    public Atendente insAtendente(Atendente atend){
            if(consAtendente(atend)== null){
                    bdAtend.add(atend);//Reflexividade
                    return atend;
            }
            else{
                    return null;
            }
    }
    public void atualzComis(List<Agendamento> liAgend){
        for(int i =0 ;i < bdAtend.size();i++){
            bdAtend.get(i).retorFinanceiro(liAgend);//Reflexividade
        }
    }

}
