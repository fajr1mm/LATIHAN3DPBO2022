#include <iostream>
#include <string>

using namespace std;

class ram{
    private:
    string capacity;
    int price;

    public:
    ram(){
        this->capacity = "";
        this->price = 0;
    }

    ram(string capacity, int price){
        this->capacity = capacity;
        this->price = price;
    }

    void setcapacity(string capacity){
        this->capacity = capacity;
    }

    void setprice(int price){
        price = price;
    }


    string getcapacity(){
        return this->capacity;
    }

    int getprice(){
        return this->price;
    }

    void printRam(){
       cout << "RAM             : " << this->capacity << endl;
       cout << "RAM Price       : " << this->price << endl;
    }

    ~ram(){}
};