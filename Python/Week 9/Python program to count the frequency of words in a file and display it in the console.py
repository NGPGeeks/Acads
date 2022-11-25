file=open("input.txt","r+")
wordcount={}

for word in file.read().split():
    if word not in wordcount:
        wordcount[word] = 1
    else:
        wordcount[word] += 1

for k,v in sorted(wordcount.items()):
    print (k, v)
