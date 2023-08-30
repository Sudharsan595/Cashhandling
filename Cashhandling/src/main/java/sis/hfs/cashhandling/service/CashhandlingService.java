//package sis.hfs.cashhandling.service;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import sis.hfs.cashhandling.model.Cashhandling;
//import sis.hfs.cashhandling.repository.CashhandlingRepository;
//
//@Service
//public class CashhandlingService {
//@Autowired
//private CashhandlingRepository cashhandlingrepo;
//
//public Cashhandling savecashhandling(Cashhandling cashhandling) {
//	return cashhandlingrepo.save(cashhandling);
//}
//public List<Cashhandling>getAllCashhandling(){
//	return cashhandlingrepo.findAll();
//}
//public Optional<Cashhandling>getcashhandlingById(long id){
//	return cashhandlingrepo.findById(id);
//}
//public Cashhandling updatecashhandling(Cashhandling cashhandling) {
//return cashhandlingrepo.save(cashhandling);	
//}
//public Cashhandling updatecashandlingById(Cashhandling cashhandling) {
//return cashhandlingrepo.save(cashhandling);	
//}
//public  void deleteById (long id) {
//	cashhandlingrepo.deleteById(id);
//}
//
//}
