package pappin.jobtests.bongo

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test

/**
 * Bongo’s Android Developer
 *
 * Question:
 *
 * 1) Write a function that detects if two strings are anagram e.g. ‘bleat’ and ‘table’ are anagrams but ‘eat’ and ‘tar’ are not.
 *
 */
class AnagramDetectorTest {

    lateinit var cut: AnagramDetector

    @Before
    fun setUp() {
        cut = AnagramDetector()
    }

    /**
     * Note: The definition of anagram seems to indicate that "noun" and "noun" (switch the "n") is *not* an anagram,
     * however, when I cross checked my work with external tools, most of them accepted it as a noun of itself.
     * At this point I am goign ont he literal definition of an anagram., and assuming a work can't be an anagram of itself.
     */
    @Test
    fun sameInputsAreNotAnAnagram() {
        cut.apply {
            first = "noun"
            second = "noun"
        }
        assertFalse("Anagram was not expected.", cut.isAnagram())
    }

    @Test
    fun twoNullInputsAreNotAnAnagram() {
        cut.apply {
            first = null
            second = null
        }
        assertFalse("Anagram was not expected.", cut.isAnagram())
    }

    @Test
    fun firstNullInputIsNotAnAnagram() {
        cut.apply {
            first = null
            second = "noun"
        }
        assertFalse("Anagram was not expected.", cut.isAnagram())
    }

    @Test
    fun secondNullInputIsNotAnAnagram() {
        cut.apply {
            first = "noun"
            second = null
        }
        assertFalse("Anagram was not expected.", cut.isAnagram())
    }

    @Test
    fun inputsWithMismatchedCharsAreNotAnagrams() {
        cut.apply {
            first = "bin"
            second = "nab"
        }
        assertFalse("Anagram was not expected.", cut.isAnagram())
    }

    @Test
    fun inputsAreAnagrams() {
        cut.apply {
            first = "bin"
            second = "nib"
        }
        assertTrue("Anagram was expected.", cut.isAnagram())
    }

    @Test
    fun inputsAreAnagramsDespiteCase() {
        cut.apply {
            first = "Bin"
            second = "Nib"
        }
        assertTrue("Anagram was expected.", cut.isAnagram())
    }

    @Test
    fun inputsThatAreNotWordsAreNotAnagrams() {
        cut.apply {
            strict = true
            first = "xtf"
            second = "fxt"
        }
        assertFalse("Anagram was not expected.", cut.isAnagram())
    }
}
