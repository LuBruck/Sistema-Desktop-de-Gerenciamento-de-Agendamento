// Nome:Lucas Bruck; RA:2612259
import java.util.List;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class GerAgend {
    private Agendamento agenda;
    private List<Agendamento> bdAgend;
    
    private static GerAgend gerAgendUnic;
    
    private GerAgend(){
        agenda = new Agendamento();
        bdAgend = new ArrayList<Agendamento>();
    }
    
    public static GerAgend geraAgend(){
        if (gerAgendUnic == null){
            gerAgendUnic = new GerAgend();
        }
        return gerAgendUnic;
    }
    
    public List<Agendamento> getBdAgend(){
        return bdAgend;
    }
    public Agendamento atualizaAgendCodAgend(Agendamento agend){ 
		for(int i = 0; i < bdAgend.size(); i++){
			if(agend.getCodAgendamento() == bdAgend.get(i).getCodAgendamento()){//Reflexividade
                            bdAgend.set(i, agend);  
                            return bdAgend.get(i);
			}
		}
                return null;
	}
    public Agendamento consAgend(Agendamento agend){
		for(int i = 0; i < bdAgend.size(); i++){
			if(agend.getCodAgendamento()== bdAgend.get(i).getCodAgendamento()){//Reflexividade
				return bdAgend.get(i);
			}
		}
		return null;
	}
    public Agendamento consCpdfAgend(Agendamento agend){
		for(int i = 0; i < bdAgend.size(); i++){
			if(agend.getCliente().getCpf()== bdAgend.get(i).getCliente().getCpf()){//Reflexividade
				return bdAgend.get(i);
			}
		}
		return null;
    }
        
    
    public Agendamento insAgend(Agendamento agend){
		if(consAgend(agend)== null){
                        agend.setCodAgendamento(bdAgend.size() + 1);
			bdAgend.add(agend);//Reflexividade
			return agend;
		}
		else{
			return null;
		}
    }
    
}