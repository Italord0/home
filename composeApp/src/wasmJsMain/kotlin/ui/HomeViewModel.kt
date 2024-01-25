import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.request.*
import io.ktor.serialization.kotlinx.json.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import kotlinx.serialization.json.Json
import model.Repo

object AppViewModel {
    private val _repos = MutableStateFlow(emptyList<Repo>())
    val repos: StateFlow<List<Repo>> get() = _repos

    private val client = HttpClient {
        install(ContentNegotiation) {
            json(Json { ignoreUnknownKeys = true })
        }
    }

    init {
        fetchRepos()
    }

    fun fetchRepos() {
        CoroutineScope(Dispatchers.Main).launch {
            try {
                val newRepos = client.get("https://api.github.com/users/italord0/repos").body<List<Repo>>()
                _repos.value = newRepos
            } catch (e: Exception) {
                _repos.value = listOf(Repo(6969, e.toString()))
            }
        }
    }
}