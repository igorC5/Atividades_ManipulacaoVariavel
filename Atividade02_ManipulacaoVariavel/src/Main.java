public class Main {
    public static void main(String[] args) {
        String nome = "igor";
        int idade = 19;
        double salario = 1412;
        int meses_trabalhados = 12;
        int produtos_comprados = 456;

        double salario_anual = meses_trabalhados * salario;
        double salario_anual_liquido = salario_anual - 2000;

        double valor_total_compras = 6500;
        double media_valor_gasto_por_produto = valor_total_compras / produtos_comprados;

        System.out.println("Nome: " + nome);
        System.out.println("Salario liquido anual: " + salario_anual_liquido);
        System.out.println("idade: " + idade);
        System.out.println("salario: " + salario);
        System.out.println("Meses trabalhados: " + meses_trabalhados);
        System.out.println("Produtos comprados: " + produtos_comprados);
        System.out.println("salario anual: " + salario_anual);
        System.out.println("salario anual liquido: " + salario_anual_liquido);
        System.out.println("valor total de compras: " + valor_total_compras);
        System.out.println("media de valor gasto por produto: " + media_valor_gasto_por_produto);
    }
}