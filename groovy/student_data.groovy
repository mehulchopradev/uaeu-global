def getDetails(name, gender, roll, marks) {
  // string interpolation
  // treats this as a GString class rather than java String
  "Name: ${name}\nGender: ${gender}\nRoll: ${roll}\nMarks: ${marks}"
}

def name = 'mehul'
def gender = 'm'
def roll = 10
def marks = 90

println getDetails(name, gender, roll, marks)
