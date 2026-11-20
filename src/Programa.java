import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos alunos deseja cadastrar ?");
        int quantidadeDeAlunos = scanner.nextInt();
        scanner.nextLine();
        double nota = 0;
        Aluno [] aluno = new Aluno[quantidadeDeAlunos];
        for (int i = 0; i < aluno.length; i++) {
            System.out.println("Digite o nome do aluno " + (i + 1) + ":");
            String nomeAluno = scanner.nextLine();
            System.out.println("Qual a quantidade de notas ?");
            int quantidadeDeNotas = scanner.nextInt();
            scanner.nextLine();
            double[] notas = new double[quantidadeDeNotas];
            for (int j = 0; j < quantidadeDeNotas; j++) {
                do {
                    System.out.println("Digite a nota do aluno " + nomeAluno + ":");
                    nota = scanner.nextDouble();


                    if (nota < 0 || nota > 10) {
                        System.out.println("Nota invalida! Digite um numero de 0 a 10.");
                    }

                } while (nota < 0 || nota > 10);
                notas[j] = nota;
            }
            scanner.nextLine();
            aluno[i] = new Aluno(nomeAluno, notas);
            }
            for (int i = 0; i < aluno.length; i++) {
                System.out.println(aluno[i].getNome());
                for (int j = 0; j < aluno[i].getNotas().length; j++) {
                    System.out.println("Nota : "+ aluno[i].getNotas()[j]);
                }
                System.out.println("Média: " + aluno[i].calcularMedia());
            }


        scanner.close();
    }
}
