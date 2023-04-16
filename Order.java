import java.sql.Date;
import java.util.List;

public class Order {
    private int orderId;
    private Customer customer;
    private List<Product> productList;
    private double shippingFee;
    private double discount;
    private double totalPrice;
    private Date orderDate;

    // constructors
    public Order(int orderId, Customer customer, List<Product> productList, double shippingFee, double discount, double totalPrice, Date orderDate) {
        this.orderId = orderId;
        this.customer = customer;
        this.productList = productList;
        this.shippingFee = shippingFee;
        this.discount = discount;
        this.totalPrice = totalPrice;
        this.orderDate = orderDate;
    }

    // getters and setters
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public double getShippingFee() {
        return shippingFee;
    }

    public void setShippingFee(double shippingFee) {
        this.shippingFee = shippingFee;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
}