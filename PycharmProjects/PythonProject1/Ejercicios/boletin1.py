import random
#Escribir un programa donde se muestren los 10 primeros números enteros
def ejercicio1():


    for i in range(1,11):
        num = i
        if i == 10:
            print(num)
        else:
                print(num, end = ', ')

#Escribir un programa donde se muestren los 50 primeros números pares
def ejercicio2():

    for i in range (0,51,2):
        num = i
        if i == 0:
            print (i, end = "")
        else:
            print(", ", num, end='')

#Escribir un programa donde se muestren los 5 primeros números múltiplos de uno dado por el usuario
#def ejercicio3():


#Escribir un programa que pida un número al usuario que simule ser el precio de un artículo y escriba el resultado de aplicarle el IVA del 21%
def ejercicio7():
    num = int(input('Introduce el precio del artículo para aplicar el IVA de 21%: '))
    print(num+num*0.21, 'precio final')

#Escribir un programa que genere seis números aleatorios entre el 1 y el 49 (simulando
#una primitiva). Por el momento no te preocupes de que algunos números puedan salir
#repetidos. Ya resolveremos eso más adelante.
def ejercicio12():
    for i in range (7):
        num = random.randint(1,49)
        if i == 0:
            print(num, end='')
        else:
            print(', ',num, end='')


#Escribir un programa que genere un número aleatorio entre el 10.000.000 y el 50.000.000 que sea primo
def ejercicio16():
    primo = True
    while primo:
        num=random.randint(int(1e7),int(5e7))
        for i in range(2,int(num/2)):
            if num % i != 0:
                primo = False
    print(num)




if __name__ == '__main__':
    #ejercicio1()
    #ejercicio2()
    #ejercicio7()
    #ejercicio12()
    ejercicio16()