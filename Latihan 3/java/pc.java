public class pc{
    private String name;
    private processor O_processor;
    private disk O_disk;
    private ram O_ram;
    private int totalPrice;

    public pc() {
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public pc(String name, processor o_processor, disk o_disk, ram o_ram, int totalPrice) {
        this.name = name;
        O_processor = o_processor;
        O_disk = o_disk;
        O_ram = o_ram;
        this.setTotalPrice(totalPrice);
    }

    public ram getO_ram() {
        return O_ram;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public processor getO_processor() {
        return O_processor;
    }

    public void setO_processor(processor o_processor) {
        this.O_processor = o_processor;
    }

    public disk getO_disk() {
        return O_disk;
    }

    public void setO_disk(disk o_disk) {
        this.O_disk = o_disk;
    }
    
    public void setO_ram(ram o_ram) {
        this.O_ram = o_ram;
    }

    public void printPc(){
        System.out.print("Brand       : ");
        System.out.println(this.getName());
        this.O_processor.printProcessor();
        this.O_disk.printDisk();
        this.O_ram.printRam();
        System.out.println("Total Price         : " + this.getTotalPrice());
    }

    
}
