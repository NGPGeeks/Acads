file = open("input1.txt", "r")
count =0
for line in file:
    count =count+1

print(count)
file.close()
