package lt.pbp.domain;

import java.util.Date;
import java.util.Map;

public class ParkingPlace {
	
	private String id;
	
	private int parkingRate;
	
	private Map<Integer, Double> avgFreeSpaceByTime;
	
	private Map<Integer, Double> avgFreeSpaceByCarCount;
	
	private Double avgLeaveInterval;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getParkingRate() {
		return parkingRate;
	}

	public void setParkingRate(int parkingRate) {
		this.parkingRate = parkingRate;
	}

	public Map<Integer, Double> getAvgFreeSpaceByDate() {
		return avgFreeSpaceByTime;
	}

	public Double getAVgFreeSpaceByDate(Date date) {
		return avgFreeSpaceByTime.get(date.getHours() * 60 + date.getMinutes());
	}
	
	public void setAvgFreeSpaceByDate(Map<Integer, Double> avgFreeSpaceByTime) {
		this.avgFreeSpaceByTime = avgFreeSpaceByTime;
	}
	

	public Map<Integer, Double> getAvgFreeSpaceByCarCount() {
		return avgFreeSpaceByCarCount;
	}

	public void setAvgFreeSpaceByCarCount(Map<Integer, Double> avgFreeSpaceByCarCount) {
		this.avgFreeSpaceByCarCount = avgFreeSpaceByCarCount;
	}

	public Double getAvgLeaveInterval() {
		return avgLeaveInterval;
	}

	public void setAvgLeaveInterval(Double avgLeaveInterval) {
		this.avgLeaveInterval = avgLeaveInterval;
	}

	private int freeSpace;

	public int getFreeSpace() {
		return freeSpace;
	}

	public void setFreeSpace(int freeSpace) {
		this.freeSpace = freeSpace;
	}	
}
