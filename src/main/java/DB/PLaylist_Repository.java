package DB;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PLaylist_Repository extends CrudRepository<Playlist, Integer>{
	@Query(value = "Select * from Playlists p", nativeQuery = true)
	Iterable<Playlist> getAllPlaylists();
}
