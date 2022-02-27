public class main {
    public static void main(String[] args) {
        // inisialisasi 
        processor O_processor = new processor("Ryzen 9 5900X", 8495000);
        ram O_Ram = new ram("32GB", 2600000);
        disk O_disk = new disk("SSD", "2TB", 6000000);
    
        // menghitung harga total
        int totalPrice = O_processor.getPrice() + O_Ram.getPrice() + O_disk.getPrice();

        // masukan semua komponen ke PC
        pc O_pc = new pc("Lenovo", O_processor, O_disk, O_Ram, totalPrice);

        // output
        O_pc.printPc();
    }
}