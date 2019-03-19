import xyz.supercoders.college.domain.Student

def students = [
  new Student('mehul','m' as Character, 10, 90),
  new Student('jane','f' as Character, 11, 67),
  new Student('jill', 'f' as Character, 5, 89)
]


def moreThanEqual90 = students.findAll {
  it.marks >= 90
}

moreThanEqual90.each {
  println it.name
}

def smap = [
  10: students[0],
  11: students[1],
  5: students[2]
]

/* def an = smap.any {roll, student ->
  student.marks > 90
} */

def an = smap.any {
  it.value.marks > 90
}

println an

// search operation
def roll = 11

if (roll in smap) {
  def foundStudent = smap[roll]
  println "Name : ${foundStudent.name}\nGender : ${foundStudent.gender}"
} else {
  println 'Student not found'
}

/* def foundStudent = students.find {
  it.roll == roll
}

if (foundStudent) {
  println "Name : ${foundStudent.name}\nGender : ${foundStudent.gender}"
} else {
  println 'Student not found'
} */
