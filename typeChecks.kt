fun getStringLength(obj: Any): Int? {
  if (obj is String) {
    return obj.length
  }
  return null
}

fun main() {
  var list = mutableListOf<Any>(
    "some string",
    "12345",
    12345
    )

  list.forEach {
    val x = getStringLength(it)
    if (x == null) {
      println("$it is not a string")
    } else {
      println("The length of \"$it\" is: $x")
    }
  }
}