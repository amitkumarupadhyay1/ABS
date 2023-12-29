n=int(input("Enter a number till which you wnat to print the stars pattern"))
for i in range(1,n+1):
   print(' '*(n-i),'*'*(2*i-1))