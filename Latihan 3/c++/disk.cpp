#include <iostream>
#include <string>

using namespace std;

class disk{
    private:
    string type;
    string capacity;
    int price;

    public:
    disk(){
        this->type = "";
        this->capacity = "";
        this->price = 0;
    }

    disk(string type, string capacity, int price){
        this->type = type;
        this->capacity = capacity;
        this->price = price;
    }

    void settype(string type){
        type = type;
    }

    void setcapacity(string capacity){
        this->capacity = capacity;
    }

    void setprice(int price){
        this->price = price;
    }

    string gettype(){
        return this->type;
    }

    string getcapacity(){
        return this->capacity;
    }

    int getprice(){
        return this->price;
    }

    void printDisk(){
       cout << "Disk            : " << this->type << endl;
       cout << "Disk Capacity   : " << this->capacity << endl;
       cout << "Disk Price      : " << this->price << endl;
    }

    ~disk(){}
};