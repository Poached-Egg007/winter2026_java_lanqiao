import sys
input_str = sys.stdin.readline().strip()
arr = list(map(int, input_str.split()))
new_arr = []
for num in arr:
    if num not in new_arr:
        new_arr.append(num)
print(new_arr)