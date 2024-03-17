package seedu.stockpal.data.product;

import seedu.stockpal.exceptions.InsufficientAmountException;
import seedu.stockpal.ui.Ui;

public class Product {
    protected Name name;
    protected Quantity quantity;
    protected Price price;
    protected Description description;
    protected Pid pid;

    public Product(String name, Integer quantity, Double price, String description, Integer pid) {
        this.name = new Name(name);
        this.quantity = new Quantity(quantity);
        this.price = new Price(price);
        this.description = new Description(description);
        this.pid = new Pid(pid);
    }
    public Name getProductName() {
        return this.name;
    }
    public Quantity getProductQuantity() {
        return this.quantity;
    }

    public Price getProductPrice() {
        return this.price;
    }

    public Description getProductDescription() {
        return this.description;
    }
    public Pid getProductPid() {
        return this.pid;
    }


    public Name getName() {
        return this.name;
    }

    public Quantity getQuantity() {
        return this.quantity;
    }

    public Price getPrice() {
        return this.price;
    }

    public Description getDescription() {
        return this.description;
    }

    public Pid getPid() {
        return this.pid;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public void setQuantity(Quantity quantity) {
        this.quantity = quantity;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public void setDescription(Description description) {
        this.description = description;
    }

    public boolean isPidMatch(Pid pid) {
        return this.pid.equals(pid);
    }

    public void increaseQuantity(Integer amountToChange) {
        quantity.updateIncreaseQuantity(amountToChange);
    }

    public void decreaseQuantity(Integer amountToChange) {
        try {
            quantity.updateDecreaseQuantity(amountToChange);
        } catch (InsufficientAmountException e) {
            Ui.printToScreen("Insufficient amount in inventory. Amount in inventory: " + quantity);
        }
    }

    @Override
    public String toString() {
        return "" + this.name;
    }
}
