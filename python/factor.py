n=int(input("Enter the number which you want to calculate the factors\t "))
print("Facter of the entered number are:\n")
for i in range(1,n+1):
    if n%i==0:
        print(i)

  