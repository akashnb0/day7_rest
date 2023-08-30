package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Car;

public interface CarRepo extends JpaRepository<Car, Integer> {

	@Query(value = "select * from stu_details where owners=:sn",nativeQuery = true)
	public List<Car> getCar01(@Param("sn") String owners);
	
	@Query(value = "select * from stu_details where address=:sn",nativeQuery = true)
	public List<Car>getCar11(@Param("sn") String address);
	
	@Query(value = "select * from stu_details where carName=:sn",nativeQuery = true)
	public List<Car>getCar21(@Param("sn") String carName);
	
	@Query(value = "select * from stu_details where owners=:s or cartype=:sn",nativeQuery = true)
	public List<Car>getCar31(@Param("s") String owners,@Param("sn") String cartype);
}