import sys
coins = [100,50,20,10,5,1]
count = {coin:0 for coin in coins}
n  = int(sys.stdin.readline().strip())
remaining = n
for coin in coins:
    if remaining >= coin:
        num = remaining // coin
        count[coin]=num
        remaining = remaining % coin
    if remaining == 0:
        break
print(f"找零{n}元需要的纸币：")
for coin in coins:
    if count[coin] >0:
        print(f"{coin}元纸币：{count[coin]}张")
