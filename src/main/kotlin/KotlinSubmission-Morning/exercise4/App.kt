package id.infinitelearning.KotlinSubmission.exercise4

fun main() {
    times(3,0)
}

    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini
fun times(a: Int, b: Int) {
    try {
        val hasil = (a % b)
        println("Hasil perkalian: $hasil")
    } catch (e: ArithmeticException) {
        println("Percuma ${e.message}")
    }


}


