class Task2(
    val name: String,
    val lastname: String,
    var age: Int,
    var salary : Int,){

    fun wealthyCheck(): Boolean {
        return salary>1000
    }
    fun introduce(){
        println("$name $lastname is $age")
    }


}

fun main() {

    var employee1 =Task2("Agha","Reza",18,1009)
    println(employee1.wealthyCheck())
    employee1.introduce()

}