<?php

include "processor.php";
include "ram.php";
include "disk.php";

class Pc {
    private $Name;
    private $O_processor;
    private $O_Ram;      
    private $O_disk;       
    private $totalPrice;    

    // constructor
    function __construct($Name, $O_processor, $O_Ram, $O_disk, $totalPrice) {
        $this->Name = $Name;
        $this->O_processor = $O_processor;
        $this->O_Ram = $O_Ram;
        $this->O_disk = $O_disk;
        $this->totalPrice = $totalPrice;
    }

    // setter and getter
    function setName($Name) {
        $this->Name = $Name;
    }

    function getName() {
        return $this->Name;
    }

    function setProcessor($O_processor) {
        $this->O_processor = $O_processor;
    }

    function getProcessor() {
        return $this->O_processor;
    }

    function setRAM($O_Ram) {
        $this->O_Ram = $O_Ram;
    }

    function getRAM() {
        return $this->O_Ram;
    }

    function setDisk($O_disk) {
        $this->O_disk = $O_disk;
    }

    function getDisk() {
        return $this->O_disk;
    }

    function setTotalPrice($totalPrice) {
        $this->totalPrice = $totalPrice;
    }

    function getTotalPrice() {
        return $this->totalPrice;
    }

    // method
    function printPc() {
        echo "Brand :". $this->getName(). "<br>";
        $this->O_processor->printProcessor();
        $this->O_Ram->printRAM();
        $this->O_disk->printDisk();
        echo "Total Price       : ". $this->getTotalPrice(). "<br>";
    }
}

?>