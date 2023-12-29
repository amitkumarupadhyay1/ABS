n=int(input("Enter a number"))
flag=1#If flag is 1-prime number and If flag is 0-composite
if n<1:
    print("Enter a value greater than")
elif n==1:
    print("Enter is neither prime nor composite")
else:
      for i in range(2,n):
          if n%i==0:
           flag=0
           break
      if flag==0:
            print("Entered number is composite")
      else:
            print("Entered number is prime")

