package sis.hfs.cashhandling.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sis.hfs.cashhandling.model.AmountDetails;
import sis.hfs.cashhandling.repository.AmountDetailsRepository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class AmountDetailsService {
	@Autowired
    private   AmountDetailsRepository amountrepo;
 
	
	public List<AmountDetails> getDetailsByeffectDate(String date) {
		
      return amountrepo.getByeffectivedate(date);
    }
    public AmountDetails saveamountdetails(AmountDetails amountdetails) {
    	LocalDate currenDate = LocalDate.now();
    	amountdetails.setEffectivedate(currenDate.toString());
        return amountrepo.save(amountdetails);
    }

    public List<AmountDetails> getAllAmountDetails() {
        return amountrepo.findAll();
    }

    public Optional<AmountDetails> getamountdetailsById(long id) {
        return amountrepo.findById(id);
    }

    public AmountDetails updateamountdetails(AmountDetails amountdetails) {
        return amountrepo.save(amountdetails);
    }
    public void updateamountdetailsById(AmountDetails amountdetails) {
        amountrepo.save(amountdetails);
    }    
    public void deleteamountdetails(long id) {
        amountrepo.deleteById(id);
    }
}
