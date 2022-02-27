class Processor():

    __name = ""
    __price = ""

    def __init__(self, name = "", price = ""):
        self.__name = name
        self.__price = price

    def setName(self, name):
        self.__name = name

    def setPrice(self, price):
        self.__price = price

    def getName(self):
        return self.__name

    def getPrice(self):
        return self.__price

    def printProcessor(self):
        print("Processor : ", str(self.getName()))
        print("Country : ", str(self.getPrice()))