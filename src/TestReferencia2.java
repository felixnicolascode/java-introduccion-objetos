public class TestReferencia2 {
    public static void main(String[] args) {
        Cliente diego = new Cliente();
        diego.setNombre("Diego");
        diego.setDocumento("45444332");
        diego.setTelefono("9999222222");

        Cuenta cuentaDeDiego = new Cuenta();
        cuentaDeDiego.setAgencia(1);
        cuentaDeDiego.setTitular(diego);

        System.out.println(cuentaDeDiego.getTitular().getDocumento());
        System.out.println(cuentaDeDiego.getTitular());
        System.out.println(diego);

    }
}
