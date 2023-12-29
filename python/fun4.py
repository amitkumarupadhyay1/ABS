def add(a,b):
    return a+b

def sub(a,b):
    return a-b
def multiplie(a,b):
    return a*b
def divide(a,b):
    return a/b
#function call
x=8
y=45
op=input("Enter operation")
if(op=='+'):
    z=add(x,y)
    print("add=", x+y )
elif(op=='-'):
    z=sub(x,y) 
    print("sub=",x-y)
elif(op=='*'):
    z=multiplie(x,y)
    print("multiplie=",x*y)
elif(op=='/'):
    z=divide(x,y)
    print("divide=",x/y)   
else:
    print("Invalid choice")