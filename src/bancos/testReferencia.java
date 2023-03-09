package bancos;

public class testReferencia {
	public static void main(String[] args) {
	Cliente Diego=new Cliente();
	Diego.setNombre("Diego");
	Cuenta cuentaDeDiego=new Cuenta(-30);
	cuentaDeDiego.titular=Diego;
	Cuenta cuentakatherine=new Cuenta(-31);
	//Siempre iniciar los objetos
	//cuentakatherine.titular=new Cliente();
	//cuentakatherine.titular.nombre="Katherine"; o inicializar en la cuenta
	cuentakatherine.titular.setNombre("Katherine");
	System.out.println(cuentakatherine.titular.getNombre());
	cuentakatherine.setAgencia(1);
	}
}
