def fact(a):
    if a>0:
        return a*fact(a-1)
    else:
        return 1

n=int(input("Enter the number of which you want to calculate the Factorial: "))
print(fact(n))
