@main
def main(): Unit =
  println("------------------------------------------------------------")
  println("Hello world! This is a Scala program to illustrate Datatypes")

  var a: Boolean = true
  var a1: Byte = 126
  var a2: Float = 2.45673f
  var a3: Int = 3
  var a4: Short = 45
  var a5: Double = 2.93846523
  var a6: Char = 'A'
  if (a)
    {
      println("boolean:darvintojo")
    }
    println("byte:" + a1)
    println("float:" + a2)
    println("integer:" + a3)
    println("short:" + a4)
    println("double:" + a5)
    println("char:" + a6)

    println("------------------------------------------------------------")
    val dataTypeEx = new DataTypesDemo()
    dataTypeEx.exampleDataTypes()
    dataTypeEx.implicitTypeCasting()
    dataTypeEx.explicitTypeCasting()

    println("-----------------------------------------------------------------")
    println("Type Inference example")
    val typeInf = new TypeInferenceDemo()
    typeInf.typeInferenceExample1()
    typeInf.typeInferenceExample2()

