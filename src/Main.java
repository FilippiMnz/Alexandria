import java.sql.Date;
import java.util.Scanner;
    public class Main {
        public static void main(String[] args) {
            int n, option;
            Scanner scanner = new Scanner(System.in);
            n = 1;
            while (n != 0) {
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
                switch (option) {
                    case 1:
                        System.out.println("Adicionar Funcionario");
                        break;
                    case 2:
                        System.out.println("Adicionar Bibliotecario");
                        break;
                    case 3:
                        System.out.println("Ver Historico de Livros Emprestados");
                        break;
                    case 4:
                        System.out.println("Ver Todos livros ");
                        break;
                    case 5:
                        System.out.println("Adicionar Livro");
                        break;
                    case 0:
                        break;

                }


                n = scanner.nextInt();

            }

        }

    }
    class Pessoa{
        public String Nome;
        public int Id;
        public Date data_nascimento;
        public String CPF;
        public String Email;

        public Pessoa(String _Nome, String _CPF, Date _data_nascimento, String _Email, int _Id) {
            this.Nome = _Nome;
            this.CPF = _CPF;
            this.data_nascimento = _data_nascimento;
            this.Email = _Email;
            this.Id = _Id;
        }
    }
    class Funcionario extends Pessoa{
        public Funcionario(String _Nome, String _CPF, Date _data_nascimento, String _Email, int _Id) {
            super(_Nome, _CPF, _data_nascimento, _Email, _Id);
        }
        public double Salario;
        public String Cargo;
        public Date DataAdmissao;
    }

    class Cliente extends Pessoa{
        public Cliente(String _Nome, String _CPF, Date _data_nascimento, String _Email, int _Id) {
            super(_Nome, _CPF, _data_nascimento, _Email, _Id);
        }
        public int QtdLivrosPegos;
        public Date DataVencimento;
    }
    class Livro {
        public String Nome;
        public String Autor;
        public int Id;
        public int Quantidade;
        public int Valor;
    }

