import xyz.supercoders.college.domain.Student

def students = [
  new Student(name:'mehul',gender:'m' as Character, roll: 10, marks:90),
  new Student(name: 'jane',gender: 'f' as Character, roll:11, marks:67),
  new Student(name:'jill', gender: 'f' as Character, roll:5, marks: 89)
]

def slist1 = new StudentList(students: students)


def uaestudents = [
  new UaeStudent(sname: 'rahul', gen: 'm', roll: 40),
  new UaeStudent(sname: 'rea', gen: 'f', roll: 34),
]

def slist2 = new StudentList(students: uaestudents)

println slist1.findByName('jane')
println slist2.findBySname('xyz')

println slist2.findByRoll(34)

def s = slist1.findByMarks(67)
println s.name

def r = slist2.findByGen('f')
println r.sname
