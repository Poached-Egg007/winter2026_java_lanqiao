# 蓝桥杯贪心算法：活动选择（最多互不冲突活动）
# 核心策略：优先选择结束时间最早的活动
import sys

# 读取活动数量
n = int(sys.stdin.readline().strip())
activities = []

# 读取每个活动的编号、开始时间、结束时间
for i in range(n):
    s, f = map(int, sys.stdin.readline().strip().split())
    activities.append((f, s, i+1)) # 存为(结束时间, 开始时间, 活动编号)，方便排序

# 按结束时间从小到大排序（关键！）
activities.sort()

# 贪心选择活动
selected = []
# 第一个活动必选
last_end = activities[0][0]
selected.append(activities[0][2])

# 遍历剩余活动
for i in range(1, n):
    f_i, s_i, idx = activities[i]
    if s_i >= last_end:
        selected.append(idx)
        last_end = f_i # 更新上一个活动的结束时间

# 输出结果
print(f"最多能选择的活动数量：{len(selected)}")
print(f"选中的活动编号：{selected}")