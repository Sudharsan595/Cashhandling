//package sis.hfs.cashhandling.controller;
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import sis.hfs.cashhandling.model.Cashhandling;
//import sis.hfs.cashhandling.service.CashhandlingService;
//
//@RestController
//@CrossOrigin("http://localhost:3000")
//@RequestMapping("/cashhandling")
//public class CashhandlingController {
//	@Autowired
//	public CashhandlingService cashhandlingservice;
//	
//	@PostMapping("/savecash")
//	public Cashhandling savecashhandling(@RequestBody Cashhandling cashhandling) {
//		return cashhandlingservice.savecashhandling(cashhandling);
//	}
//	@GetMapping("/getallcash")
//	public List<Cashhandling>getAllCashhandlings(){
//		return cashhandlingservice.getAllCashhandling();
//	}
//	@GetMapping("/getcash/{id}")
//	public Optional<Cashhandling>getCashhandlingById(@PathVariable long id){
//		return cashhandlingservice.getcashhandlingById(id);
//	}// the entered all values save in backend
//	@PutMapping("/updatecash")
//	public Cashhandling updatecashhandling(@RequestBody Cashhandling cashhandling) {
//		return cashhandlingservice.updatecashandlingById(cashhandling);
//	}
//	@PutMapping("/updatecash/{id}")
//    public ResponseEntity<String> updateCashhandlingById(@PathVariable long id, @RequestBody Cashhandling updatecashhandling) {
//	Optional<Cashhandling>existingCashhandling = cashhandlingservice.getcashhandlingById(id);
//	if (existingCashhandling.isPresent()) {
//	Cashhandling cashhandlingToUpdate = existingCashhandling.get();	
//	cashhandlingToUpdate.setFeestype(updatecashhandling.getFeestype());
//	cashhandlingToUpdate.setResttype(updatecashhandling.getResttype());
//	cashhandlingToUpdate.setRatetype(updatecashhandling.getRatetype());
//  	cashhandlingToUpdate.setStarttenor(updatecashhandling.getStarttenor());
//	cashhandlingToUpdate.setEndtenor(updatecashhandling.getEndtenor());
//	cashhandlingservice.updatecashhandling(cashhandlingToUpdate);
//	  return ResponseEntity.ok("Cash handling entry updated successfully.");
//    } else {
//        return ResponseEntity.ok("Table not having this Id");
//    }}
//	
//    @DeleteMapping("/deletecash/{id}")
//    public void deleteCashhandling(@PathVariable long id) {
//    cashhandlingservice.deleteById(id);
//    }
//
//}
