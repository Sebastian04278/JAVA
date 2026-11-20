public class MainCuenta {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("001-2345", "Carlos Perez");
        CuentaBancaria cuentaDestino = new CuentaBancaria("002-6789", "Ana Gomez");
        System.out.println("Titular: " + cuenta.getTitular());
        System.out.println("Saldo inicial: $" + cuenta.getSaldo());
        cuenta.depositar(500000);
        cuenta.retirar(150000);
        cuenta.retirar(1000000); // Debe fallar por saldo insuficiente
        cuenta.transferir(cuentaDestino, 100000);
        System.out.println("Saldo final de Carlos: $" + cuenta.getSaldo());
        System.out.println("Saldo de Ana: $" + cuentaDestino.getSaldo());
    }

    public static void main1(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria("001-2345", "Carlos Perez");
        CuentaBancaria cuenta2 = new CuentaBancaria("002-6789", "Ana Gomez");

        System.out.println("Titular de la cuenta 1: " + cuenta1.getTitular());
        System.out.println("Titular de la cuenta 2: " + cuenta2.getTitular());

        cuenta1.depositar(1000);
        System.out.println("Saldo de la cuenta 1 después del depósito: $" + cuenta1.getSaldo());

        cuenta1.transferir(cuenta2, 300);
        System.out.println("Saldo de la cuenta 1 después de la transferencia: $" + cuenta1.getSaldo());
        System.out.println("Saldo de la cuenta 2 después de recibir la transferencia: $" + cuenta2.getSaldo());
    }
}