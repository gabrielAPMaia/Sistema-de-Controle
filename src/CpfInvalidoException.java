public class CpfInvalidoException extends Exception{
    @Override
    public String getMessage() {
        return "Cpf inválido!";
    }
}
