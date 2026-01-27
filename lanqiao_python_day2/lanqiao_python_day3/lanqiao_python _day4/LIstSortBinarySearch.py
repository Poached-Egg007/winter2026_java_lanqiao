import sys
input_str = sys.stdin.readline().strip()
arr = list(map(int, input_str.split()))
arr.sort()
print("排序后的列表",arr)
target = int(sys.stdin.readline().strip())
left = 0
right = len(arr)-1
found = False
while left <= right:
    mid = (left + right)//2
    if arr[mid]== target:
        print(f"目标数{target},下标为{mid}")
    elif arr[mid]> target:
        right = mid-1
    else:
        left = mid+1
if not found:
    print(f"目标数{target}不在列表中")
