import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class ReajusteDeSalario {
    public static void main(String[] args) {

        DecimalFormat arredondador = new DecimalFormat("0.00"); // classe utilizada para arredondar casas decimais

        String nome;
        String temp;
        double salario = 0;
        double salarioNovo = 0;
        double inflacao = 0.038;
        double percentual = 0;
        double aumento = 0;
        double salarioComInflacao = 0;


        nome = JOptionPane.showInputDialog("Informe o nome do funcionario: ");

        temp = JOptionPane.showInputDialog("informe o salario do funcionario " + nome + ": R$");
        salario = Double.parseDouble(temp);

        if (salario <= 280.00){
            salarioNovo = salario * 1.20;
            percentual = 20.00;
            aumento = salarioNovo - salario;

        } else if (salario <= 700.00) {
            salarioNovo = salario * 1.15;
            percentual = 10.00;
            aumento = salarioNovo - salario;

        } else if (salario <= 1500) {
            salarioNovo = salario * 1.10;
            percentual = 10.00;
            aumento = salarioNovo - salario;

        } else if (salario > 1500) {
            salarioNovo = salario * 1.05;
            percentual = 5.00;
            aumento = salarioNovo - salario;

        }
        //Desconto de 3,8% referente a inflação
        salarioComInflacao = salarioNovo - (salarioNovo * inflacao);

        JOptionPane.showMessageDialog(null,"- Salario antes do reajuste: R$" + arredondador.format(salario)  + ". " +
                "\n- Percentual de aumento aplicado: " + percentual +"%. " +
                "\n- Valor do aumento: R$" + arredondador.format(aumento) + ". " +
                "\n- Novo Salario, após aumento: R$" + arredondador.format(salarioNovo) +
                "\n- Salario final, descontado a inflação: R$ " + arredondador.format(salarioComInflacao));
    }
}