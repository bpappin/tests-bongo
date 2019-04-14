package pappin.jobtests.bongo

class AnagramDetector {

    var second: String? = null
    var first: String? = null

    fun isAnagram(): Boolean {

        if (first == null) {
            return false
        }

        if (second == null) {
            return false
        }


        if (first.equals(second, true)) {
            // a word is not an anagram of itself.
            return false
        }

        var firstChars = mutableListOf<Char>()
        var secondChars = mutableListOf<Char>()

        first?.let { it.toLowerCase().toCollection(firstChars) }
        second?.let { it.toLowerCase().toCollection(secondChars) }

        return firstChars sameContentWith secondChars

    }


    private infix fun <T> Collection<T>.sameContentWith(collection: Collection<T>) =
        collection.let { this.size == it.size && this.containsAll(it) }
}
