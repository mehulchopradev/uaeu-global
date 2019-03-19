class StudentList {
  def students

  def methodMissing(String methodName, args) {
    // println methodName
    // println args
    // methodName -> attribute
    def attribute = methodName[6..methodName.size()-1].toLowerCase()
    students.find {
      it[attribute] == args[0]
    }
  }
}
