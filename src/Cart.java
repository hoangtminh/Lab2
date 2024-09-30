public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private static int qtyOrdered = 0;
    private static DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];

    public DigitalVideoDisc[] getItemsOrdered() {
        return itemsOrdered;
    }

    public int getQtyOrdered() {
        return qtyOrdered;
    }
    
    public void printOrdered() {
        System.out.print(qtyOrdered + ": ");
        for (int i = 0; i < qtyOrdered; i++ ) {
            System.out.print(itemsOrdered[i].getTitle() + " ");
        }
        System.out.println();
    }

    public void addDigitalVideoDisc(DigitalVideoDisc dvd) {
        if (getQtyOrdered() < 20) {
            // DigitalVideoDisc newOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
            itemsOrdered[qtyOrdered] = dvd;
            qtyOrdered++;
            System.out.println("The disc has been added, " + qtyOrdered + " discs");
        } else {
            System.out.println("The cart is full");
        }
        printOrdered();

    }
    public void removeDigitalVideoDisc(DigitalVideoDisc dvd) {
        int index = -1;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].getTitle() == dvd.getTitle()) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("There is no disc with this title");
        } else {
            DigitalVideoDisc newOrder[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
            System.arraycopy(itemsOrdered, 0, newOrder, 0, index);
            System.arraycopy(itemsOrdered, index+1, newOrder, index, qtyOrdered-index);
            qtyOrdered--;
            itemsOrdered = newOrder;

            System.out.println("Remove disc successfully");
        }

        printOrdered();
    }
}
