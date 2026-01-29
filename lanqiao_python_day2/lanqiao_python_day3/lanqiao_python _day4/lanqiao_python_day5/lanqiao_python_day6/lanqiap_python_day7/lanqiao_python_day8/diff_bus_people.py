import sys
n,m = map(int,sys.stdin.readline().split())
d =[0]*(n+2)
for _ in range(m):
    x,y = map(int,sys.stdin.readline().split())
    d[x]+=1
    d[y]-=1
ans = []
for i in range(1,n+1):
    d[i]+=d[i-1]
    ans.append(str(d[i]))
print(' '.join(ans))