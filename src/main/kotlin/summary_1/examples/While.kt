package summary_1.examples

fun testCondition(i: Int) = i < 100

fun main() {
    var i = 0
    while (testCondition(i)) {
        print(".")
        i += 10
    }
}

/* Output:
..........
*/
