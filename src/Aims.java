public class Aims {
    public static void main(String[] args) {

        Cart anOrder = new Cart();
        
        DigitalVideoDisc[] dvdList = new DigitalVideoDisc[5];
        
        for (int i = 0; i < 5; i++){
            dvdList[i] = new DigitalVideoDisc(i+"");
            System.out.println(dvdList[i].getTitle());
        }

        anOrder.addDigitalVideoDisc(dvdList);
        
        System.out.println(anOrder.getQtyOrdered());
        anOrder.searchDiscByTitle("3");
    }
}
