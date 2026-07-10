class HangmanGame(
    private val secretWord: String
) {

    // Stores guessed letters
    private val guessedLetters = mutableListOf<Char>()

    // Tracks incorrect guesses
    private var wrongGuesses = 0

    // Returns the length of the selected word
    fun wordLength(): Int {

        return secretWord.length
    }

    // Checks guesses and updates the game state
    fun guessLetter(letter: Char): Boolean {

        if (guessedLetters.contains(letter)) {
            return false
        }

        guessedLetters.add(letter)

        if (secretWord.contains(letter)) {
            return true
        } else {
            wrongGuesses++
            return false
        }
    }


    // Checks if a letter was already guessed
    fun alreadyGuessed(letter: Char): Boolean {

        return guessedLetters.contains(letter)
    }


    // Returns the number of incorrect guesses
    fun getWrongGuesses(): Int {

        return wrongGuesses
    }


    // Returns all letters guessed
    fun getGuessedLetters(): List<Char> {

        return guessedLetters
    }


    // Creates the hidden word display using guessed letters
    fun displayWord(): String {

        var display = ""

        for (letter in secretWord) {

            if (guessedLetters.contains(letter)) {

                display += letter

            } else {

                display += "_"
            }
        }

        return display
    }


    // Checks whether every letter in the word has been guessed
    fun hasWon(): Boolean {

        for (letter in secretWord) {

            if (!guessedLetters.contains(letter)) {

                return false
            }
        }

        return true
    }
}