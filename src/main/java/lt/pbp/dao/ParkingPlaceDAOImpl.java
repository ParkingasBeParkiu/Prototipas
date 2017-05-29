package lt.pbp.dao;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.springframework.stereotype.Repository;

import lt.pbp.domain.Location;
import lt.pbp.domain.ParkingPlace;

@Repository
public class ParkingPlaceDAOImpl implements ParkingPlaceDAO{

	@Override
	public List<ParkingPlace> findByLocation(Location l) {
		ParkingPlace p = new ParkingPlace();
		p.setAvgLeaveInterval(2.1);
		Map<Integer, Double> map = new TreeMap<>((a,b) -> 0);
		map.put(0, 9.6);
		p.setAvgFreeSpaceByDate(map);
		
		map = new TreeMap<>((a,b) -> 0);
		map.put(0, 6.1);
		p.setAvgFreeSpaceByCarCount(map);
		p.setId("1");
		p.setParkingRate(51);
		p.setFreeSpace(4);
		
		return Arrays.asList(p);
	}

}
