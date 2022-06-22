package DB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class Controller {
	
	@Autowired
	private Track_Repository TrackRep;
	
	@Autowired
	private PLaylist_Repository PlaylistRep;

}
