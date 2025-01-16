import java.util.Scanner;
    public class Main {
    public static void main(String[] args) {
        int n, option;
        Scanner scanner = new Scanner(System.in);
        n = 1;
        while(n != 0){
            System.out.println("--------------------------------------------------------------------");
            System.out.println("                Welcome to Alexandria's Library                     ");
            System.out.println("--------------------------------------------------------------------");
            System.out.println("A seguir Veja algumas funcionalidades");
            System.out.println("1- Adicionar Funcionario");
            System.out.println("2- Adicionar Bibliotecario");
            System.out.println("3- Ver Historico de Livros Emprestados");
            System.out.println("4- Ver Todos os Livros da Biblioteca");
            System.out.println("5- Adicionar Livro");
            System.out.println("0- Sair");
            System.out.println("--------------------------------------------------------------------");
            System.out.println("Insira a Opção desejada:");
            option = scanner.nextInt();
            switch(option){
                case 1: System.out.println("Adicionar Funcionario");
                break;
                case 2: System.out.println("Adicionar Bibliotecario");
                break;
            }


            n = scanner.nextInt();

        }

    }


}
