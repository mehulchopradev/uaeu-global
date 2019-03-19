package xyz.supercoders.college.domain

// super class/ base class / parent class
class CollegeUser {
  String name
  Character gender

  /* CollegeUser() {
    // default constructor
  } */

  CollegeUser(String name, Character gender) {
    this.name = name
    this.gender = gender
  }

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
    return "Name : ${this.name}\nGender : ${this.gender}"
  }

  // for each of the attributes, groovy bean automatically defined getters and setters
  /* String getName() {
    this.name
  }

  void setName(String name) {
    this.name = name
  }

  Character getGender() {
    this.gender
   }

   void setGender(String gender) {
     this.gender = gender
    }
  */
}
