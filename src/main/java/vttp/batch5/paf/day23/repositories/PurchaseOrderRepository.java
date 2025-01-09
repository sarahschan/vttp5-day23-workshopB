package vttp.batch5.paf.day23.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import vttp.batch5.paf.day23.model.LineItem;
import vttp.batch5.paf.day23.model.PurchaseOrder;

@Repository
public class PurchaseOrderRepository {
    
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void insertPurchaseOrder(PurchaseOrder purchaseOrder){
        
        jdbcTemplate.update(Queries.SQL_INSERT_PURCHASE_ORDER, 
                                purchaseOrder.getPoId(),
                                purchaseOrder.getName(),
                                purchaseOrder.getAddress(),
                                purchaseOrder.getDeliveryDate());

        List<LineItem> lineItems = purchaseOrder.getLineItems();
        
        for (LineItem lineItem : lineItems) {
            jdbcTemplate.update(Queries.SQL_INSERT_LINE_ITEM,
                                lineItem.getName(),
                                lineItem.getQuantity(),
                                lineItem.getUnitPrice(),
                                purchaseOrder.getPoId());
        }
    }
}
