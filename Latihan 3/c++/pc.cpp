#include <iostream>
#include <string>

using namespace std;

#include "processor.cpp"
#include "disk.cpp"
#include "ram.cpp"

class pc{
    private:
    string name;
    processor O_processor;
    disk O_disk;
    ram O_ram;
    int totalPrice;

    public:
    pc(){
    }

    pc(string name, processor O_processor, disk O_disk, ram O_ram, int totalPrice){
        this->name = name;
        this->O_processor = O_processor;
        this->O_disk = O_disk;
        this->O_ram = O_ram;
        this->totalPrice = O_processor.getprice() + O_disk.getprice() + O_ram.getprice();
    }

    void setname(string name){
        this->name = name;
    }

    void setO_processor(processor O_processor){
        this->O_processor = O_processor;
    }

    void setO_disk(disk O_disk){
        this->O_disk = O_disk;
    }

    void setO_ram(ram O_ram){
        this->O_ram = O_ram;
    }

    void setTotalprice(int totalPrice){
        this->totalPrice = totalPrice;
    }


    string getname(){
        return this->name;
    }

    processor getO_processor(){
        return this->O_processor;
    }

    disk getO_disk(){
        return this->O_disk;
    }

    ram getO_ram(){
        return this->O_ram;
    }

    int getTotalprice(){
        return this->totalPrice;
    }

    void printPc(){
        cout << endl;
        cout << "Brand           : " << this->name << endl;
        O_processor.printProcessor();
        O_disk.printDisk();
        O_ram.printRam();
        cout << "Total Price     : " << this->totalPrice << endl;
        cout << "=================";
    }

    ~pc(){}
};