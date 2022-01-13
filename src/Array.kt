fun main() {
    val names: Array<String> = arrayOf("Fauzi", "Galih", "Aji", "Saputro")
    val fauzi: String = names[0]
    val fauzi1: String = names.get(0)
    println(names[0])

    names.set(0, "Fauzi Galih")
    println(names[0])


}