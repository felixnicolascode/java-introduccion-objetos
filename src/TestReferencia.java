public class TestReferencia {
    public static void main(String[] args) {
        Cuenta primeraCuenta = new Cuenta();
        primeraCuenta.saldo = 200;

        Cuenta segundaCuenta = primeraCuenta;
        segundaCuenta.saldo = 100;
        System.out.println(segundaCuenta.saldo);

        System.out.println("Saldo primera cuenta: "+primeraCuenta.saldo);
        System.out.println("Saldo segunda cuenta: "+segundaCuenta.saldo);

        // al compartir el espacio en memoria si incremento la segunda cuenta se modifica el valor de la primera
        segundaCuenta.saldo += 400;
        System.out.println("Saldo primera cuenta: "+primeraCuenta.saldo);

        // esta operación demuestra que ambos objetos apuntan al mismo espacio en memoria
        System.out.println(primeraCuenta);
        System.out.println(segundaCuenta);

        if (primeraCuenta==segundaCuenta){
            System.out.println("Son el mismo objeto");
        }else{
            System.out.println("Son diferentes");
        }

    }
}
