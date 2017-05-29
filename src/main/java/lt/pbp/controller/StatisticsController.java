package lt.pbp.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lt.pbp.dao.ParkingPlaceDAO;
import lt.pbp.dao.StreetDAO;
import lt.pbp.domain.Location;
import lt.pbp.domain.ParkingPlace;
import lt.pbp.domain.Statistics;
import lt.pbp.domain.Street;

@RestController
@RequestMapping("rest/statistics")
public class StatisticsController {

	@Autowired
	TimeAndPlaceController timeAndPlaceController;
	
	@Autowired
	StreetDAO streetDAO;
	
	@Autowired
	ParkingPlaceDAO parkingPlaceDAO;
	
	@GetMapping
	public Statistics getStatistics() {
		return getStatistics(timeAndPlaceController.getDate(), timeAndPlaceController.getLocation());
	}
	
	public Statistics getStatistics(Date date, Location location) {
		Statistics s = new Statistics();
		
		List<Street> streets = streetDAO.findByLocation(location);
		List<ParkingPlace> places = parkingPlaceDAO.findByLocation(location);
		
		int carCount = streets.stream().mapToInt(st -> st.getCarCount()).sum();
		
		s.setAvgLeaveInterval(places.stream().mapToDouble(p -> p.getAvgLeaveInterval()).average().orElse(-1));
		
		s.setAvgFreeSpaceByCarsCount(places.stream().mapToDouble(p -> p.getAvgFreeSpaceByCarCount().get(carCount)).average().orElse(0));
		
		s.setAvgFreeSpaceByTime(places.stream().mapToDouble(p -> p.getAVgFreeSpaceByDate(date)).average().orElse(0));
		
		s.setAvgFreeSpaceByCarsCount(places.stream().mapToDouble(p -> p.getAvgFreeSpaceByCarCount().get(carCount)).average().orElse(0));
		
		return s;
	}
	
}
