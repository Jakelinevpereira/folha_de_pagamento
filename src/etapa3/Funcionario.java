package etapa3;

import java.util.ArrayList;
import java.util.Locale;

public abstract class Funcionario {

    protected int codigoFuncionario;
    protected double salarioBase;
    protected double salarioMensal;
    public ArrayList<Dependente> dependentes = new ArrayList<>();

    public void associaDependentes(ArrayList<Dependente> listaDependentes) {
        this.dependentes = listaDependentes;
    }

    public int getCodigoFuncionario() {
        return codigoFuncionario;
    }

    public void setCodigoFuncionario(int codigoFuncionario) {
        this.codigoFuncionario = codigoFuncionario;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }
    
    public void calculaSalarioMensal() {
        this.salarioMensal = 0;
    }

    public int getQuantidadeDependentesNaIdadeLimite(int idadeLimite){
        int resultado = 0;
        for (Dependente dependente : dependentes) {
            if(dependente.estaNaIdadeLimite(idadeLimite)){
                resultado = resultado + 1;
            }
        }
        return resultado;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "codigoFuncionario=" + codigoFuncionario + ", salarioBase=" + salarioBase + ", salarioMensal=" + salarioMensal + ", dependentes=" + dependentes + '}';
    }
   
}
