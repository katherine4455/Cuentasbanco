package bancos;

public class PruebaAcceso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuenta cuenta=new Cuenta(-20);
		//cuenta.saldo=100;
		cuenta.retirar(300);
		System.out.println(cuenta.getSaldo());

	}

}
