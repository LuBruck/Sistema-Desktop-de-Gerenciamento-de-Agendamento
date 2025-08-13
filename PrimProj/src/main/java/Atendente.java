// Nome:Lucas Bruck; RA:2612259

import java.util.List;

public class Atendente extends Pessoa{
    private String especialidade;
    private int cod_atendente;
    private float comissao;

// ================================================================================

    //Sobrecarga
    public Atendente(){
        super();
        especialidade = "";
        cod_atendente = 0;
        comissao = 0;
    }
    //Sobrecarga
    public Atendente( int cpf, String nome,String espc, int cod_espc){
        super(cpf, nome);
        this.cod_atendente = cod_espc;
        this.especialidade = espc;
    }

// ================================================================================

    public void setEspecialidade(String espc) throws EspecialidadeInvalidaException{
        if(espc == null || espc.trim().isEmpty()){
            throw new EspecialidadeInvalidaException();
        }
        
        this.especialidade = espc;
    }
    public String getEspecialidade(){
        return especialidade;
    }

    public void setCodAtendente(int cod){
        this.cod_atendente = cod;
    }
    public int getCodAtendente(){
        return cod_atendente;
    }
    public void setComissao(float comis){
        this.comissao = comis;
    }
    public float getComissao(){
        return comissao;
    }

// ================================================================================

    //Sobrescrita
    public float retorFinanceiro(List<Agendamento> listAgend){
        this.comissao = 0;
        for(int i = 0; i < listAgend.size(); i++){
			if(listAgend.get(i).getAtendente().getCodAtendente() == this.getCodAtendente()){
                            this.comissao += listAgend.get(i).getPreco() / 3;
			}
		}
        return comissao;
    }
    
}