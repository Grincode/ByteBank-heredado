public class TestGerente {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        // gerente.setSalario(5000.0);

        // Funcionario gerente = new Funcionario();
        gerente.setSalario(6000.0);
        gerente.setClave("Alura");
        gerente.setTipo(1);

        System.out.println(gerente.getBonificacion());
        System.out.println(gerente.iniciarSesion("Alura"));
    }

}
