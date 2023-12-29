p=float(input("Enter principal amount"))
r=float(input("Enter rate of interest"))
t=float(input("Enter time(in years)"))
si=p*r*t/100
a=si+p
print(f"Simple interest on the principal Rs.{p}/- @ of {r}% for tenure of {t} years is Rs.{si}/-")
print(f"Total payable amount is Rs.{a}/-")
emi=a/(t*12)
print(f"The monthly emi is Rs.{emi}/-")
a=p*(1+r/100)**t
ci=a-p
print("****************************************************")
print("****************************************************")
print(f"Compound interest on the principal Rs.{p}/- @ of {r}% for tenure of {t} years is Rs.{ci}/-")
print(f"Total payable amount is Rs.{a}/-")
emi=a/(t*12)
print(f"The monthly emi is Rs.{emi}/-")
print(f"In case of CI, you have to pay an extra amount of Rs.{ci-si}/-")
