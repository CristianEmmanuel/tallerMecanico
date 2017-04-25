public class Main {

    public static void main(String[] args) {
        autos a = new autos();
        a.setMarca("Lamborgini");
        a.setModelo("zonda");
        a.setColor("magento");

        System.out.println("El nuevo modelo en el taller es : " + a.getMarca());
    }
}
