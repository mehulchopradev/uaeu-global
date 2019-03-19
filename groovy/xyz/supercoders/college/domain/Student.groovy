package xyz.supercoders.college.domain

class Student extends CollegeUser {
  // highly recommend not to use def variable definitions for attributes defined in the class
  Integer roll
  Double marks

  static Integer count = 0
  // lives in the class area of the memory
  // For every class, there is a single object of type Class created

  /* Student() {
      // default constructor
  } */

  Student(Map params) {
    super(params['name'], params['gender'])

    this.roll = params['roll']
    this.marks = params['marks']

    Student.count += 1
  }

  Student(String name, Character gender, Integer roll, Double marks) {
    // this is implicit and stores the address of the object for which the constructor
    // is called
    super(name, gender)

    this.roll = roll
    this.marks = marks

    Student.count += 1
    // access class attribute using the class name
  }

  /* static Integer getStudentCount() {
      // automatically get this method
  } */

  // method override
  String getDetails() {
    def part1 = super.getDetails()
    "${part1}\nRoll: ${this.roll}\nMarks: ${this.marks}"
  }

  def giveAttendance() {
    "Attendance given"
  }

}
