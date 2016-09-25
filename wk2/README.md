## Wk2: Functional Programming & Scala 101

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

#### Higher-Order Functions

* Pass functions to function
* functions are values
* Like values and other types, functions can be assigned to variables, stored, etc
* This is similar to Javascript
* Functions that accept other functions are arguments are higher-order functions (HOF)

###### Naming Conventions

It’s a common convention to use names like f, g, and h for parameters to a higher-order function. In functional programming, we tend to use very short variable names, even one-letter names. This is usually because HOFs are so general that they have no opinion on what the argument should actually do. All they know about the argument is its type. Many functional programmers feel that short names make code eas- ier to read, since it makes the structure of the code easier to see at a glance.

#### Polymorphism / Abstraction

* We've only used monomorphic data; functions that operate one one type of data
* This means absolute and factorial require Int args
* Our HOF format function also requires `f: Int => Int`
* We want our HOF's to accept _any_ type given
* This would create a polymorphic function

#### Recursive Functions and Tails

* To make sure we don't swamp our heap with recursive requests, we use tail recursion
* Annotate recursive loops with `@annotation.tailrec`

####