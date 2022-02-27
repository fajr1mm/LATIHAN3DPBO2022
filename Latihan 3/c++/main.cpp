#include <bits/stdc++.h>
#include <string>

using namespace std;

#include "pc.cpp"

int main(){
    int n = 0;
    cin >> n;

    //processor class
    string processorName;
    int processorPrice;

    //disk class
    string type,capacity;
    int diskPrice;

    //ram class
    string size;
    int ramPrice;

    //pc class
    string pcName;

    //class to array
    processor arrProcessor[n];
    disk arrDisk[n];
    ram arrRam[n];
    pc arrPc[n];

    int i = 0;
    for(i=0; i<n; i++){
        //pc class
        cout << "Input Brand           : ";
        cin >> pcName;
        //processor class
        cout << "Input Processor       : ";
        cin >> processorName;
        cout << "Input Processor Price : ";
        cin >> processorPrice;
        //disk class
        cout << "Input Type Disk       : ";
        cin >> type;
        cout << "Input Disk Capacity   : ";
        cin >> capacity;
        cout << "Input Disk Price      : ";
        cin >> diskPrice;
        //ram class
        cout << "Input RAM size        : ";
        cin >> size;
        cout << "Input RAM Price       : ";
        cin >> ramPrice;

        if(i == n-1){
            cout << "=======================";
        }else if(i < n-1){
            cout << endl;
        }

        arrProcessor[i] = processor(processorName, processorPrice);
        arrDisk[i] = disk(type, capacity, diskPrice);
        arrRam[i] = ram(size, ramPrice);
        arrPc[i] = pc(pcName, arrProcessor[i], arrDisk[i], arrRam[i], arrProcessor[i].getprice() + arrDisk[i].getprice() + arrRam[i].getprice());
    }

    for(i=0; i<n; i++){
        arrPc[i].printPc();
    }
}