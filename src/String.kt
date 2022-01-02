fun main() {
    // Char
    var h: Char = 'H'
    var e: Char = 'e'
    var l: Char = 'l'
    var o: Char = 'o'
    println(h.toString() + e + l + l + o)

    // String (One Line)
    var text: String = "Hello World"

    // String (Many Line)
    var paragraf: String = """
        This is a Paragraf Text
        Hello Fauzi..
        How are you today?
    """.trimIndent()

    var paragrafMargin: String = """
        |This is a Paragraf Text
        |Hello Fauzi..
        |How are you today?
    """.trimMargin()

    var paragrafMargin1: String = """
        =>This is a Paragraf Text
        =>Hello Fauzi..
        =>How are you today?
    """.trimMargin("=>")
    println(paragrafMargin1)

    // String Conversion
    var number1: String = "100"
    var number2: String = "50"
    println(number1.toInt() + number2.toInt())

    // String Template
    var firstName: String = "Fauzi"
    var lastName: String = "Galih"
    var fullName: String = "My name is $firstName $lastName"
    var nameLength: String = "Length my name is ${firstName.length + lastName.length}"
    println(fullName)
    println(nameLength)
}