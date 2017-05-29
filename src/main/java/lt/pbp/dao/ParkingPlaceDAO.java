package lt.pbp.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import lt.pbp.domain.Location;
import lt.pbp.domain.ParkingPlace;

@Repository
public interface ParkingPlaceDAO {
	
	List<ParkingPlace> findByLocation(Location l);
	
}
