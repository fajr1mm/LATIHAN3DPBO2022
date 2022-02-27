public class ram {
    private String capacity;
    private int price;

    public ram() {
    }

    public ram(String capacity, int price) {
        this.capacity = capacity;
        this.price = price;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getCapacity() {
        return capacity;
    }
    
    public void printRam(){
        System.out.print("RAM             : ");
        System.out.println(getCapacity());
        System.out.print("RAM Price       : ");
        System.out.println(getPrice());
    }
    
}
