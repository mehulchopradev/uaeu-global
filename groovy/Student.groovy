class Student {
  // highly recommend not to use def variable definitions for attributes defined in the class
  String name
  Character gender
  Integer roll
  Double marks

  static Integer count = 0
  // lives in the class area of the memory
  // For every class, there is a single object of type Class created

  /* Student() {
      // default constructor
  } */

  Student(String name, Character gender, Integer roll, Double marks) {
    // this is implicit and stores the address of the object for which the constructor
    // is called
    this.name = name
    this.gender = gender
    this.roll = roll
    this.marks = marks

    Student.count += 1
    // access class attribute using the class name
  }

  // for each of the attributes, groovy bean automatically defined getters and setters
  /* String getName() {
    this.name
  }

  void setName(String name) {
    this.name = name
  } */

  /* static Integer getStudentCount() {
      // automatically get this method
  } */

  // encapsulation
  // on demand encapsulation in groovy
  void setGender(Character gender) {
    if (gender != 'm' && gender != 'f' ) {
      this.gender = null
    } else {
      this.gender = gender
    }
  }

  String getDetails() {
    "Name: ${this.name}\nGender: ${this.gender}\nRoll: ${this.roll}\nMarks: ${this.marks}"
  }
}
