package vttp.batch5.paf.day23.repositories;

public class Queries {
    
    public static final String SQL_INSERT_PURCHASE_ORDER = 
        """
            INSERT INTO purchase_orders 
                (po_id, name, address, delivery_date)
            VALUES 
                (?, ?, ?, ?)
        """;

    public static final String SQL_INSERT_LINE_ITEM = 
        """
            INSERT INTO line_items
                (name, quantity, unit_price, po_id)
            VALUES
                (?, ?, ?, ?)        
        """;
}
