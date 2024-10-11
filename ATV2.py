import random
with open('C:/Users/jukal/Documents/saida.txt', 'w') as file:

    for i in range(1000):
        file.write("\n") 
        for j in range(3000):
            k = random.randint(0, 255)
            file.write(f"{k} ") 
