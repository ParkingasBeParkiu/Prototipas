package lt.pbp.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.RestController;

import lt.pbp.domain.Location;

@RestController
public class TimeAndPlaceController {
	
	public Date getDate() {
		return new Date();
	}
	
	public Location getLocation() {
		Location l = new Location();
		l.setLatitude(54);
		l.setLongitude(28);
		return l;
	}
	
}
