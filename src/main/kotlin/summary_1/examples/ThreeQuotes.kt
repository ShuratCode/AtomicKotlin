package summary_1.examples

fun json(q: String, a: Int) = """{
    "question: "$q",
     "answer": $a
}""".trimIndent()

fun main() {
    val jsonResult = json("The Ultimate", 42)
    println(jsonResult)
}

/* Output:
{
    "question: "The Ultimate",
    "answer": 42
}
*/
