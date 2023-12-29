a='y'
while a=='y':
    weight=float(input('Enter the weight in/kg'))
    height=float(input('Enter the height in meter'))
    bmi= weight / (height**2)
    print(f"Your BMI is {bmi}.")
    if bmi<18:
        print("under weight")
    elif bmi>18 and bmi<26:
        print("normal weight")
    else:
        print("over weight")
    a=input('do you want to calculate another(Enter y for yes):')

      
