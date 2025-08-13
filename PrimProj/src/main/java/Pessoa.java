// Nome:Lucas Bruck; RA:2612259


public abstract class Pessoa implements Financeiro{
    private int cpf;
    private String nome;

// ============================================================================
    //Sobrecarga
    public Pessoa(){
        cpf = 0;
        nome = "";
    }

    //Sobrecarga
    public Pessoa(int cpf1, String nom){
        this.cpf = cpf1;
        this.nome = nom;

    }

// ============================================================================

    public void setCpf(int cpf1){
        this.cpf = cpf1;
    }
    public int getCpf(){
        return cpf;
    }

    public void setNome(String nom){
        this.nome = nom;
    }
    public String getNome(){
        return nome;
    }
    
}