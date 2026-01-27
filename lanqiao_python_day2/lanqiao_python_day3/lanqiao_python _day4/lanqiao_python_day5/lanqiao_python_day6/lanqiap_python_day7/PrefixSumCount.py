import sys
from collections import defaultdict


def main():
    n,k = map(int, sys.stdin.readline().strip().split())
    arr = list(map(int, sys.stdin.readline().strip().split()))
    pre_sum = 0
    count_map = defaultdict(int)
    count_map[0]=1
    res = 0
    for num in arr:
        pre_sum +=num
        if (pre_sum-k) in count_map:
            res+=count_map[(pre_sum-k)]
        count_map[(pre_sum)] +=1
    print(res)
if __name__ == '__main__':
    main()




























