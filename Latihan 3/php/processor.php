<?php

class Processor{
    private $Name = "";
    private $Price = 0;
    
    public function __construct($Name = "", $Price = 0){
        $this->Name = $Name;
        $this->Price = $Price;
    }

    public function setName($Name){
        $this->Name = $Name;
    }

    public function getName(){
        return $this->Name;
    }

    public function setPrice($Price){
        $this->Price = $Price;
    }

    public function getPrice(){
        return $this->Price;
    }

    public function printProcessor(){
        echo "Processor : ". $this->getName() ."<br>";
        echo "Processor Price : ". $this->getPrice() ."<br>";
    }

}  
?>
