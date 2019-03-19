package xyz.supercoders.college.domain

class Professor extends CollegeUser {
  List subjects

  Professor(String name, Character gender, List subjects = []) {
    super(name, gender)

    this.subjects = subjects
  }
}
