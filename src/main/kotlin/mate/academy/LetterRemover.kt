package mate.academy

@Suppress("UtilityClassWithPublicConstructor")
class LetterRemover {
    companion object {
        @JvmStatic
        fun removeLetter(input: String): CharArray {
            val lowercase = input.lowercase()
            val replace = lowercase.replace('r', '!')
            return replace.toCharArray()
        }
    }
}

fun main() {
    val input = "Remove Letters"
    val result = LetterRemover.removeLetter(input)
    println(result.contentToString())
}
