n=int(input("Enter a number"))
sum=0
for i in range (1,n+1):
    sum=sum+i/i*(i+1)
    if i<n:
        print(f'{i}/{i}*{i+1}+',end='')
    else:
        print(f'{i}/{i}*{i+1}',end='')
print(f"= {sum}")