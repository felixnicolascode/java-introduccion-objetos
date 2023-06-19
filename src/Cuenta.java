// entidad cuenta
public class Cuenta {
    // atributos
    private double saldo;
    private int agencia;
    private int numero;
    Cliente titular = new Cliente();

    // metodos
    void depositar(double valor) {
        this.saldo += valor;
    }

    public boolean retirar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean trasferir(double valor, Cuenta cuenta) {
        if (this.saldo>=valor){
            this.saldo = this.saldo - valor;
            //cuenta.saldo = cuenta.saldo + valor;
            cuenta.depositar(valor);
            return true;
        }else{
            return false;
        }

    }

    public double getSaldo(){
        return this.saldo;
    }

    public void setAgencia(int agencia) {
        if (agencia>0){
            this.agencia = agencia;
        }
    }

    public int getAgencia() {
        return agencia;
    }
}
