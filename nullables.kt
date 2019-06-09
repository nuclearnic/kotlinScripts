fun parseInt(str: String): Int? {
  return try {
    str.toInt()
  } catch(e: NumberFormatException) {
    println("Error: $e")
    return null
  }
}

fun main() {
  var x = parseInt("12345")
  // var x = parseInt("abcdef")

  if (x == null) {
    println("$x is not a number")
  } else {
    println("$x is a number")
  }
}
