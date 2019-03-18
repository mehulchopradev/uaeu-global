def nos = [4, 5, 2, 3, 1, 10, 7, 9, 2]

// generalized higher order function
def forEach(nos, closure) {
  for(item in nos) {
    closure(item)
  }
}

// print all the elements of the list
// closure (define a piece of code or functionality, that can be passed around as objects)
println 'All elements'

nos.each {
  println it
}

/* def printItem = {
  // implicit parameter name will be 'it'
  println it
} */

/* forEach(nos) {
  println it
} */
/* def printAllElements(nos) {
  for(item in nos) {
    println item
  }
} */

println 'Even elements'
// print all the even elements from the list

nos.each {
  if (!(it % 2)) {
    println it
  }
}

/* def printEvens = {item ->
  if (!(item % 2)) {
    println item
  }
} */

/* def printEvens = {
  if (!(it % 2)) {
    println it
  }
} */

/* forEach(nos) {
    if (!(it % 2)) {
      println it
    }
} */
/* def printEvens(nos) {
  for(item in nos) {
    if (!(item % 2)) {
      println item
    }
  }
} */

// println 'All elements'
// printAllElements nos

// println 'Even elements'
//printEvens nos
