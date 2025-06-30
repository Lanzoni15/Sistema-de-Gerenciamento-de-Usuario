public class Teste {
    public static void main(String[] args) {
        SistemaItau sistema = new SistemaItau();

        Cliente cliente = new Cliente("Maria", "maria@gmail.com");
        Funcionario funcionario = new Funcionario("Arthur", "arthur@itau.org.br");
        Gerente gerente = new Gerente("Carlos", "carlos@itau.org.br");

        sistema.adicionarUsuario(cliente);
        sistema.adicionarUsuario(funcionario);
        sistema.adicionarUsuario(gerente);
        
        sistema.listarAcessos();

    }
}
