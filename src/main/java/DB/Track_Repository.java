package DB;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Track_Repository extends CrudRepository<Track, Integer>{
	@Query(value = "Select * from Tracks t", nativeQuery = true)
	Iterable<Track> GetAllTracks();
}
