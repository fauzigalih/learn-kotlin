// Constanta
const val TITLE: String = "Variable"
const val VERSION: Float = 1.0F

fun main() {
    // Variable constant (not editable)
    val valVariable: Int = 10
    println(valVariable)

    // Variable can editable
    var varVariable: Int = 20
    varVariable += valVariable
    println(varVariable)

    // Nullable
    var variableNull: String? = null
    variableNull = "Fauzi"
    println(variableNull?.length)

    // Constanta Print
    println("This in file $TITLE with version $VERSION")
}