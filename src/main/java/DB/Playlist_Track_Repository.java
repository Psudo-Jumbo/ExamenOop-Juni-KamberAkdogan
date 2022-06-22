package DB;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Playlist_Track_Repository extends CrudRepository<Playlist_Track, Integer>{
	@Query(value = "Select * from playlist_track pt", nativeQuery = true)
	Iterable<Playlist_Track> GetAllPlaylist_Track();
}
