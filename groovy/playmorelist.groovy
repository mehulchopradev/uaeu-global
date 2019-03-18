def nos = [4, 5, 2, 3, 1, 10, 7, 9, 2]

// get a new list from nos, which has only even elements
// filtering

def evens = nos.findAll {
  !(it % 2)
}
println evens

def oddMoreThan5 = nos.findAll {
  (it % 2) && (it > 5)
}

println oddMoreThan5


// get a new list which is squares of elements from nos
// mapping

def squares = nos.collect {
  it ** 2
}

println squares


def r = nos.collect {
  (it % 2) ? it ** 2 : it ** 3
}

println r