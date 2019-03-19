println 'Program starts'
def n = '9'

try {
  def i = n as Integer
  println ((i % 2) ? 'It is odd' : 'It is even')
} catch (NumberFormatException e) {
  println 'Please enter integer'
}

println 'Program ends'
