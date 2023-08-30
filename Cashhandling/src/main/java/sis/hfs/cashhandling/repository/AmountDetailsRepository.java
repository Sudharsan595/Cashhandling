package sis.hfs.cashhandling.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import sis.hfs.cashhandling.model.AmountDetails;

public interface AmountDetailsRepository extends JpaRepository<AmountDetails, Long>{

	List<AmountDetails>getByeffectivedate(String date);

}
