import sys
def main():
    n,m = map(int,sys.stdin.readline().split())
    arr = [0]+list(map(int,sys.stdin.readline().strip().split()))
    pre_sum = [0]*(n+1)
    for i in range(1,n+1):
        pre_sum[i] = pre_sum[i-1] + arr[i]
    for _ in range(m):
        l,r = map(int,sys.stdin.readline().strip().split())
        res = pre_sum[r] - pre_sum[l-1]
        print(res)
if __name__ == '__main__':
    main()
