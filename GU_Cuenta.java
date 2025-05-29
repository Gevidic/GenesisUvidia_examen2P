
public class GU_Cuenta {
    float saldo;
    int numeroDepositos = 0;
    int numeroRetiros = 0;
    float tasaAnual;

    public GU_Cuenta(float saldo, float tasaAnual) {
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
    }

    public void depositar(float cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            numeroDepositos++;
            System.out.println("Depósito realizado: $" + cantidad);
        } else {
            System.out.println("Cantidad inválida para depósito.");
        }
    }

    public void retirar(float cantidad) {
        if (cantidad > 0 && saldo >= cantidad) {
            saldo -= cantidad;
            numeroRetiros++;
            System.out.println("Retiro realizado: $" + cantidad);
        } else {
            System.out.println("Cantidad inválida o saldo insuficiente.");
        }
    }

    public void mostrarSaldo() {
        System.out.println("Saldo actual: $" + saldo);
    }
}
