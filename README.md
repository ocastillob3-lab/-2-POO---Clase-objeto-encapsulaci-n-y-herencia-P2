# Encapsulación y Herencia

## Descripción

Este proyecto implementa los conceptos fundamentales de **Programación Orientada a Objetos (POO)** en Java, específicamente:

- Encapsulación
- Herencia
- Abstracción
- Constructores
- Sobrescritura de métodos (`@Override`)

## Estructura del proyecto

El proyecto contiene las siguientes clases:

- `Persona`
- `Estudiante`
- `Catedratico`
- `Main`

## Clase Persona

La clase `Persona` es una clase abstracta que contiene los datos comunes entre un estudiante y un catedrático:

- `nombres`
- `apellidos`
- `cuentaBancaria`

El atributo `cuentaBancaria` utiliza el modificador `protected`.

## Clase Estudiante

La clase `Estudiante` hereda de `Persona` mediante:

```java
extends Persona
