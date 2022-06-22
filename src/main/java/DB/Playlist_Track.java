package DB;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@Entity()
public class Playlist_Track {

	@ManyToMany
	@JoinColumn(name="PlaylistId", referencedColumnName = "PlaylistId")
	private Integer PlaylistId;
	
	@ManyToMany
	@JoinColumn(name="TrackId", referencedColumnName = "TrackId")
	private Integer TrackId;

	public Integer getPlaylistId() {
		return PlaylistId;
	}

	public void setPlaylistId(Integer playlistId) {
		PlaylistId = playlistId;
	}

	public Integer getTrackId() {
		return TrackId;
	}

	public void setTrackId(Integer trackId) {
		TrackId = trackId;
	}
	
}
