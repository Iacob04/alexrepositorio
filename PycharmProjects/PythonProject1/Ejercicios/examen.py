import math
from dataclasses import replace
def ejercicio1():
    radiozona = int(input("Introduce el radio de la zona segura en metros: "))
    area = math.pi * radiozona * radiozona
    print("El area del radio de la zona segura es: " + str(area) + " metros")
    print("El radio de la zona segura final se ha reducido en un 60% respecto al comienzo")
    radiozonafinal = radiozona * 0.6
    areafinal = math.pi * radiozonafinal * radiozonafinal
    print("El area final de la zona segura es: " + str(areafinal) + " metros")




def ejercicio2():
 palabra = input("Ingresa una palabra: ")
 clave = int(input("Ingresa una clave numérica: "))

 palabrainvertida = palabra[::-1]

 vocales = "aeiouAEIOU"
 resultado = ""

 for letra in palabrainvertida:
    if letra in vocales:
        resultado += str(clave)      # reemplazar vocal por la clave
    else:
        resultado += letra           # dejar la consonante tal cual

 print(resultado)

 parte1 = resultado[:clave]
 print(parte1)
 parte2 = resultado[clave:]
 print(parte2)

 if clave % 2 == 0:
    resultado = (parte1 + " " + parte2).upper()
 else:
    resultado = (parte1 + " " + parte2).lower()

 print("Resultado:", resultado)

def ejercicio3():
    total = 0
    contador = 0

    dato = ""  # inicializamos para entrar en el while

    while dato != "END":
        dato = input("Introduce un número (o END): ")

        if dato == "END":
            continue  # no se procesa, solo termina el while natural

        if not dato.isdigit():
            print("Error: introduce valores entre 0 y 10")
            continue

        n = int(dato)

        if n < 0 or n > 10:
            print("Error: introduce valores entre 0 y 10")
            continue

        total += n
        contador += 1

    if contador == 0:
        print("No se introdujeron valores válidos.")
    else:
        print("Media:", total / contador)


def ejercicio4():




#ejercicio1()
#ejercicio2()
ejercicio3()