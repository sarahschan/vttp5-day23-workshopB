package vttp.batch5.paf.day23.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import vttp.batch5.paf.day23.model.PurchaseOrder;
import vttp.batch5.paf.day23.services.CheckoutService;
import vttp.batch5.paf.day23.services.ProcessJsonService;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping()
public class MainRestController {
    
    @Autowired
    ProcessJsonService processJsonService;

    @Autowired
    CheckoutService checkoutService;


    // found from inspect:
    //  Request Method: PUT
    //  Request URL: http://localhost:8080/api/purchaseorder
    //  Content-Type: application/json (what you should be consuming aka recieving from the client)
    //  Accept: application/json (what you should be producing aka sending back to the client)


    @PutMapping(path = "/api/purchaseorder", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> processCheckout(@RequestBody String payload) {
        
        PurchaseOrder po = processJsonService.processPayload(payload);
        return null;
    }
}
