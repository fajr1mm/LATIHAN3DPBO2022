<?php

class Disk{
    private $Type = "";
    private $Capacity = "";
    private $Price = 0;
    
    public function __construct($Type = "", $Capacity="", $Price = 0){
        $this->Type = $Type;
        $this->Capacity = $Capacity;
        $this->Price = $Price;
    }

    public function setType($Type){
        $this->Type = $Type;
    }

    public function getType(){
        return $this->Type;
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

    public function printDisk(){
        echo "Disk Type : ". $this->getType() ."<br>";
        echo "Disk Capacity : ". $this->getCapacity() ."<br>";
        echo "Disk Price :". $this->getPrice() ."<br>";
    }

}  
?>
