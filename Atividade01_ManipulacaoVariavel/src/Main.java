public class Main{
    public static void main(String[] args) {

        int idade;
        double altura;
        String nome;
        boolean estudante;

        idade = 19;
        altura = 1.79;
        nome = "Igor";
        estudante = true;

        int idade2 = 20;
        int soma_idades = idade + idade2;
        double altura_dobrada = altura * 2;
        String saudacao = "Olá, " + nome;

        System.out.println(saudacao);
        System.out.println("idade: " + idade);
        System.out.println("altura: " + altura);
        System.out.println("nome: " + nome);
        System.out.println("estudante: " + estudante);
        System.out.println("idade2: " + idade2);
        System.out.println("soma das idades: " + soma_idades);
        System.out.println("altura dobrada: " + altura_dobrada);
    }
}