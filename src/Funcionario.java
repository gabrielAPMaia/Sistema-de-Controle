public class Funcionario extends Pessoa{

    private String cpf;
    private String cargo;
    private double salario;

    public Funcionario(){}

    public Funcionario(String nome, int idade, String cpf, String cargo, double salario) {
        super(nome, idade);

        //Cpf deve ter 11 caracteres
        try{
            if (cpf.length()!=11){
                throw new CpfInvalidoException();
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        this.cpf = cpf;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        try{
            if (cpf.length()!=11){
                throw new CpfInvalidoException();
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        this.cpf = cpf;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public void exibir() {
        super.exibir();
        System.out.println("CPF: "+cpf);
        System.out.println("Cargo: "+cargo);
        System.out.println("Salário: "+salario);
    }
}
