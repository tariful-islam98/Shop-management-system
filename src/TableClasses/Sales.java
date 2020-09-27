package TableClasses;

import java.sql.Date;

public class Sales {
    private int productId;
    private int quantity;
    private int totalPrice;
    private int customerId;
    private Date date;

    public Sales() {
    }

    public Sales(int productId, int quantity, int totalPrice, int customerId, Date date) {
        this.productId = productId;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
        this.customerId = customerId;
        this.date = date;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Sales{" + "productId=" + productId + ", quantity=" + quantity + ", totalPrice=" + totalPrice + ", customerId=" + customerId + ", date=" + date + '}';
    }
    
}
