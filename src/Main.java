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
                System.out.println("2- Ver Historico de Livros Emprestados");
                System.out.println("3- Ver Todos os Livros da Biblioteca");
                System.out.println("4- Sistema Livros");
                System.out.println("5- Gerenciamento de Usuarios");
                System.out.println("0- Sair");
                System.out.println("--------------------------------------------------------------------");
                System.out.println("Insira a Opção desejada:");
                option = scanner.nextInt();
                switch (option) {
                    case 1:
                        System.out.println("Adicionar Funcionario");
                        break;
                    case 2:
                        System.out.println("Ver Historico de Livros Emprestados");
                        break;
                    case 3:
                        System.out.println("Ver Todos livros ");
                        break;
                    case 4:
                        System.out.println("Sistema Livros");
                        break;
                    case 5:
                        System.out.println("Gerenciamento de Usuarios");
                    case 0:
                        break;

                }


                n = scanner.nextInt();

            }

        }

    }
    class Pessoa{
        private String Nome;
        private int Id;
        private Date data_nascimento;
        private String CPF;
        private String Email;

        private Pessoa(String _Nome, String _CPF, Date _data_nascimento, String _Email, int _Id) {
            this.Nome = _Nome;
            this.CPF = _CPF;
            this.data_nascimento = _data_nascimento;
            this.Email = _Email;
            this.Id = _Id;
        }

        public String getPessoa(){
         return Nome;
        }
        public String SetPessoa(String _Nome){
            this.Nome = _Nome;
            return Nome;
        }
    }
    class Funcionario {
        private double Salario;
        public String Cargo;
        private Date DataAdmissao;
    }

    class Cliente {
        public int QtdLivrosPegos;
        public Date DataVencimento;
    }
    class Livro {
        public String Nome;
        public String Autor;
        public int Id;
        public int Quantidade;
        public int Valor;

        public Livro(String nome, int id, int quantidade) {
        }
    }

    class EmprestimoLivros extends Livro{
        public EmprestimoLivros(String _Nome, int _Id, int _Quantidade){
            super(_Nome, _Id, _Quantidade);
        }
    }

    class CadastroUsuarios {

    }

    // banir usuario
    // remover usuario
    //extender emprestimo
    //Vender Livro
    //Multa por atraso
    //demitir Funcionario
    //calculo Horas-extra
    //promoção
    //aumento
    //Justa-causa
    // Rescisão


