class disk{
    private String type;
    private String capacity;
    private int price;
    
    public disk() {
    }

    public disk(String type, String capacity, int price) {
        this.type = type;
        this.capacity = capacity;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void printDisk(){
        System.out.print("Disk            : ");
        System.out.println(getType());
        System.out.print("Disk Capacity   : ");
        System.out.println(getCapacity());
        System.out.print("Disk Price      : ");
        System.out.println(getPrice());
    }

}