n=int(input("Enter a number of seconds "))
s=0
h=0
m=0
d=0
if n<0:
    print("Entered value is invalid")
elif n>=0 and n<3600:
    m=n//60
    s=n%60
    print(f"{n} seconds has {m} minutes and {s} seconds.")
elif n>=3600 and n<86400:
    h=n//3600
    m=(n%3600)//60
    s=(n%3600)%60
    print(f"{n} seconds has {h} hours, {m} minutes and {s} seconds.")
elif n>=86400:
    d=n//86400
    h=(n%86400)//3600
    m=((n%86400)%3600)//60
    s=((n%86400)%3600)%60
    print(f"{n} seconds has {d} days, {h} hours, {m} minutes and {s} seconds.")
else:
    print("Entered value is invalid!")