<?php
include "pc.php";

$O_processor = new Processor("Core i7", "5000000");
$O_ram = new Ram("16GB", "1700000");
$O_disk = new Disk("SSD", "1TB", "2500000");
$totalPrice = $O_processor->getPrice() + $O_ram->getPrice() + $O_disk->getPrice();
$O_Pc = new Pc("Asus", $O_processor, $O_ram, $O_disk, $totalPrice);

$O_Pc->printPc();

?>
