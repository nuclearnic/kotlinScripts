fun describe(obj: Any): String =
  when (obj) {
    is Int      -> "$obj is an Int"
    is Long     -> "$obj is a Long"
    is Double   -> "$obj is a Double"
    is String   -> "$obj is a String"
    else        -> "$obj is of unknown type"
  }

fun main() {
  println(describe("some string"))
  println(describe(123456))
  println(describe(123.45))
  println(describe(12345678900000))
}