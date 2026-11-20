public class CuentaBancaria {
    // Atributos privados - encapsulados
    private String numeroCuenta;
    private String titular;
    private double saldo;

    public CuentaBancaria(String numeroCuenta, String titular) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = 0.0;
    }

    // Getters - solo lectura desde el exterior
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Deposito exitoso de $" + cantidad);
        } else {
            System.out.println("Error: la cantidad debe ser positiva.");
        }
    }

    public void retirar(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("Error: la cantidad debe ser positiva.");
        } else if (cantidad > saldo) {
            System.out.println("Error: saldo insuficiente.");
        } else {
            saldo -= cantidad;
            System.out.println("Retiro exitoso de $" + cantidad);
        }
    }

    public void transferir(CuentaBancaria cuentaDestino, double cantidad) {
        if (cuentaDestino == null) {
            System.out.println("Error: la cuenta de destino no es valida.");
        } else if (cuentaDestino == this) {
            System.out.println("Error: no se puede transferir a la misma cuenta.");
        } else if (cantidad <= 0) {
            System.out.println("Error: la cantidad debe ser positiva.");
        } else if (cantidad > saldo) {
            System.out.println("Error: saldo insuficiente para la transferencia.");
        } else {
            this.saldo -= cantidad;
            cuentaDestino.saldo += cantidad;
            System.out.println("Transferencia exitosa de $" + cantidad + " a la cuenta " + cuentaDestino.getNumeroCuenta());
        }
    }
}
