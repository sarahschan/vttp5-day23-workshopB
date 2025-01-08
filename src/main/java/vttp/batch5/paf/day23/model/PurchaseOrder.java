package vttp.batch5.paf.day23.model;

import java.time.LocalDate;
import java.util.List;

public class PurchaseOrder {
    
    private String poId;
    private String name;
    private String address;
    private LocalDate deliveryDate;
    private List<LineItem> lineItems;


    public PurchaseOrder() {
    }

    public PurchaseOrder(String poId, String name, String address, LocalDate deliveryDate, List<LineItem> lineItems) {
        this.poId = poId;
        this.name = name;
        this.address = address;
        this.deliveryDate = deliveryDate;
        this.lineItems = lineItems;
    }


    public String getPoId() {
        return poId;
    }
    public void setPoId(String poId) {
        this.poId = poId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }
    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }
    public List<LineItem> getLineItems() {
        return lineItems;
    }
    public void setLineItems(List<LineItem> lineItems) {
        this.lineItems = lineItems;
    }

}
