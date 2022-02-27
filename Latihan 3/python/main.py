from Processor import Processor
from ram import ram
from disk import disk
from pc import pc

# inisialisasi
O_Processor = Processor("Core i 7", 5000000)
O_Ram = ram("32GB", 1700000)
O_Disk = disk("SSD", "1TB", 2500000)

# menghitung total harga
totalPrice = O_Processor.getPrice() + O_Ram.getPrice() + O_Disk.getPrice()

# masukan semua komponen ke pc
O_pc = pc("Asus", O_Processor, O_Ram, O_Disk, totalPrice)

# output
O_pc.printpc()