package lt.pbp.dao;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import lt.pbp.domain.Location;
import lt.pbp.domain.Street;

@Repository
public class StreetDAOImpl implements StreetDAO{

	@Override
	public List<Street> findByLocation(Location l) {
		Street s = new Street();
		s.setCarCount(9);
		s.setName("Anatakalnio g.");
		return Arrays.asList(s);
	}

}
