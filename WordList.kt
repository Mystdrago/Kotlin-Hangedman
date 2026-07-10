object WordList {

    //List of Words
    private val words = listOf(
        "kotlin",
        "dumb",
        "stupid",
        "annoying",
        "brick",
        "hate",
        "language",
        "loathing",
        "computer",
        "programming",
        "keyboard",
        "function",
        "variable",
        "developer",
        "software"
    )

    // Selects and returns a random word from the list
    fun getRandomWord(): String {
        return words.random()
    }
}