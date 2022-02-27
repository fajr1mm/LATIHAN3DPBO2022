class processor{
    private String name;
    private int price;
    
    public processor() {
    }
    
    public processor(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void printProcessor(){
        System.out.print("Processor       : ");
        System.out.println(getName());
        System.out.print("Processor price : ");
        System.out.println(getPrice());
    }
    
}
