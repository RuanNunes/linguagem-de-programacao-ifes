package model;

public class MedicoPediatra extends MedicoAbstract{
    private String expecializacao;
    private Integer tempoDeServicoComExpecializacao;

    //Logica inventada para testar conceitos de JOO
    @Override
    public void fazerSerurgia() {
        if (expecializacao.toLowerCase().equals("pediatra")){
            if (tempoDeServicoComExpecializacao < 3){
                System.out.println("Medico não possui tempo de serviço suficiente para fazer a serurgia");
                return;
            }

            System.out.println("Medico " + getNome() + " Fazendo serurgia");

        }else{
            System.out.println("Medico não possui expecialização para realizar a serurgia");
        }

    }

    //Logica inventada para testar conceitos de JOO
    @Override
    public void aposentar() {
        Integer tempoDeServicoTotal = tempoDeServicoComExpecializacao + getTempoDeServico();

        if (tempoDeServicoTotal >= 25){
            setAposentado(true);
        }else{
            System.out.println("Medico não possui tempo de serviço suficiente para aposentar");
        }

    }

    public String getExpecializacao() {
        return expecializacao;
    }

    public void setExpecializacao(String expecializacao) {
        this.expecializacao = expecializacao;
    }

    public Integer getTempoDeServicoComExpecializacao() {
        return tempoDeServicoComExpecializacao;
    }

    public void setTempoDeServicoComExpecializacao(Integer tempoDeServicoComExpecializacao) {
        this.tempoDeServicoComExpecializacao = tempoDeServicoComExpecializacao;
    }
}
