// Nome:Lucas Bruck ; RA:2612259

public class Agendamento extends Servico{
    private int codAgendamento;
    private String data;
    private Cliente cliente;
// ===============================================================================

    //Sobrecarga
    public Agendamento(){
        super();
        codAgendamento = 0;
        data = "01/01/2025";
        cliente = new Cliente();
    }

    //Sobrecarga
    public Agendamento(int codAgenda,String data, String desc, float prec,
            int cpf_atendente, String nome_atend, int cod_espc, String descricao,
            int cpf_cli, String nome_cli, int tel_cli){
        super(desc, prec,cpf_atendente,nome_atend,cod_espc, descricao);
        this.data = data;
        this.codAgendamento = codAgenda;
        cliente = new Cliente(cpf_cli,nome_cli,tel_cli);
    }

// ===============================================================================
    public void setCodAgendamento(int cod){
        this.codAgendamento = cod;
    }
    public int getCodAgendamento(){
        return codAgendamento;
    }

    public void setData(String dat){
        this.data = dat;
    }
    public String getData(){
        return data;
    }

    public void setCliente(Cliente cli){
        this.cliente = cli;
    }
    public Cliente getCliente(){
        return cliente;
    }
}
