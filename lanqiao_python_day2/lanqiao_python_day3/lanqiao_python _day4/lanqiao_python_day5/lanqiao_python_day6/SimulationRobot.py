import sys
s = sys.stdin.readline().strip()
x,y = 0,0
for c in s:
    if c =="U":
        y+=1
    elif c=="D":
        y-=1
    elif c=="L":
        x-=1
    elif c=="R":
        x+=1
print(f"({x},{y})")