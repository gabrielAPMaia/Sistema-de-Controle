public abstract class Pessoa implements IPessoa{
    protected String nome;
    protected int idade;

    public Pessoa (){}

    public Pessoa(String nome, int idade){
        //Nome não pode ser vazio
        try{
            if (nome.isEmpty()){
                throw new NomeInvalidoException();
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        this.nome = nome;

        //Idade não pode ser negativa
        try{
            if (idade <= 0){
                throw new IdadeInvalidaException();
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        try{
            if (nome.isEmpty()){
                throw new NomeInvalidoException();
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        try{
            if (this.idade <= 0){
                throw new IdadeInvalidaException();
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        this.idade = idade;
    }

    @Override
    public void exibir() {
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
    }
}
