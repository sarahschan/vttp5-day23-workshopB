package vttp.batch5.paf.day23.model;

public class LineItem {
    
    private Integer id;
    private String name;
    private int quantity;
    private float unitPrice;
    private String poId;


    public LineItem() {
    }

    public LineItem(String name, int quantity, float unitPrice, String poId) {
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.poId = poId;
    }


    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public float getUnitPrice() {
        return unitPrice;
    }
    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
    }
    public String getPoId() {
        return poId;
    }
    public void setPoId(String poId) {
        this.poId = poId;
    }

}