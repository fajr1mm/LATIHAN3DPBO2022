from functools import total_ordering
from platform import processor
from Processor import Processor
from ram import ram
from disk import disk

class pc:
    __O_Name = ""
    __O_Processor = Processor()    # menampung processor
    __O_Ram = ram()                # menampung ram
    __O_Disk = disk()              # menampung disk
    __totalPrice = 0                # menampung harga total

    # constructor
    def __init__(self, O_Name, O_Processor, O_Ram, O_Disk, totalPrice = 0):
        self.__O_Name = O_Name
        self.__O_Processor = O_Processor
        self.__O_Ram = O_Ram
        self.__O_Disk = O_Disk
        self.__totalPrice = totalPrice

    # setter and getter
    def setName(self, O_Name):
        self.__O_Name = O_Name
    
    def getName(self):
        return self.__O_Name

    def setProcessor(self, O_Processor):
        self.__O_Processor = O_Processor
    
    def getProcessor(self):
        return self.__O_Processor

    def setRAM(self, O_Ram):
        self.__O_Ram = O_Ram

    def getRAM(self):
        return self.__O_Ram

    def setDisk(self, O_Disk):
        self.__O_Disk = O_Disk
    
    def getDisk(self):
        return self.__O_Disk
    
    def setTotalPrice(self, totalPrice):
        self.__totalPrice = totalPrice
    
    def getTotalPrice(self):
        return self.__totalPrice

    # method
    def printpc(self):
        print("Brand :" + str(self.getName()))
        self.__O_Processor.printProcessor()
        self.__O_Ram.printRam()
        self.__O_Disk.printDisk()
        print("Total Price      : " + str(self.getTotalPrice()))