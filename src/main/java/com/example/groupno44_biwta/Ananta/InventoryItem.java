package com.example.groupno44_biwta.Ananta;

import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;

public class InventoryItem {
    private  String itemId;
    private  String itemName;
    private  int quantity;
    private  String category;
    private  String location;
    private LocalDate expiryDate;
    private  String description;

    public InventoryItem(String itemId, String itemName, int quantity, String category, String location, LocalDate expiryDate, String description) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.quantity = quantity;
        this.category = category;
        this.location = location;
        this.expiryDate = expiryDate;
        this.description = description;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "InventoryItem{" +
                "itemId='" + itemId + '\'' +
                ", itemName='" + itemName + '\'' +
                ", quantity=" + quantity +
                ", category='" + category + '\'' +
                ", location='" + location + '\'' +
                ", expiryDate=" + expiryDate +
                ", description='" + description + '\'' +
                '}';
    }
}
