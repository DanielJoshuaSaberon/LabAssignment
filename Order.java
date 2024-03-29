package Seatwork;
    public class Order {
        private String item;
        private Integer quantity;
        private Double unitPrice;
        private Double totalAmount;
        private paymentMode specific;

        public Order(String item, int quantity, double unitPrice,paymentMode specific) {
            this.item = item;
            this.quantity = quantity;
            this.unitPrice = unitPrice;
            this.specific = specific;
        }

        //setters
        public void setItem(String item) {
            this.item = item;
        }
        public void setQuantity(Integer quantity) {
            this.quantity = quantity;
        }
        public void setUnitPrice(Double unitPrice) {
            this.unitPrice = unitPrice;
        }
        public void setSpecific(paymentMode specific) {
            this.specific = specific;
        }

        public void setTotalAmount() {
            double total = quantity * unitPrice;
            totalAmount = total - (total * getSpecific().determineDiscountRate());
        }


        //getters
        public String getItem() {
            return item;
        }
        public Integer getQuantity() {
            return quantity;
        }
        public Double getUnitPrice() {
            return unitPrice;
        }
        public Double getTotalAmount() {
            return totalAmount;
        }
        public paymentMode getSpecific() {
            return specific;
        }
    }