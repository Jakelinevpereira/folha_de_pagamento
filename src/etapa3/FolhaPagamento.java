package etapa3;

import java.util.ArrayList;
import java.util.Scanner;

public class FolhaPagamento {

    private static ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

    private static final int CONCURSADO = 1;
    private static final int TEMPORARIO = 2;

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a quantidade de funcionarios: ");
        int quantidadeFuncionarios = teclado.nextInt();

        for (int i = 0; i < quantidadeFuncionarios; i++) {
            System.out.print("Digite o codigo do funcionario " + i + ": ");
            int codigoFuncionario = teclado.nextInt();
            System.out.print("Digite o tipo do funcionario: ");
            int tipoFuncionario = teclado.nextInt();
            System.out.print("Digite o salario do funcionario: ");
            double salarioFuncionario = teclado.nextDouble();
            System.out.print("Digite o tempo de contrato do funcionario: ");
            int tempoContrato = teclado.nextInt();
            System.out.print("Quantos dependentes você possui? ");
            int quantidadeDependente = teclado.nextInt();
            if(quantidadeDependente >= 5){
                System.out.print("Serão adicionados o máximo de 5 dependentes.");
                quantidadeDependente = 5;
            }
            teclado.nextLine();

            ArrayList<Dependente> dependentes = new ArrayList<Dependente>();
            int d = 0;
            while (d < quantidadeDependente) {
                System.out.print("Informe a idade do dependente " + d + ": ");
                int idadeDependente = teclado.nextInt();
                Dependente dependente = new Dependente(idadeDependente);
                dependentes.add(dependente);
                d++;
            }

            if (CONCURSADO == tipoFuncionario) {
                FuncionarioConcursado funcionarioConcursado = new FuncionarioConcursado(codigoFuncionario, salarioFuncionario, tempoContrato);
                funcionarioConcursado.associaDependentes(dependentes);
                funcionarios.add(funcionarioConcursado);
            } else if (TEMPORARIO == tipoFuncionario) {
                FuncionarioTemporario funcionarioTemporario = new FuncionarioTemporario(codigoFuncionario, salarioFuncionario, tempoContrato);
                funcionarioTemporario.associaDependentes(dependentes);
                funcionarios.add(funcionarioTemporario);
            }
        }
        
        //Calcula salario mensal
        for (Funcionario funcionario : funcionarios) {
            funcionario.calculaSalarioMensal();
        }

        System.out.println("Funcionários: ");
        for (Funcionario funcionarioConcursado : funcionarios) {
            System.out.println(funcionarioConcursado.toString());
        }
        
    }

}
