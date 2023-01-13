A = [0, 1, 2, 3, 4, 5] #list
B = (0, 1, 2, 3, 4, 5) #tuple
C = {0, 1, 2, 3, 4, 5} #set
D = '012345' #string
E = { #dictionary
    "name": 'max',
    "age": 20
}

for key, value in E.items():
    print(key, ' ', value)

for x in range(2, 30, 2):
    print(x)
else:
    print("Finished")
    

