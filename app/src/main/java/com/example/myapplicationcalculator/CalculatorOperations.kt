package com.example.myapplicationcalculator

import com.example.myapplicationcalculator.CalculatorOperations.Add.symbol


sealed class CalculatorOperations(val symbol: String){
    object Add: CalculatorOperations("+")
    object Substract: CalculatorOperations("-")
    object Multiply: CalculatorOperations("*")
    object Divide: CalculatorOperations( "/")


}

