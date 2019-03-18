def n = 8

def a = 0
def b = 1

println a
println b

for (i in 1..n-2) {
  def c = a + b
  println c

  a = b
  b = c
}
