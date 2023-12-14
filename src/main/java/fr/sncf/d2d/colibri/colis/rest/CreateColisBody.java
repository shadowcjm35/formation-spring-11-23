package fr.sncf.d2d.colibri.colis.rest;

public class CreateColisBody {
    
    private String address;

    private String email;

    private String details;

    private String deliveryPersonId;

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String adress) {
        this.address = adress;
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

    @Override
    public String toString(){
        return String.format(
            "address=%s",
            this.address
        );
    }
    
}
