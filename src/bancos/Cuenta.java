package bancos;
public class Cuenta {

	private double saldo;
	private int agencia;
	private int numero; 
	Cliente titular=new Cliente();
	private static int total=0;//es de la clase
	
	public static int getTotal() {
		return total;
	}

	public static void setTotal(int total) {
		Cuenta.total = total;
	}

	/*public Cuenta() {
		
	}
	*/
	public Cuenta(int agencia) {
		if(agencia<=0) {
			System.out.println("Te equivocaste");
			this.agencia=1;
		}
		total++;
	}
	
	public void depositar(double saldo){
		//this cuenta=this cuenta
	this.saldo=this.saldo+saldo;
	}
	public boolean retirar(double valor){
		if (this.saldo>=valor) {
			this.saldo=this.saldo-valor;
					return true;
		}
		else {
			return false;
		}
	}
	public boolean transferir(double valor, Cuenta cuenta){
		if (this.saldo>=valor) {
			this.saldo=this.saldo-valor;
			cuenta.depositar(valor);
			return true;
		}
		else {
			return false;
		}
	}
	public double getSaldo() {
		return this.saldo;
	}
	public void setAgencia(int agencia) {
		if(agencia>0) {
			this.agencia=agencia;
		}
		
	}
	public int getAgencia() {
		return agencia;
	}
}
