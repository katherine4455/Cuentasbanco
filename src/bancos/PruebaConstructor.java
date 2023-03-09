package bancos;

public class PruebaConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuenta cuenta=new Cuenta(-33);
		System.out.println(cuenta.getAgencia());
		System.out.println(Cuenta.getTotal());
	}

}
