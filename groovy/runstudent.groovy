import xyz.supercoders.college.domain.Student
import xyz.supercoders.college.domain.CollegeUser

println Student.getCount()

// a super class reference variable type can store address of its subclass object
CollegeUser s1 = new Student('mehul', 'm' as Character, 10, 90)
println s1.name // -> s1.getName() (internally done by groovy)
println s1.gender
println s1.roll

println s1.giveAttendance() // contrary to java, this works in groovy

s1.name = 'Mehul' // s1.setName('Mehul') (internally done by groovy)
// println s1.getDetails()

s1.gender = 'o' // s1.setGender('o')

println s1.getDetails()

s1.gender = 'm'

println s1.getDetails()


/* s1.name = "mehul"
s1.gender = 'm'
s1.roll = 10
s1.marks = 90 */


def s2 = new Student('jane', 'f' as Character, 13, 78)
println s2.getDetails()

/* s2.name = 'jane'
s2.gender = 'f'
s2.roll = 13
s2.marks = 78 */

/*println s1.name
println s2.name
println s1.roll
println s2.roll */
println Student.getCount()
