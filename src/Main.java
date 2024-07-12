import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Cria novos clientes, funcionários e produtos
        Cliente c1 = new Cliente("Gabriel", 17,"Cosmópolis", 19984353, "gabriel@gmail.com");
        Cliente c2 = new Cliente("Pedro", 29,"São Paulo", 1234, "pedro@gmail.com");
        Funcionario f1 = new Funcionario("Beatriz", 36, "51333031815", "Chefe",25000);
        Funcionario f2 = new Funcionario("Lucas", 27, "28235149885", "Empacotador",1200);
        Produto p1 = new Produto(1, "Mouse sem fio", 100,50);
        Produto p2 = new Produto(2, "Teclado com fio", 60,20);


        //Cria as listas
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        ArrayList<Produto> produtos = new ArrayList<>();

        //Adiciona os cliente, funcionarios e produtos nas respectivas listas
        clientes.add(c1);
        clientes.add(c2);
        funcionarios.add(f1);
        funcionarios.add(f2);
        produtos.add(p1);
        produtos.add(p2);

        //Exibe os itens
        System.out.println("CLIENTES");
        for (Cliente c: clientes){
            c.exibir();
            System.out.println();
        }

        System.out.println("---------------------------");

        System.out.println("FUNCIONÁRIOS");
        for (Funcionario f: funcionarios){
            f.exibir();
            System.out.println();
        }

        System.out.println("---------------------------");

        System.out.println("PRODUTOS");
        for (Produto p: produtos){
            p.mostraDados();
            System.out.println();
        }
    }
}