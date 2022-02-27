public class pc<processor, disk, ram>{
    private String name;
    private processor O_processor;
    private disk O_disk;
    private ram O_ram;

    public pc() {
    }

    public pc(String name, processor o_processor, disk o_disk, ram o_ram) {
        this.name = name;
        O_processor = o_processor;
        O_disk = o_disk;
        O_ram = o_ram;
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

    
}
