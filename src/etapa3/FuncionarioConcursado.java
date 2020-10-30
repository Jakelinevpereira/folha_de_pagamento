package etapa3;

public class FuncionarioConcursado extends Funcionario {

    private int anosContratacao;

    public FuncionarioConcursado(int codigoFuncionario, double salarioBase, int anosContratacao) {
        this.codigoFuncionario = codigoFuncionario;
        this.salarioBase = salarioBase;
        this.anosContratacao = anosContratacao;
    }

    public int getAnosContratacao() {
        return anosContratacao;
    }

    public void setAnosContratacao(int anosContratacao) {
        this.anosContratacao = anosContratacao;
    }

    public void calculaSalarioMensal() {
        this.salarioMensal = this.salarioBase + Constants.GRATIFICACAO_CONCURSADO_ANO * this.anosContratacao;
        int quantidadeDependentes = this.getQuantidadeDependentesNaIdadeLimite(Constants.IDADE_DEPENDENTE_CONCURSADO);
        this.salarioMensal = this.salarioMensal + (Constants.ACRESCIMO_DEPENDENTE_CONCURSADO * quantidadeDependentes);
    }

    @Override
    public String toString() {
        String retorno = super.toString();
        return "FuncionarioConcursado{" + retorno + ", anosContratacao=" + anosContratacao + '}';
    }

}
