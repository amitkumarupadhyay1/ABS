import random as r
turn=3
score=100
user=0
guess=r.randint(1,10)
while(turn>0):
    user=int(input("Guess the number!"))
    turn=turn-1
    if user==guess:
        print(f"You won by {score}.")
        break
    score=score-20
print(f"Computer has guessed {guess}.")