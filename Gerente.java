public class Gerente extends Pessoa {
    public Gerente(String nome, String email) {
        super(nome, email);
    }

    @Override
    public String getPerfil() {
        return "Gerente";
    }

    @Override
    public void acessarSistema() {
        System.out.println("Gerente " + getNome() + " está acessando o painel de gerenciamento Itaú.");
    }
}
