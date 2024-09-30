public class Aims {
    public static void main(String[] args) {

        Cart anOrder = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("1");
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("2");
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("3");
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("4");
        DigitalVideoDisc dvd5 = new DigitalVideoDisc("5");

        anOrder.addDigitalVideoDisc(dvd1);
        anOrder.addDigitalVideoDisc(dvd2);
        anOrder.addDigitalVideoDisc(dvd3);
        anOrder.addDigitalVideoDisc(dvd4);
        anOrder.addDigitalVideoDisc(dvd5);
        anOrder.removeDigitalVideoDisc(dvd2);
        anOrder.removeDigitalVideoDisc(dvd4);
        
        System.out.println(anOrder.getQtyOrdered());
    }
}
