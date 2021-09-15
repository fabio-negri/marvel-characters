package ar.edu.unlam.marvelcharacters

interface CharactersApi {

    suspend fun getCharacters(timestamp: Long, md5: String): List<Character>

}
