## Data Types in Scala

In Scala, the data types are similar to Java in terms of length and storage. In Scala, data types are treated same
objects so the first letter of the data type is in capital letter.

### 1- Value (Primitive) Data Types

**Data Type -> Description -> Example**

- **Byte** -> 8-bit signed integer -> val b: Byte = 100
- **Short** -> 16-bit signed integer -> val s: Short = 10000
- **Int** -> 32-bit signed integer -> val i: Int = 100000
- **Long** -> 64-bit signed integer -> val l: Long = 100000L
- **Float** -> 32-bit floating-point number -> val f: Float = 10.5f
- **Double** -> 64-bit floating-point number -> val d: Double = 10.5
- **Char** -> 16-bit Unicode character -> val c: Char = 'A'
- **Boolean** -> Represents a true or false value -> val bool: Boolean = true
- **Unit** -> Represents no value (similar to void in other languages)    -> val u: Unit = ()

### 2- Reference (Objects) Data Types

The following is the list of reference (object) types in Scala:

- **String**: It is used to define an object of string type.
- **Array**: It is used to define an object of an Array (similar type of data types).
- **List**: It is used to define an object of the Linked List type.
- **Option**: It is used to define an option that may or may not exist. It can be null or none.
- **Tuple**: It is used to define an object of Tuple type. It is a fixed-size collection of different value types.

### 3- Special Data Types

**Data Type -> Description -> Example**

- **Any** -> All type of scala inherits from Any. -> AnyVal, AnyRef
- **Null**  -> It represents a Null type. -> println(Null)
- **Nothing** -> It represents a nothing type. -> println(Noting)
- **Nil** -> It represents an empty object i.e., a Nil. -> println(Nil)

### Technologies

- Java 17
- Sbt 1.10.17
- Scala 3.3.4
