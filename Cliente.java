public class Cliente extends Pessoa {

    public Cliente(String nome, String email) {
        super(nome, email);
    }

    @Override
    public String getPerfil() {
        return "Cliente";
    }

    @Override
    public void acessarSistema() {
        // TODO Auto-generated method stub
        System.out.println("Cliente " + getNome() + " está acessando sua conta Itaú.");
    }

}
