class disk():

    __Type = ""
    __Capacity = ""
    __Price = ""

    def __init__(self, Type = "", Capacity = "", Price = ""):
        self.__Type = Type
        self.__Capacity = Capacity
        self.__Price = Price

    def setType(self, Type):
        self.__Type = Type

    def setCapacity(self, Capacity):
        self.__Capacity = Capacity

    def setPrice(self, Price):
        self.__Price = Price

    def getType(self):
        return self.__Type

    def getCapacity(self):
        return self.__Capacity

    def getPrice(self):
        return self.__Price

    def printDisk(self):
        print("Disk Type : ", str(self.getType()))
        print("Disk Capacity : ", str(self.getCapacity()))
        print("Disk Price : ", str(self.getPrice()))