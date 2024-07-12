public class Cliente extends Pessoa{

    private String endereco;
    private int telefone;
    private String email;

    public Cliente (){}

    public Cliente(String nome, int idade, String endereco, int telefone, String email) {
        super(nome, idade);
        this.endereco = endereco;
        this.telefone = telefone;
        try{
            if (!email.contains("@")){
                throw new EmailInvalidoException();
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        this.email = email;
    }

    @Override
    public void exibir() {
        super.exibir();
        System.out.println("Endereço: "+endereco);
        System.out.println("Telefone: "+telefone);
        System.out.println("Email: "+email);
    }
}
