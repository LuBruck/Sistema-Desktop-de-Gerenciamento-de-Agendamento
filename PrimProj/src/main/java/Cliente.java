// Nome:Lucas Bruck; RA:2612259

import java.util.List;

public class Cliente extends Pessoa {
    private int telefone;
    private float gastoTotal;

// =============================================================================
    //Sobrecarga
    public Cliente(){
        super();
        telefone = 0;
        gastoTotal = 0;
    }
    //Sobrecarga
    public Cliente(int cpf, String nome,int tele){
        super(cpf, nome);
        this.telefone = tele;
    }

// =============================================================================

    public void setTelefone(int tel){
        this.telefone = tel;
    }
    public int getTelefone(){
        return telefone;
    }
    public void setGasto(float gasto){
        this.gastoTotal = gasto;
    }
    public float getGasto(){
        return gastoTotal;
    }
    
    //Sobrescrita
    public float retorFinanceiro(List<Agendamento> listAgend){
        this.gastoTotal = 0;
        for(int i = 0; i < listAgend.size(); i++){
			if(listAgend.get(i).getCliente().getCpf() == this.getCpf()){
                            this.gastoTotal += listAgend.get(i).getPreco();
			}
		}
        return gastoTotal;
    }
}