## Scala Wk2

#### Objects

* Objects are known as modules
* Scala code must be in an `object` or `class`
* `Unit` types are similar to `void` in other languages
* A pair of braces containing statements is called a block. Statements are separated by newlines or by semicolons. In this case, we’re using a newline to separate our statements, so a semicolon isn’t necessary.
* must declare a `main` method with a `Unit` type that accepts an `Array[String]` as the argument

##### Object Members

- Object name's are the _namespace_
- Every value in Scala is an Object (like Ruby)
- An object's primary purpose is to provide its members a namespace
- A member can be declare via `def`, `val`, or `object` (other kinds, too)

#### Pure Functions

* Returns a result with no side effects
* `def functionName(n: ArgType): ReturnType =` method definition structure
* Define functionName with an argument of N with ArgType
* Define ReturnType =
* Follow with indented code (indents are important, like Python)

#### Procedures (Impure Functions)

* Have side effects
* Methods/functions that chain pure functions together

#### Run Scala w/o Compilation

* `scala ModuleName.scala` 
* awwww yeaaah