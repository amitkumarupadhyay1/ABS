eat=True #global variable
def birds():
    canflyB=True  #local variable
    return canflyB

def animals():
    canflyA=False   #local variable
    return canflyA
if __name__=="__main__":
    print(birds())
    print(eat)
else:
    print(animals())