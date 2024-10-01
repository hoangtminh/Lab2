public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    private int id;
    
    private static int nbDigitalVideoDisc = 0;
    
    public DigitalVideoDisc(String title) {
        this.title = title.toString();
        nbDigitalVideoDisc++;
        this.id = nbDigitalVideoDisc;
    }
    
    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getCategory() {
        return category;
    }
    public String getDirector() {
        return director;
    }
    public int getLength() {
        return length;
    }
    public float getCost() {
        return cost;
    }

    public DigitalVideoDisc() {

    }

}