public class Funcionario extends Pessoa {

    public Funcionario(String nome, String email) {
        super(nome, email);
    }

    @Override
    public String getPerfil() {
        return "Funcionario";
    }

    @Override
    public void acessarSistema() {
        System.out.println("Funcionário " + getNome() + " está acessando o sistema interno Itaú.");
    }

}
