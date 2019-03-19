// metaprogramming
// inject a new method in an existing built in class

String.metaClass.pipefy = {sep = '|' ->
  def result = ''
  for (ch in delegate) { // delegate is like 'it'. Will be the string
    result += ch + sep
  }

  result
}



def fullname = 'mehulchopra'
println fullname.pipefy(',')
