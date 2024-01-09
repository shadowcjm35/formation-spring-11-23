package fr.sncf.d2d.colibri.colis.models;


public class Colis {

    // TODO: create colis object
    private final String address;
    private String email;
    private String details;
    private final String deliveryPersonId;

    public Colis(String address, String deliveryPersonId) {
        this.address = address;
        this.deliveryPersonId = deliveryPersonId;
    }
}
