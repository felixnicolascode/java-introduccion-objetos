public class CrearCuenta {
    public static void main(String[] args) {

        Cuenta primeraCuenta = new Cuenta(); // la clase opera como tipo de dato al declarar el objeto
        primeraCuenta.saldo = 1000;

        System.out.println(primeraCuenta.saldo);

        Cuenta segundaCuenta = new Cuenta();
        segundaCuenta.saldo = 500;
        System.out.println(segundaCuenta.saldo);

    }
}
