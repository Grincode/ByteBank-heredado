
public class TestFuncionario {

	public static void main(String[] args) {
		Funcionario juan = new Funcionario();
		juan.setNombre("Juan");
		juan.setDocumento("33221322");
		juan.setSalario(2000.0);
		juan.setTipo(0);

		System.out.println(juan.getSalario());
		System.out.println(juan.getBonificacion());

	}

}
