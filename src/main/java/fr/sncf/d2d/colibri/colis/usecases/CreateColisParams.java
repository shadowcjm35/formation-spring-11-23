package fr.sncf.d2d.colibri.colis.usecases;

public class CreateColisParams {
    
    private String address;

    private String email;

    private String details;

    private String deliveryPersonId;

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDetails() {
        return this.details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getDeliveryPersonId() {
        return this.deliveryPersonId;
    }

    public void setDeliveryPersonId(String deliveryPersonId) {
        this.deliveryPersonId = deliveryPersonId;
    }

    
}
