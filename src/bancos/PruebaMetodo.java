package bancos;

public class PruebaMetodo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuenta cuenta= new Cuenta(-1);
		cuenta.depositar(200);
		
		cuenta.retirar(100);
		//System.out.println(cuenta.saldo);
		Cuenta cuentadejimena=new Cuenta(0);
		cuentadejimena.depositar(400.0);
		//System.out.println(cuentadejimena.saldo);
		cuentadejimena.transferir(400, cuenta);
		System.out.println(cuentadejimena.transferir(400, cuenta));
	//	System.out.println(cuentadejimena.saldo);
		
		boolean transferir=cuentadejimena.transferir(400, cuenta);
		if(transferir) {
			System.out.println("pudiste transferir");
		}else {
			System.out.println("No puedes tranferir");
		}
		
		//System.out.println(cuentadejimena.saldo);
		//System.out.println(cuenta.saldo);
	}
}
