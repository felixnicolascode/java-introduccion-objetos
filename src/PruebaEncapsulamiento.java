public class PruebaEncapsulamiento {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta();

        Cliente cliente = new Cliente();

        cliente.setNombre("Diego");
        cliente.setDocumento("f4f4f4f4");

        cuenta.setTitular(cliente);

        Cliente titular = cuenta.getTitular();

        // estos 3 caminos apuntan al mismo espacio en memoria
        System.out.println(cliente);
        System.out.println(cuenta.getTitular());
        System.out.println(titular);


    }
}
