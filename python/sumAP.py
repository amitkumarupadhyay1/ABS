n=int(input("Enter a number to check for even/odd\t"))
sumEven=0
sumOdd=0
for i in range(1,n+1):
    if i%2==0:
        sumEven=sumEven+i
    else:
        sumOdd=sumOdd+i
print(f"Sum of Even numbers till {n} is {sumEven} and sum of odd numbers till {n} is {sumOdd}")