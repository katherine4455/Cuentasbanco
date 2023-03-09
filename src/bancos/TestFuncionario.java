package bancos;

public class TestFuncionario {
public static void main(String[] args) {
	Funcionario katherine= new Funcionario();
	katherine.setDocumento("10900090");
	katherine.setNombre("Katherine");
	katherine.setSalario(1000000);
	System.out.println(katherine.getNombre());
	System.out.println(katherine.getBonificacion());
}
}
