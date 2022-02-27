#include <iostream>
#include <string>

using namespace std;

class processor{
    private:
    string name;
    int price;

    public:
    processor(){
        this->name = "";
        this->price = 0;
    }

    processor(string name, int price){
        this->name = name;
        this->price = price;
    }

    void setName(string name){
        name = name;
    }

    void setprice(int price){
        this->price = price;
    }

    string getName(){
        return this->name;
    }

    int getprice(){
        return this->price;
    }

    void printProcessor(){
        cout << "Processor       : " << this->name << endl;
        cout << "Processor price : " << this->price << endl;
    }

    ~processor(){}
};