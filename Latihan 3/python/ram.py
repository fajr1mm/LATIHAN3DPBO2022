class ram():

    __Capacity = ""
    __price = ""

    def __init__(self, Capacity = "", price = ""):
        self.__Capacity = Capacity
        self.__price = price

    def setCapacity(self, Capacity):
        self.__Capacity = Capacity

    def setPrice(self, price):
        self.__price = price

    def getCapacity(self):
        return self.__Capacity

    def getPrice(self):
        return self.__price

    def printRam(self):
        print("RAM Capacity : ", str(self.getCapacity()))
        print("RAM Price : ", str(self.getPrice()))