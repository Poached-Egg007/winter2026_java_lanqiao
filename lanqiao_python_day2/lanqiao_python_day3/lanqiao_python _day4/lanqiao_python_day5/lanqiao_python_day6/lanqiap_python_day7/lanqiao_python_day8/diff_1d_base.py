import sys
def main():
    n,m = map(int,sys.stdin.readline().split())
    a =[0]+list(map(int,sys.stdin.readline().split()))
    d = [0]*(n+2)
    for i in range(1,n+1):
        d[i] = a[i]-a[i-1]
    for _ in range(m):
        l,r,val = map(int,sys.stdin.readline().split())
        d[l]+=val
        d[r+1]-=val
    res =[]
    for i in range(1,n+1):
        d[i]+=d[i-1]
        res.append(str(d[i]))
    print(' '.join(res))
if __name__ == '__main__':
    main()
















