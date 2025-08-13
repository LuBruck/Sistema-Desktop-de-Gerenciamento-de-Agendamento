// Nome:Lucas Bruck; RA:2612259
import java.util.List;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class GerCli {
    private Cliente clien;
    private List<Cliente> bdCli;
    
    private static GerCli gcUnic;
    
    private GerCli(){
        clien = new Cliente();
        bdCli = new ArrayList<Cliente>();
    }
    
    public static GerCli geraCli(){
        if (gcUnic == null){
            gcUnic = new GerCli();
        }
        return gcUnic;
    }

    
    public List<Cliente> getBdCli(){
        return bdCli;
    }
    
    public Cliente consCliente(Cliente cli){
		for(int i = 0; i < bdCli.size(); i++){//Reflexividade
			if(cli.getCpf() == bdCli.get(i).getCpf()){//Reflexividade
				return bdCli.get(i);
			}
		}
		return null;
	}	
        
    
    public Cliente insCliente(Cliente cli){
		if(consCliente(cli)== null){
			bdCli.add(cli);//Reflexividade
			return cli;
		}
		else{
			return null;
		}
	}
    public void atualzGast(List<Agendamento> liAgend){
        for(int i =0 ;i < bdCli.size();i++){
            bdCli.get(i).retorFinanceiro(liAgend);//Reflexividade
        }
    }
}