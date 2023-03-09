package bancos;

public class pruebaMethodo {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Cuenta cuenta = new Cuenta(2);
        cuenta.depositar(200);
        cuenta.retirar(100);
        System.out.println(cuenta.getSaldo());

        Cuenta cuentadejimena = new Cuenta(2);
        cuentadejimena.depositar(400.0);
        System.out.println(cuentadejimena.getSaldo());
        cuentadejimena.transferir(400, cuenta);
        System.out.println("Transferencia a cuenta " + cuentadejimena.transferir(400, cuenta));
        System.out.println(cuentadejimena.getSaldo());

        boolean transferir = cuentadejimena.transferir(400, cuenta);
        if (transferir) {
            System.out.println("pudiste transferir");
        } else {
            System.out.println("No puedes tranferir");
        }

        System.out.println(cuentadejimena.getSaldo());
        System.out.println(cuenta.getSaldo());
    }
}
