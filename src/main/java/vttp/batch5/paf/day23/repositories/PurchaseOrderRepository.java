package vttp.batch5.paf.day23.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PurchaseOrderRepository {
    
    @Autowired
    private JdbcTemplate jdbcTemplate;


}
