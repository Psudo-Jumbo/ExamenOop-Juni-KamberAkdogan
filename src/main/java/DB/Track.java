package DB;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="Tracks")
public class Track {

	@Id
	@Column(name="TrackId")
	private Integer TrackId;
	
	@Column(name="Name")
	private String Name;

	public Integer getTrackId() {
		return TrackId;
	}

	public void setTrackId(Integer trackId) {
		TrackId = trackId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
	
	
}
