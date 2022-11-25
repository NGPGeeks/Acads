file = open("numbers.txt", "r")
numbers = []

for line in file:
  numbers.append(int(line))

print(sum(numbers))
file.close()
