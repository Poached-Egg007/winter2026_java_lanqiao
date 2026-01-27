import sys
def is_leap(year):
    if(year%4==0 and year%100!=0)or(year%400==0):
        return True
    return False
y,d = map(int,sys.stdin.readline().strip().split())
month_days =[31,28,31,30,31,30,31,31,30,31,30,31]
if is_leap(y):
    month_days[1]=29
month = 0
while d >month_days[month]:
    d-=month_days[month]
    month+=1
print(f"{month+1}/{d}")