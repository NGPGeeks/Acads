file = open("numbers.txt", "r")
numbers = []

for line in file:
  numbers.append(int(line))

numbers.sort()
print(numbers)
file.close()
