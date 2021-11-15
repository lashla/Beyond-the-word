fun main() {
    val input = readLine()!!.toString()
    Loop@for (element in 'a'..'z'){
        for (inputElement in input.indices){
            if (input[inputElement] == element) continue@Loop
        }
        print(element)
    }
}
