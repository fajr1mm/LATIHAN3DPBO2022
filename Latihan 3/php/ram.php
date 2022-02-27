<?php

class Ram{
    private $Capacity = "";
    private $Price = 0;
    
    public function __construct($Capacity = "", $Price = 0){
        $this->Capacity = $Capacity;
        $this->Price = $Price;
    }

    public function setCapacity($Capacity){
        $this->Capacity = $Capacity;
    }

    public function getCapacity(){
        return $this->Capacity;
    }

    public function setPrice($Price){
        $this->Price = $Price;
    }

    public function getPrice(){
        return $this->Price;
    }

    public function printRAM(){
        echo "RAM Capacity : ". $this->getCapacity() ."<br>";
        echo "RAM Price : ". $this->getPrice() ."<br>";
    }

}  
?>
