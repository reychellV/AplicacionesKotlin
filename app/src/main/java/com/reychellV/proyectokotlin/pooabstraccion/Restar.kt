package com.reychellV.proyectokotlin.pooabstraccion

class Restar(num1: Int, num2: Int):Operacion(num1, num2) {
    override fun operar() {
        resultado = numero1 - numero2
    }
}