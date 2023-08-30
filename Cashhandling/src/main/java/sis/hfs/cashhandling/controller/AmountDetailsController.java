package sis.hfs.cashhandling.controller;

 

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sis.hfs.cashhandling.model.AmountDetails;
import sis.hfs.cashhandling.service.AmountDetailsService;

@RestController
@CrossOrigin(origins ="*")
@RequestMapping("/cashhandling")
public class AmountDetailsController {
	@Autowired
    private  AmountDetailsService amountservice;
 
    @PostMapping("/save")
    public AmountDetails saveAmountDetails(@RequestBody AmountDetails cashhandling) {
        return amountservice.saveamountdetails(cashhandling);
    }

    @GetMapping("/getall")
    public List<AmountDetails> getAllAmountDetails() {
        return amountservice.getAllAmountDetails();
    }
 

    @GetMapping("/get/{id}")
    public Optional<AmountDetails> getAmountDetailsById(@PathVariable long id) {
        return amountservice.getamountdetailsById(id);
    }

    @PutMapping("/update")
    public AmountDetails updateAmountDetails(@RequestBody AmountDetails amountdetails) {
        return amountservice.updateamountdetails(amountdetails);
    }
    @GetMapping("/getall/{Date}")
    public List<AmountDetails> getDetailsByeffectDate(@PathVariable(name="Date") String date) {
		
        return amountservice.getDetailsByeffectDate(date);
      }
    @PutMapping("/update/{id}")
    public ResponseEntity<String> updateAmountDetailsById(@PathVariable long id, @RequestBody AmountDetails updatedAmountDetails) {
        Optional<AmountDetails> existingAmountDetails = amountservice.getamountdetailsById(id);

        if (existingAmountDetails.isPresent()) {
            AmountDetails amountdetailsToUpdate = existingAmountDetails.get();
            amountdetailsToUpdate.setFeestype(updatedAmountDetails.getFeestype());
            amountdetailsToUpdate.setResttype(updatedAmountDetails.getResttype());
            amountdetailsToUpdate.setRatetype(updatedAmountDetails.getRatetype());
            amountdetailsToUpdate.setFromreceiptamount(updatedAmountDetails.getFromreceiptamount());
            amountdetailsToUpdate.setToreceiptamount(updatedAmountDetails.getToreceiptamount());
            amountdetailsToUpdate.setFeespercentage(updatedAmountDetails.getFeespercentage());
            amountdetailsToUpdate.setFeesamount(updatedAmountDetails.getFeesamount());
            amountdetailsToUpdate.setStarttenor(updatedAmountDetails.getStarttenor());
            amountdetailsToUpdate.setEndtenor(updatedAmountDetails.getEndtenor());
            amountdetailsToUpdate.setEffectivedate(updatedAmountDetails.getEffectivedate());


            
 
            amountservice.updateamountdetails(amountdetailsToUpdate);
            return ResponseEntity.ok("Cash handling entry updated successfully.");
        } else {
            return ResponseEntity.ok("Table not having this Id");
        }
    }

 
    
    @DeleteMapping("/delete/{id}")
    public void deleteMountDetails(@PathVariable long id) {
    	amountservice.deleteamountdetails(id);
    }
}  
