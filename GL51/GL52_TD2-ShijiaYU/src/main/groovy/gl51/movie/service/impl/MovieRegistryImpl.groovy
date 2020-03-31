package gl51.movie.service.impl

import gl51.movie.data.Movie
import gl51.movie.service.MovieRegistry
import javax.inject.Singleton

// shift+ctrl+T = create a new test -> choose spock
@Singleton
class MovieRegistryImpl implements MovieRegistry {

    private List<Movie> internalRegistry = []
    @Override
    void addMovieToFavorites(String imdbID) {
        internalRegistry << new Movie(imdbID : imdbID)
        // << = .add()
    }

    @Override
    List<Movie> listFavorites() {
        internalRegistry
        //return is useless ; the system will return the last intruction
    }
}
