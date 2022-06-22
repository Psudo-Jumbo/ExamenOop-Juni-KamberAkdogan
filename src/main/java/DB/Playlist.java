package DB;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="Playlists")
public class Playlist {
	
	@Id
	@Column(name="PlaylistId")
	private Integer PlaylistId;
	
	@Column(name="Name")
	private String Name;

	public Integer getPlaylistId() {
		return PlaylistId;
	}

	public void setPlaylistId(Integer playlistId) {
		PlaylistId = playlistId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
	
	
}
