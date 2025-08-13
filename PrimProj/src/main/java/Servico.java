// Nome:Lucas Bruck; RA:2612259

public class Servico {
    private String descricao;
    private float preco;
    private Atendente atendente;

// ================================================================================

    //Sobrecarga
    public Servico(){
        descricao = "";
        preco = 0;
        atendente = new Atendente();
    }
    //Sobrecarga
    public Servico(String desc, float prec, int cpf, String nome, int cod_espc, String descricao){
        this.descricao = desc;
        this.preco = prec;
        atendente = new Atendente(cpf, nome, descricao, cod_espc);
    }

// ================================================================================

    public void setDescricao(String desc){
        this.descricao = desc;
    }

    public String getDescricao(){
        return descricao;
    }

    public void setPreco(float prec) throws PrecoInvalidoException{

        if (prec > 0){
            this.preco = prec;
        }
        else{
            throw new PrecoInvalidoException();
        }       
    }

    public float getPreco(){
        return preco;
    }

    public void setAtendente(Atendente atend){
        this.atendente = atend;
    }
    public Atendente getAtendente(){
        return atendente;
    }

}
