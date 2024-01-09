package fr.sncf.d2d.colibri.colis.usecases;

public class CreateColisParam {

    private final String address;
    private final String email;
    private final String details;
    private final String deliveryPersonId;

    private CreateColisParam(CreateColisParamBuilder createColisParamBuilder) {
        this.address = createColisParamBuilder.address;
        this.email = createColisParamBuilder.email;
        this.details = createColisParamBuilder.details;
        this.deliveryPersonId = createColisParamBuilder.deliveryPersonId;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getDetails() {
        return details;
    }

    public String getDeliveryPersonId() {
        return deliveryPersonId;
    }

    @Override
    public String toString() {
        return "CreateColisParam: " + this.address + "," + this.email + ", " + this.details + ", " + this.deliveryPersonId;
    }

    public static class CreateColisParamBuilder {
        private String address;
        private String email;
        private String details;
        private String deliveryPersonId;

        public CreateColisParamBuilder() {
        }

        public CreateColisParamBuilder email(String email) {
            this.email = email;
            return this;
        }

        public CreateColisParamBuilder address(String address) {
            this.address = address;
            return this;
        }

        public CreateColisParamBuilder details(String details) {
            this.details = details;
            return this;
        }

        public CreateColisParamBuilder deliveryPersonId(String deliveryPersonId) {
            this.deliveryPersonId = deliveryPersonId;
            return this;
        }

        public CreateColisParam build() {
            CreateColisParam createColisParam = new CreateColisParam(this);
            return createColisParam;
        }
    }
}
