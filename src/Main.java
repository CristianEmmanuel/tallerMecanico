public class Main {

    public static void main(String[] args) {
        Auto a = new Auto();
        a.setMarca("Maybach");
        a.setModelo("Exelero");
        a.setColor("Black");
        a.setValor(8000000);

        Auto a1 = new Auto();
        a1.setMarca("Koenigsegg");
        a1.setModelo("CCXR Trevita");
        a1.setColor("Grey");
        a1.setValor(4800000);

        Auto a2 = new Auto();
        a2.setMarca("Lamborghini");
        a2.setModelo("Veneno");
        a2.setColor("Grey");
        a2.setValor(4300000);

        Auto a3 = new Auto();
        a3.setMarca("Koenigsegg");
        a3.setModelo("One");
        a3.setColor("Red");
        a3.setValor(3400000);

        Auto a4 = new Auto();
        a4.setMarca("Lykan");
        a4.setModelo("Hypersport");
        a4.setColor("Blue");
        a4.setValor(3000000);

        Auto a5 = new Auto();
        a5.setMarca("Bugatti");
        a5.setModelo("Chiron");
        a5.setColor("Black and Grey");
        a5.setValor(2600000);

        System.out.println("El nuevo modelo en el taller es : " + a.getMarca());
    }
}
