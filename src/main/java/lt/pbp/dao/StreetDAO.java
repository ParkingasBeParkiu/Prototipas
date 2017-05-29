package lt.pbp.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import lt.pbp.domain.Location;
import lt.pbp.domain.Street;

@Repository
public interface StreetDAO {
	
	List<Street> findByLocation(Location l);
	
}
