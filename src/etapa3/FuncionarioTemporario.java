package etapa3;

public class FuncionarioTemporario extends Funcionario {

    private int mesesContratacao;

    public FuncionarioTemporario(int codigoFuncionario, double salarioBase, int mesesContratacao) {
        this.codigoFuncionario = codigoFuncionario;
        this.salarioBase = salarioBase;
        this.mesesContratacao = mesesContratacao;
    }

    public void calculaSalarioMensal() {
        this.salarioMensal = this.salarioBase + Constants.GRATIFICACAO_TEMPORARIO_MES * this.mesesContratacao;
        int quantidadeDependentes = this.getQuantidadeDependentesNaIdadeLimite(Constants.IDADE_DEPENDENTE_TEMPORARIO);
        this.salarioMensal = this.salarioMensal + Constants.ACRESCIMO_DEPENDENTE_TEMPORARIO * quantidadeDependentes;
    }

    public int getMesesContratacao() {
        return mesesContratacao;
    }

    public void setMesesContratacao(int mesesContratacao) {
        this.mesesContratacao = mesesContratacao;
    }

    @Override
    public String toString() {
        String retorno = super.toString();
        return "FuncionarioTemporario{" + retorno + ", mesesContratacao=" + mesesContratacao + '}';
    }

}
