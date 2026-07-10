fun main() {

    // Start Game and select word.
    val secretWord = WordList.getRandomWord()
    val game = HangmanGame(secretWord)

    // Max incorrect guesses
    val maxWrongGuesses = 6

    println("Welcome to Hangman!")
    println("The word has ${game.wordLength()} letters.")

    // Primary Game Loop
    while (game.getWrongGuesses() < maxWrongGuesses && !game.hasWon()) {

        print("Guess a letter: ")

        val input = readlnOrNull()

        // Validate input
        if (input != null && input.length == 1) {

            val guess = input[0]

            // Catch repeated characters
            if (game.alreadyGuessed(guess)) {

                println("You already guessed that letter.")

            } else if (game.guessLetter(guess)) {

                println("Correct!")

            } else {

                println("Wrong!")
            }

            // Progress output
            println("Guessed letters: ${game.getGuessedLetters()}")
            println("Word: ${game.displayWord()}")
            println("Wrong guesses: ${game.getWrongGuesses()}")

        } else {

            println("Enter one letter.")
        }
    }

    // Display game result
    if (game.hasWon()) {

        println("Congratulations! You won!")

    } else {

        println("Game over! You ran out of guesses.")
    }
}