fun vulnerableFunction() {
  val password = "password" // Vulnerability - hardcoded password
  if (!password.isNull()) println("null password!")
}

// Code Smell - Empty function
fun emptyFunction() {
}

fun buggyFunction(str: String){
  if (str == "hello"){
    println("Hello!")
  } else if (str == "goodbye"){
    println("Goodbye!")
  } else if (str == "hello again"){ // Bug - Duplicate condition
    println("Hello again!")
  }
}
