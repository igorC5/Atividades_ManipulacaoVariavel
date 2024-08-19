public class Main {
    public static void main(String[] args) {
        String nome_produto;
        double preco_unitario;
        int quantidade_comprada;
        double taxa_imposto;
        double margem_de_lucro_desejada;

        nome_produto = "Coca Lata 220Ml";
        preco_unitario = 1.2;
        quantidade_comprada = 15;
        taxa_imposto = 0.20;
        margem_de_lucro_desejada = 2.5;

        double valor_total_sem_taxa = preco_unitario * quantidade_comprada;
        double valor_total_com_taxa = valor_total_sem_taxa - (valor_total_sem_taxa * taxa_imposto);
        double preco_necessario = preco_unitario * margem_de_lucro_desejada;


        System.out.println("produto: " + nome_produto);
        System.out.println("preço unitario: " + preco_unitario);
        System.out.println("quantidade comprada: " + quantidade_comprada);
        System.out.println("taxa imposto: " + taxa_imposto);
        System.out.println("margem de lucro desejada: " + margem_de_lucro_desejada);
        System.out.println("valor total sem taxa: " + valor_total_sem_taxa);
        System.out.println("valor total com taxa: " + valor_total_com_taxa);
        System.out.println("preço necessario para margem de lucro desejada: " + preco_necessario);
    }
}