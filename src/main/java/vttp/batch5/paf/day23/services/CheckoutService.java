package vttp.batch5.paf.day23.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vttp.batch5.paf.day23.repositories.PurchaseOrderRepository;

@Service
public class CheckoutService {
    
    @Autowired
    private PurchaseOrderRepository purchaseOrderRepository;
    
}
